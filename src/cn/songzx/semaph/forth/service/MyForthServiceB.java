/**   
* @Title: MyForthServiceB.java 
* @Package cn.songzx.semaph.forth.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����7:03:21 
* @version V1.0   
*/
package cn.songzx.semaph.forth.service;

import java.util.concurrent.Semaphore;

/**
 * @ClassName: MyForthServiceB
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����7:03:21
 * 
 */
public class MyForthServiceB {
	private Semaphore semaphore = new Semaphore(1);

	public void testMethodB() {
		/*
		 * �޲η���tryAcquire()�������ǳ��Եػ��һ����ɣ������ȡ�����򷵻�false���˷���ͨ����if���
		 * 
		 * ���ʹ�ã���������������ص㡣���������ص����ʹ�̲߳�������ͬ����һֱ�����ȴ���״̬�����if���
		 * 
		 * �ж����������̻߳������else��䣬���������������С�
		 */
		if (semaphore.tryAcquire()) {
			System.out.println("ThreadName=" + Thread.currentThread().getName() + "����ѡ���룡");
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				String newString = new String();
				Math.random();
			}
			semaphore.release();
		} else {
			System.out.println("ThreadName=" + Thread.currentThread().getName() + "δ�ɹ����룡");
		}
	}


}
