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

/**
 * @ClassName: MyFifthServiceA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��16�� ����9:02:53
 * 
 */
public class MyFifthServiceA {
	private Semaphore semaphore = new Semaphore(3);

	/**
	 * 
	 * @Date: 2017��10��16������9:13:38
	 * @Title: sayHello
	 * @Description: TODO(���·-�ദ��-���·ʵ��)
	 * @return void ����ֵ����
	 */
	public void sayHello() {
		try {
			/*
			 * ��ʵ�ֵ�Ŀ�����������߳�ͬʱ�������񣬸�����������Ҳ����ÿ���̶߳��ڴ����Լ�������
			 */
			semaphore.acquire();
			System.out.println("ThreadName=" + Thread.currentThread().getName() + "׼����");
			System.out.println("begin hello " + System.currentTimeMillis());
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + "��ӡ" + (i + 1));
			}
			System.out.println("  end hello " + System.currentTimeMillis());
			semaphore.release();
			System.out.println("ThreadName=" + Thread.currentThread().getName() + "������");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
