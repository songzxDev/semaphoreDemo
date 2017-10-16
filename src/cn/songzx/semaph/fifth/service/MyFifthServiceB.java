/**   
* @Title: MyFifthServiceA.java 
* @Package cn.songzx.semaph.fifth.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��16�� ����9:02:53 
* @version V1.0   
*/
package cn.songzx.semaph.fifth.service;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: MyFifthServiceA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��16�� ����9:02:53
 * 
 */
public class MyFifthServiceB {
	private Semaphore semaphore = new Semaphore(3);

	/**
	 * �����м���ReentrantLock���󣬱�֤��ͬ����
	 */
	private ReentrantLock lock = new ReentrantLock();

	/**
	 * 
	 * @Date: 2017��10��16������9:13:38
	 * @Title: sayHello
	 * @Description: TODO(���·-������-���·ʵ��)
	 * @return void ����ֵ����
	 */
	public void sayHello() {
		try {
			/*
			 * ��ʵ�ֵ�Ŀ�����������߳�ͬʱ�������񣬵�ִ�������˳��ȴ��ͬ���ģ�Ҳ��������ʽ�ģ�����Ҳ�Ƶ�����
			 */
			semaphore.acquire();
			System.out.println("ThreadName=" + Thread.currentThread().getName() + "׼����");
			// ����������ʵ��ͬ�������Դ�ӡЧ������1,2,3,4,5������˳��
			lock.lock();
			System.out.println("begin hello " + System.currentTimeMillis());
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + "��ӡ" + (i + 1));
			}
			System.out.println("  end hello " + System.currentTimeMillis());
			lock.unlock();
			semaphore.release();
			System.out.println("ThreadName=" + Thread.currentThread().getName() + "������");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
