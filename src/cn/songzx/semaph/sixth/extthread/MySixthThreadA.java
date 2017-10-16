/**   
* @Title: MySixthThreadA.java 
* @Package cn.songzx.semaph.sixth.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��16�� ����9:52:41 
* @version V1.0   
*/
package cn.songzx.semaph.sixth.extthread;

import cn.songzx.semaph.sixth.tools.MySixthListPool;

/**
 * @ClassName: MySixthThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��16�� ����9:52:41
 * 
 */
public class MySixthThreadA extends Thread {
	private MySixthListPool listPool;

	/**
	 * @Date: 2017��10��16������9:53:12
	 * @Title: MySixthThreadA.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param listPool
	 */
	public MySixthThreadA(MySixthListPool listPool) {
		super();
		this.listPool = listPool;
	}

	/**
	 * 
	 * @Date: 2017��10��16������9:58:20
	 * @Title: run
	 * @Description: TODO(������һ�仰�����������������)
	 * @return ����ֵ����
	 */
	public void run() {
		/*
		 * ��Semaphore������Ч�����Ʋ���ִ����������������ֹ��ܿ���Ӧ����pool�ؼ����У���������ͬʱ����pool�������ݵ��߳�����
		 * 
		 * ��ʵ��Ĺ�����ͬʱ�����ɸ��߳̿��Է��ʳ��е����ݣ���ͬʱֻ��һ���߳̿���ȡ�����ݣ�ʹ����Ϻ��ٷŻس���
		 */
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			String getString = listPool.get();
			System.out.println(Thread.currentThread().getName() + " ȡ��ֵ " + getString);
			listPool.put(getString);
		}
	}
}
