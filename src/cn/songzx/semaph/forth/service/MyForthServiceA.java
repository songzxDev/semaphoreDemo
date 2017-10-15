/**   
* @Title: MyForthServiceA.java 
* @Package cn.songzx.semaph.forth.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午6:40:31 
* @version V1.0   
*/
package cn.songzx.semaph.forth.service;

import java.util.concurrent.Semaphore;

/**
 * @ClassName: MyForthServiceA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午6:40:31
 * 
 */
public class MyForthServiceA {

	/**
	 * 获得许可的顺序与线程的启动顺序有关，这时信号量就要分为公平和非公平的。
	 * 所谓公平信号量是获得锁的顺序与线程的启动的顺序有关，但不代表100%获得信号量，仅仅是 在概率上能得到保证。 
	 * 而非公平信号量就是无关的了。
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
