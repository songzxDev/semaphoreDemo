/**   
* @Title: MyForthServiceD.java 
* @Package cn.songzx.semaph.forth.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����7:34:38 
* @version V1.0   
*/
package cn.songzx.semaph.forth.service;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: MyForthServiceD
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����7:34:38
 * 
 */
public class MyForthServiceD {
	private Semaphore semaphore = new Semaphore(3);

	public void testMethodD() {
		try {
			// �вη���tryAcquire(int permits,long timeout,TimeUnit unit)��������
			// ��ָ����ʱ���ڳ��Եػ��x����ɣ������ȡ�����򷵻�false
			if (semaphore.tryAcquire(3, 3, TimeUnit.SECONDS)) {
				System.out.println("ThreadName=" + Thread.currentThread().getName() + "����ѡ���룡");
				for (int i = 0; i < Integer.MAX_VALUE; i++) {
					String newString = new String();
					Math.random();
				}
				semaphore.release(3);// ����release��Ӧ��permitsֵҲҪ��
			} else {
				System.out.println("ThreadName=" + Thread.currentThread().getName() + "δ�ɹ����룡");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
