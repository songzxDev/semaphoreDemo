/**   
* @Title: MyFirstService.java 
* @Package cn.songzx.semaph.first.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����11:59:16 
* @version V1.0   
*/
package cn.songzx.semaph.first.service;

import java.util.concurrent.Semaphore;

/**
 * @ClassName: MyFirstService
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����11:59:16
 * 
 */
public class MyFirstServiceA {
	/*
	 * ��Semaphore�Ĺ��캯��permits����ɵ���˼������ͬһ��ʱ���ڣ�
	 * 
	 * ���������ٸ��߳�ͬʱִ��acquire()��release()֮��Ĵ���
	 * 
	 */
	private Semaphore semaphore = new Semaphore(1);

	public void testMethodA() {
		try {
			semaphore.acquire();// ʹ��һ����ɣ��Ǽ�������
			System.out.println(Thread.currentThread().getName() + " begin timer=" + System.currentTimeMillis());
			Thread.sleep(3000L);
			System.out.println(Thread.currentThread().getName() + "   end timer=" + System.currentTimeMillis());
			semaphore.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
