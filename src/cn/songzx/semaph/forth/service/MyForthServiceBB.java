/**   
* @Title: MyForthServiceBB.java 
* @Package cn.songzx.semaph.forth.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����7:22:22 
* @version V1.0   
*/
package cn.songzx.semaph.forth.service;

import java.util.concurrent.Semaphore;

/**
 * @ClassName: MyForthServiceBB
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����7:22:22
 * 
 */
public class MyForthServiceBB {
	private Semaphore semaphore = new Semaphore(3);

	public void testMehtodBB() {
		/*
		 * �вη���tryAcquire(int permits)�������ǳ��Եػ��x����ɣ������ȡ�����򷵻�false
		 */
		if (semaphore.tryAcquire(3)) {
			System.out.println("ThreadName=" + Thread.currentThread().getName() + "����ѡ���룡");
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				String newString = new String();
				Math.random();
			}
			semaphore.release(3);// ����release��Ӧ��permitsֵҲҪ����
		} else {
			System.out.println("ThreadName=" + Thread.currentThread().getName() + "δ�ɹ����룡");
		}
	}
}
