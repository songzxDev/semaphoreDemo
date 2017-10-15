/**   
* @Title: MyForthRunD.java 
* @Package cn.songzx.semaph.forth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午7:39:48 
* @version V1.0   
*/
package cn.songzx.semaph.forth.test;

import cn.songzx.semaph.forth.service.MyForthServiceD;

/**
 * @ClassName: MyForthRunD
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午7:39:48
 * 
 */
public class MyForthRunD {

	/**
	 * @Date: 2017年10月15日下午7:39:48
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		MyForthServiceD service = new MyForthServiceD();
		MyThreadA threadA = new MyThreadA(service);
		threadA.setName("MyThreadA");
		threadA.start();
		MyThreadB threadB = new MyThreadB(service);
		threadB.setName("MyThreadB");
		threadB.start();
	}

	private static class MyThreadA extends Thread {
		private MyForthServiceD service;

		/**
		 * @Date: 2017年10月15日下午7:40:44
		 * @Title: MyForthRunD.java
		 * @Description: TODO(这里用一句话描述这个方法的作用)
		 * @param service
		 */
		public MyThreadA(MyForthServiceD service) {
			super();
			this.service = service;
		}

		public void run() {
			service.testMethodD();
		}
	}

	private static class MyThreadB extends Thread {
		private MyForthServiceD service;

		/**
		 * @Date: 2017年10月15日下午7:40:44
		 * @Title: MyForthRunD.java
		 * @Description: TODO(这里用一句话描述这个方法的作用)
		 * @param service
		 */
		public MyThreadB(MyForthServiceD service) {
			super();
			this.service = service;
		}

		public void run() {
			service.testMethodD();
		}
	}
}
