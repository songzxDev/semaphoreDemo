/**   
* @Title: MySecondRunA.java 
* @Package cn.songzx.semaph.second.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����12:35:41 
* @version V1.0   
*/
package cn.songzx.semaph.second.test;

import cn.songzx.semaph.second.extthread.MySecondThreadA;
import cn.songzx.semaph.second.service.MySecondServiceA;

/**
 * @ClassName: MySecondRunA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����12:35:41
 * 
 */
public class MySecondRunA {

	/**
	 * @Date: 2017��10��15������12:35:41
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		/*
		 * �ܹ���10����ɣ�ÿ��ִ��semaphore.acquire(2);����ʱ���ĵ�2��������10/2=5��˵��ͬһʱ��ֻ��5���߳�
		 * 
		 * ����ִ��acquire()��release()֮��Ĵ��룬�����ε���Semaphore���release()
		 * 
		 * ��release(int)����ʱ�����Զ�̬����permits��Ŀ
		 */
		MySecondServiceA service = new MySecondServiceA();
		MySecondThreadA[] threads = new MySecondThreadA[10];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new MySecondThreadA(service);
			threads[i].start();
		}
	}

}
