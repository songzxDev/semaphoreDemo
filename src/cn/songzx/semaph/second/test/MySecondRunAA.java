/**   
* @Title: MySecondRunAA.java 
* @Package cn.songzx.semaph.second.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����1:44:53 
* @version V1.0   
*/
package cn.songzx.semaph.second.test;

import java.util.concurrent.Semaphore;

/**
 * @ClassName: MySecondRunAA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����1:44:53
 * 
 */
public class MySecondRunAA {

	/**
	 * @Date: 2017��10��15������1:44:53
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		try {
			/*
			 * �������new Semaphore(5);�е�5���������յ���������������ǳ�ʼ��״ֵ̬��
			 */
			Semaphore semaphore = new Semaphore(5);
			semaphore.acquire();
			semaphore.acquire();
			semaphore.acquire();
			semaphore.acquire();
			semaphore.acquire();
			System.out.println(semaphore.availablePermits());
			semaphore.release();
			semaphore.release();
			semaphore.release();
			semaphore.release();
			semaphore.release();
			semaphore.release();
			System.out.println(semaphore.availablePermits());
			semaphore.release(4);
			System.out.println(semaphore.availablePermits());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
