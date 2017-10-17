/**   
* @Title: MySeventhRun.java 
* @Package cn.songzx.semaph.seventh.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��17�� ����9:17:39 
* @version V1.0   
*/
package cn.songzx.semaph.seventh.test;

import cn.songzx.semaph.seventh.service.MySeventhRepastService;

/**
 * @ClassName: MySeventhRun
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��17�� ����9:17:39
 * 
 */
public class MySeventhRun {

	/**
	 * @Date: 2017��10��17������9:17:39
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		try {
			/*
			 * ��ʵ���Ŀ�Ĳ����������ߺ�������ģʽ����Ҫ���������ߺ������ߵ���������������ĸ����Ծ����һЩ
			 * ������ʹ��Semaphore��ʵ��������ܻ��ǱȽϼ򵥵ģ�Semaphore���ṩ�����Ʋ����߳����Ĺ���
			 * �˹�����Ĭ�ϵ�synchronized���ǲ��ṩ��
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
		 * @Date: 2017��10��17������9:20:34
		 * @Title: MySeventhRun.java
		 * @Description: TODO(������һ�仰�����������������)
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
		 * @Date: 2017��10��17������9:20:34
		 * @Title: MySeventhRun.java
		 * @Description: TODO(������һ�仰�����������������)
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
