/**   
* @Title: MyThirdServiceC.java 
* @Package cn.songzx.semaph.third.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午5:48:01 
* @version V1.0   
*/
package cn.songzx.semaph.third.service;

import java.util.concurrent.Semaphore;

/**
 * @ClassName: MyThirdServiceC
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午5:48:01
 * 
 */
public class MyThirdServiceC {

	private Semaphore semaphore = new Semaphore(1);

	public void testMethodC() {
		try {
			semaphore.acquire();
			Thread.sleep(1000L);
			// getQueueLength()的作用是取得等待许可的线程个数
			System.out.println("还有大约：" + semaphore.getQueueLength() + "个线程在等待！");
			// hasQueueThreads()的作用是判读有没有线程在等待这个许可
			System.out.println(" 是否有线程正在等待信号量呢？ " + semaphore.hasQueuedThreads());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaphore.release();
		}
	}
}
