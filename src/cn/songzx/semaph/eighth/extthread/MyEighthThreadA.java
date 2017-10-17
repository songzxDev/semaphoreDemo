/**   
* @Title: MyEighthThreadA.java 
* @Package cn.songzx.semaph.eighth.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月17日 下午9:34:48 
* @version V1.0   
*/
package cn.songzx.semaph.eighth.extthread;

import java.util.concurrent.Exchanger;

/**
 * @ClassName: MyEighthThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月17日 下午9:34:48
 * 
 */
public class MyEighthThreadA extends Thread {
	/**
	 * 类Exchanger的功能可以使两个线程之间传输数据
	 */
	private Exchanger<String> exchanger;

	/**
	 * @Date: 2017年10月17日下午9:35:40
	 * @Title: MyEighthThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param exchanger
	 */
	public MyEighthThreadA(Exchanger<String> exchanger) {
		super();
		this.exchanger = exchanger;
	}

	public void run() {
		try {
			/*
			 * 类Exchanger中的exchanger()方法具有阻塞特性，也就是此方法被调用后等待其他线程来取得数据，如果没有则一直阻塞等待
			 */
			System.out.println("在线程A中得到线程B的值：" + exchanger.exchange("中国人A！"));
			System.out.println("A end！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
