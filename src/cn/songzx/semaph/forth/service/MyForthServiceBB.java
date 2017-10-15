/**   
* @Title: MyForthServiceBB.java 
* @Package cn.songzx.semaph.forth.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午7:22:22 
* @version V1.0   
*/
package cn.songzx.semaph.forth.service;

import java.util.concurrent.Semaphore;

/**
 * @ClassName: MyForthServiceBB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午7:22:22
 * 
 */
public class MyForthServiceBB {
	private Semaphore semaphore = new Semaphore(3);

	public void testMehtodBB() {
		/*
		 * 有参方法tryAcquire(int permits)的作用是尝试地获得x个许可，如果获取不到则返回false
		 */
		if (semaphore.tryAcquire(3)) {
			System.out.println("ThreadName=" + Thread.currentThread().getName() + "☆首选进入！");
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				String newString = new String();
				Math.random();
			}
			semaphore.release(3);// 方法release对应的permits值也要更改
		} else {
			System.out.println("ThreadName=" + Thread.currentThread().getName() + "未成功进入！");
		}
	}
}
