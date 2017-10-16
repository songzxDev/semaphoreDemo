/**   
* @Title: MySixthThreadA.java 
* @Package cn.songzx.semaph.sixth.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月16日 下午9:52:41 
* @version V1.0   
*/
package cn.songzx.semaph.sixth.extthread;

import cn.songzx.semaph.sixth.tools.MySixthListPool;

/**
 * @ClassName: MySixthThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月16日 下午9:52:41
 * 
 */
public class MySixthThreadA extends Thread {
	private MySixthListPool listPool;

	/**
	 * @Date: 2017年10月16日下午9:53:12
	 * @Title: MySixthThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param listPool
	 */
	public MySixthThreadA(MySixthListPool listPool) {
		super();
		this.listPool = listPool;
	}

	/**
	 * 
	 * @Date: 2017年10月16日下午9:58:20
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	public void run() {
		/*
		 * 类Semaphore可以有效的限制并发执行任务的数量，这种功能可以应用在pool池技术中，可以设置同时访问pool池中数据的线程数量
		 * 
		 * 本实验的功能是同时有若干个线程可以访问池中的数据，但同时只有一个线程可以取得数据，使用完毕后再放回池中
		 */
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			String getString = listPool.get();
			System.out.println(Thread.currentThread().getName() + " 取得值 " + getString);
			listPool.put(getString);
		}
	}
}
