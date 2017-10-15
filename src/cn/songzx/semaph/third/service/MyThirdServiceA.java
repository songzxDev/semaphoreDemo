/**   
* @Title: MyThirdServiceA.java 
* @Package cn.songzx.semaph.third.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午2:39:21 
* @version V1.0   
*/
package cn.songzx.semaph.third.service;

import java.util.concurrent.Semaphore;

/**
 * @ClassName: MyThirdServiceA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午2:39:21
 * 
 */
public class MyThirdServiceA {

	private Semaphore semaphore = new Semaphore(1);

	public void testMethodA() {
		try {
			// semaphore.acquire();
			/*
			 * acquireUninterruptibly()方法还有重载的写法
			 * 
			 * acquireUninterruptibly(intpermits),
			 * 
			 * 此方法的作用是在等待许可的情况下不允许中断，如果成功获得锁，则取得指定的permits许可个数。
			 */
			semaphore.acquireUninterruptibly();
			System.out.println(Thread.currentThread().getName() + " begin timer=" + System.currentTimeMillis());
			for (int i = 0; i < Integer.MAX_VALUE / 50; i++) {
				String newString = new String();
				Math.random();
			}
			System.out.println(Thread.currentThread().getName() + "   end timer=" + System.currentTimeMillis());
			semaphore.release();
		} catch (Exception e) {
			System.out.println("线程" + Thread.currentThread().getName() + "进入了catch！");
			e.printStackTrace();
		}
	}
}
