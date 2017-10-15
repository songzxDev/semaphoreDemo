/**   
* @Title: MyThirdServiceB.java 
* @Package cn.songzx.semaph.third.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����5:36:55 
* @version V1.0   
*/
package cn.songzx.semaph.third.service;

import java.util.concurrent.Semaphore;

/**
 * @ClassName: MyThirdServiceB
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����5:36:55
 * 
 */
public class MyThirdServiceB {

	private Semaphore semaphore = new Semaphore(10);

	public void testMethodB() {
		try {
			semaphore.acquire();
			/*
			 * availablePermits()���ش�Semaphore�����е�ǰ���õ������Ŀ���˷���ͨ�����ڵ��ԣ�
			 * 
			 * ��Ϊ�����Ŀ�п���ʵʱ�ڸı䣬�����ǹ̶�������
			 */
			System.out.println(semaphore.availablePermits());// ��Ч���������
			// drainPermits()�ɻ�ȡ�������������õ�������ɸ��������ҽ����������Ŀ��0
			System.out.println(semaphore.drainPermits() + "����������" + semaphore.availablePermits());
			System.out.println(semaphore.drainPermits() + "����������" + semaphore.availablePermits());
			System.out.println(semaphore.drainPermits() + "����������" + semaphore.availablePermits());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaphore.release();
		}
	}
}
