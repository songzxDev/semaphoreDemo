/**   
* @Title: MyForthServiceB.java 
* @Package cn.songzx.semaph.forth.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午7:03:21 
* @version V1.0   
*/
package cn.songzx.semaph.forth.service;

import java.util.concurrent.Semaphore;

/**
 * @ClassName: MyForthServiceB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午7:03:21
 * 
 */
public class MyForthServiceB {
	private Semaphore semaphore = new Semaphore(1);

	public void testMethodB() {
		/*
		 * 无参方法tryAcquire()的作用是尝试地获得一个许可，如果获取不到则返回false，此方法通常与if语句
		 * 
		 * 结合使用，其具有无阻塞的特点。无阻塞的特点可以使线程不至于在同步处一直持续等待的状态，如果if语句
		 * 
		 * 判读不成立则线程会继续走else语句，程序会继续向下运行。
		 */
		if (semaphore.tryAcquire()) {
			System.out.println("ThreadName=" + Thread.currentThread().getName() + "☆首选进入！");
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				String newString = new String();
				Math.random();
			}
			semaphore.release();
		} else {
			System.out.println("ThreadName=" + Thread.currentThread().getName() + "未成功进入！");
		}
	}


}
