/**   
* @Title: MyForthServiceA.java 
* @Package cn.songzx.semaph.forth.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����6:40:31 
* @version V1.0   
*/
package cn.songzx.semaph.forth.service;

import java.util.concurrent.Semaphore;

/**
 * @ClassName: MyForthServiceA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����6:40:31
 * 
 */
public class MyForthServiceA {

	/**
	 * �����ɵ�˳�����̵߳�����˳���йأ���ʱ�ź�����Ҫ��Ϊ��ƽ�ͷǹ�ƽ�ġ�
	 * ��ν��ƽ�ź����ǻ������˳�����̵߳�������˳���йأ���������100%����ź����������� �ڸ������ܵõ���֤�� 
	 * ���ǹ�ƽ�ź��������޹ص��ˡ�
	 */
	// private boolean isFair = false;
	private boolean isFair = true;
	private Semaphore semaphore = new Semaphore(1, isFair);

	public void testMethodA() {
		try {
			semaphore.acquire();
			System.out.println("ThreadName=" + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaphore.release();
		}
	}
}
