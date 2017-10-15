/**   
* @Title: MyThirdServiceC.java 
* @Package cn.songzx.semaph.third.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����5:48:01 
* @version V1.0   
*/
package cn.songzx.semaph.third.service;

import java.util.concurrent.Semaphore;

/**
 * @ClassName: MyThirdServiceC
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����5:48:01
 * 
 */
public class MyThirdServiceC {

	private Semaphore semaphore = new Semaphore(1);

	public void testMethodC() {
		try {
			semaphore.acquire();
			Thread.sleep(1000L);
			// getQueueLength()��������ȡ�õȴ���ɵ��̸߳���
			System.out.println("���д�Լ��" + semaphore.getQueueLength() + "���߳��ڵȴ���");
			// hasQueueThreads()���������ж���û���߳��ڵȴ�������
			System.out.println(" �Ƿ����߳����ڵȴ��ź����أ� " + semaphore.hasQueuedThreads());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaphore.release();
		}
	}
}
