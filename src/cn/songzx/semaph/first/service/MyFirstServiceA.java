/**   
* @Title: MyFirstService.java 
* @Package cn.songzx.semaph.first.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 上午11:59:16 
* @version V1.0   
*/
package cn.songzx.semaph.first.service;

import java.util.concurrent.Semaphore;

/**
 * @ClassName: MyFirstService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 上午11:59:16
 * 
 */
public class MyFirstServiceA {
	/*
	 * 类Semaphore的构造函数permits是许可的意思，代表同一个时间内，
	 * 
	 * 最多允许多少个线程同时执行acquire()和release()之间的代码
	 * 
	 */
	private Semaphore semaphore = new Semaphore(1);

	public void testMethodA() {
		try {
			semaphore.acquire();// 使用一个许可，是减法操作
			System.out.println(Thread.currentThread().getName() + " begin timer=" + System.currentTimeMillis());
			Thread.sleep(3000L);
			System.out.println(Thread.currentThread().getName() + "   end timer=" + System.currentTimeMillis());
			semaphore.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
