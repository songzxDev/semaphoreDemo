/**   
* @Title: MySecondServiceA.java 
* @Package cn.songzx.semaph.second 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����12:24:59 
* @version V1.0   
*/
package cn.songzx.semaph.second.service;

import java.util.concurrent.Semaphore;

/**
 * @ClassName: MySecondServiceA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����12:24:59
 * 
 */
public class MySecondServiceA {
	private Semaphore semaphore = new Semaphore(10);

	public void testMethodA() {
		try {
			semaphore.acquire(2);// �вη���acquire(int permits)�Ĺ�����ÿ����һ�δ˷���������x�����
			System.out.println(Thread.currentThread().getName() + " begin timer=" + System.currentTimeMillis());
			int sleepValue = ((int) (Math.random() * 10000));
			System.out.println(Thread.currentThread().getName() + " ֹͣ��" + (sleepValue / 1000) + "��");
			Thread.sleep(sleepValue);
			System.out.println(Thread.currentThread().getName() + "   end timer=" + System.currentTimeMillis());
			semaphore.release(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
