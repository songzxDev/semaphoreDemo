/**   
* @Title: MyForthRunD.java 
* @Package cn.songzx.semaph.forth.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����7:39:48 
* @version V1.0   
*/
package cn.songzx.semaph.forth.test;

import cn.songzx.semaph.forth.service.MyForthServiceD;

/**
 * @ClassName: MyForthRunD
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����7:39:48
 * 
 */
public class MyForthRunD {

	/**
	 * @Date: 2017��10��15������7:39:48
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
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
		 * @Date: 2017��10��15������7:40:44
		 * @Title: MyForthRunD.java
		 * @Description: TODO(������һ�仰�����������������)
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
		 * @Date: 2017��10��15������7:40:44
		 * @Title: MyForthRunD.java
		 * @Description: TODO(������һ�仰�����������������)
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
