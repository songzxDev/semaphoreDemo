/**   

* @Title: MyForthServiceC.java 
* @Package cn.songzx.semaph.forth.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����7:24:59 
* @version V1.0   
*/
package cn.songzx.semaph.forth.service;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: MyForthServiceC
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����7:24:59
 * 
 */
public class MyForthServiceC {

	private Semaphore semaphore = new Semaphore(1);

	public void testMehtodC() {
		try {
			/*
			 * �вη���tryAcquire(long timeOut,TimeUnit unit)��������ָ��ʱ����
			 * 
			 * ���Եػ��1����ɣ������ȡ�����򷵻�false
			 */
			if (semaphore.tryAcquire(3, TimeUnit.SECONDS)) {
				System.out.println("ThreadName=" + Thread.currentThread().getName() + "����ѡ���룡");
				for (int i = 0; i < Integer.MAX_VALUE; i++) {
					String newString = new String();
					Math.random();
				}
				semaphore.release();// ����release��Ӧ��permitsֵҲҪ����
			} else {
				System.out.println("ThreadName=" + Thread.currentThread().getName() + "δ�ɹ����룡");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
