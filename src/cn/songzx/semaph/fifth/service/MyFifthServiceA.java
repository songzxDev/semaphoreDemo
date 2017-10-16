/**   
* @Title: MyFifthServiceA.java 
* @Package cn.songzx.semaph.fifth.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月16日 下午9:02:53 
* @version V1.0   
*/
package cn.songzx.semaph.fifth.service;

import java.util.concurrent.Semaphore;

/**
 * @ClassName: MyFifthServiceA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月16日 下午9:02:53
 * 
 */
public class MyFifthServiceA {
	private Semaphore semaphore = new Semaphore(3);

	/**
	 * 
	 * @Date: 2017年10月16日下午9:13:38
	 * @Title: sayHello
	 * @Description: TODO(多进路-多处理-多出路实验)
	 * @return void 返回值类型
	 */
	public void sayHello() {
		try {
			/*
			 * 本实现的目标是允许多个线程同时处理任务，更具体来讲，也就是每个线程都在处理自己的任务
			 */
			semaphore.acquire();
			System.out.println("ThreadName=" + Thread.currentThread().getName() + "准备！");
			System.out.println("begin hello " + System.currentTimeMillis());
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + "打印" + (i + 1));
			}
			System.out.println("  end hello " + System.currentTimeMillis());
			semaphore.release();
			System.out.println("ThreadName=" + Thread.currentThread().getName() + "结束！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
