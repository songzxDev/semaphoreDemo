/**   
* @Title: MySixthRunA.java 
* @Package cn.songzx.semaph.sixth.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��16�� ����9:54:58 
* @version V1.0   
*/
package cn.songzx.semaph.sixth.test;

import cn.songzx.semaph.sixth.extthread.MySixthThreadA;
import cn.songzx.semaph.sixth.tools.MySixthListPool;

/**
 * @ClassName: MySixthRunA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��16�� ����9:54:58
 * 
 */
public class MySixthRunA {

	/**
	 * @Date: 2017��10��16������9:54:58
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		/*
		 * ��Semaphore������Ч�����Ʋ���ִ����������������ֹ��ܿ���Ӧ����pool�ؼ����У���������ͬʱ����pool�������ݵ��߳�����
		 * 
		 * ��ʵ��Ĺ�����ͬʱ�����ɸ��߳̿��Է��ʳ��е����ݣ���ͬʱֻ��һ���߳̿���ȡ�����ݣ�ʹ����Ϻ��ٷŻس���
		 */
		MySixthListPool listPool = new MySixthListPool();
		MySixthThreadA[] threadArray = new MySixthThreadA[12];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MySixthThreadA(listPool);
		}
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i].start();
		}
	}

}
