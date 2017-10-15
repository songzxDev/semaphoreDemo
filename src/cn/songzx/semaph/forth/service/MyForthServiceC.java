/**   

* @Title: MyForthServiceC.java 
* @Package cn.songzx.semaph.forth.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午7:24:59 
* @version V1.0   
*/
package cn.songzx.semaph.forth.service;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: MyForthServiceC
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午7:24:59
 * 
 */
public class MyForthServiceC {

	private Semaphore semaphore = new Semaphore(1);

	public void testMehtodC() {
		try {
			/*
			 * 有参方法tryAcquire(long timeOut,TimeUnit unit)的作用是指定时间内
			 * 
			 * 尝试地获得1个许可，如果获取不到则返回false
			 */
			if (semaphore.tryAcquire(3, TimeUnit.SECONDS)) {
				System.out.println("ThreadName=" + Thread.currentThread().getName() + "☆首选进入！");
				for (int i = 0; i < Integer.MAX_VALUE; i++) {
					String newString = new String();
					Math.random();
				}
				semaphore.release();// 方法release对应的permits值也要更改
			} else {
				System.out.println("ThreadName=" + Thread.currentThread().getName() + "未成功进入！");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
