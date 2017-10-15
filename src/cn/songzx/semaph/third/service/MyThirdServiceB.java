/**   
* @Title: MyThirdServiceB.java 
* @Package cn.songzx.semaph.third.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午5:36:55 
* @version V1.0   
*/
package cn.songzx.semaph.third.service;

import java.util.concurrent.Semaphore;

/**
 * @ClassName: MyThirdServiceB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午5:36:55
 * 
 */
public class MyThirdServiceB {

	private Semaphore semaphore = new Semaphore(10);

	public void testMethodB() {
		try {
			semaphore.acquire();
			/*
			 * availablePermits()返回此Semaphore对象中当前可用的许可数目，此方法通常用于调试，
			 * 
			 * 因为许可数目有可能实时在改变，并不是固定的数量
			 */
			System.out.println(semaphore.availablePermits());// 有效的许可数量
			// drainPermits()可获取并返回立即可用的所有许可个数，并且将可用许可数目置0
			System.out.println(semaphore.drainPermits() + "▲▲▲▲▲" + semaphore.availablePermits());
			System.out.println(semaphore.drainPermits() + "▲▲▲▲▲" + semaphore.availablePermits());
			System.out.println(semaphore.drainPermits() + "▲▲▲▲▲" + semaphore.availablePermits());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaphore.release();
		}
	}
}
