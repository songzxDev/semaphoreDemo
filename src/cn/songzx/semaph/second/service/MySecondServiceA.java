/**   
* @Title: MySecondServiceA.java 
* @Package cn.songzx.semaph.second 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午12:24:59 
* @version V1.0   
*/
package cn.songzx.semaph.second.service;

import java.util.concurrent.Semaphore;

/**
 * @ClassName: MySecondServiceA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午12:24:59
 * 
 */
public class MySecondServiceA {
	private Semaphore semaphore = new Semaphore(10);

	public void testMethodA() {
		try {
			semaphore.acquire(2);// 有参方法acquire(int permits)的功能是每调用一次此方法就是用x个许可
			System.out.println(Thread.currentThread().getName() + " begin timer=" + System.currentTimeMillis());
			int sleepValue = ((int) (Math.random() * 10000));
			System.out.println(Thread.currentThread().getName() + " 停止了" + (sleepValue / 1000) + "秒");
			Thread.sleep(sleepValue);
			System.out.println(Thread.currentThread().getName() + "   end timer=" + System.currentTimeMillis());
			semaphore.release(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
