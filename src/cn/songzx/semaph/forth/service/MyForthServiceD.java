/**   
* @Title: MyForthServiceD.java 
* @Package cn.songzx.semaph.forth.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午7:34:38 
* @version V1.0   
*/
package cn.songzx.semaph.forth.service;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: MyForthServiceD
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午7:34:38
 * 
 */
public class MyForthServiceD {
	private Semaphore semaphore = new Semaphore(3);

	public void testMethodD() {
		try {
			// 有参方法tryAcquire(int permits,long timeout,TimeUnit unit)的作用是
			// 在指定的时间内尝试地获得x个许可，如果获取不到则返回false
			if (semaphore.tryAcquire(3, 3, TimeUnit.SECONDS)) {
				System.out.println("ThreadName=" + Thread.currentThread().getName() + "★首选进入！");
				for (int i = 0; i < Integer.MAX_VALUE; i++) {
					String newString = new String();
					Math.random();
				}
				semaphore.release(3);// 方法release对应的permits值也要改
			} else {
				System.out.println("ThreadName=" + Thread.currentThread().getName() + "未成功进入！");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
