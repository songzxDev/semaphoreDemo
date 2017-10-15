/**   
* @Title: MyThirdServiceA.java 
* @Package cn.songzx.semaph.third.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����2:39:21 
* @version V1.0   
*/
package cn.songzx.semaph.third.service;

import java.util.concurrent.Semaphore;

/**
 * @ClassName: MyThirdServiceA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����2:39:21
 * 
 */
public class MyThirdServiceA {

	private Semaphore semaphore = new Semaphore(1);

	public void testMethodA() {
		try {
			// semaphore.acquire();
			/*
			 * acquireUninterruptibly()�����������ص�д��
			 * 
			 * acquireUninterruptibly(intpermits),
			 * 
			 * �˷������������ڵȴ���ɵ�����²������жϣ�����ɹ����������ȡ��ָ����permits��ɸ�����
			 */
			semaphore.acquireUninterruptibly();
			System.out.println(Thread.currentThread().getName() + " begin timer=" + System.currentTimeMillis());
			for (int i = 0; i < Integer.MAX_VALUE / 50; i++) {
				String newString = new String();
				Math.random();
			}
			System.out.println(Thread.currentThread().getName() + "   end timer=" + System.currentTimeMillis());
			semaphore.release();
		} catch (Exception e) {
			System.out.println("�߳�" + Thread.currentThread().getName() + "������catch��");
			e.printStackTrace();
		}
	}
}
