/**   
* @Title: MySeventhRun.java 
* @Package cn.songzx.semaph.seventh.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月17日 下午9:17:39 
* @version V1.0   
*/
package cn.songzx.semaph.seventh.test;

import cn.songzx.semaph.seventh.service.MySeventhRepastService;

/**
 * @ClassName: MySeventhRun
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月17日 下午9:17:39
 * 
 */
public class MySeventhRun {

	/**
	 * @Date: 2017年10月17日下午9:17:39
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			/*
			 * 本实验的目的不光是生产者和消费者模式，还要限制生产者和消费者的数量，这样代码的复杂性就提高一些
			 * 但好在使用Semaphore类实现这个功能还是比较简单的，Semaphore类提供了限制并发线程数的功能
			 * 此功能在默认的synchronized中是不提供的
			 */
			MySeventhRepastService service = new MySeventhRepastService();
			ThreadP[] arrayP = new ThreadP[60];
			ThreadC[] arrayC = new ThreadC[60];
			for (int i = 0; i < 60; i++) {
				arrayP[i] = new ThreadP(service);
				arrayC[i] = new ThreadC(service);
			}
			Thread.sleep(5000L);
			for (int i = 0; i < 60; i++) {
				arrayP[i].start();
				arrayC[i].start();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static class ThreadP extends Thread {
		private MySeventhRepastService service;

		/**
		 * @Date: 2017年10月17日下午9:20:34
		 * @Title: MySeventhRun.java
		 * @Description: TODO(这里用一句话描述这个方法的作用)
		 * @param service
		 */
		public ThreadP(MySeventhRepastService service) {
			super();
			this.service = service;
		}

		public void run() {
			service.set();
		}
	}

	private static class ThreadC extends Thread {
		private MySeventhRepastService service;

		/**
		 * @Date: 2017年10月17日下午9:20:34
		 * @Title: MySeventhRun.java
		 * @Description: TODO(这里用一句话描述这个方法的作用)
		 * @param service
		 */
		public ThreadC(MySeventhRepastService service) {
			super();
			this.service = service;
		}

		public void run() {
			service.get();
		}
	}

}
