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
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @ClassName: MyEighthThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月17日 下午9:34:48
 * 
 */
public class MyEighthThreadC extends Thread {
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
	public MyEighthThreadC(Exchanger<String> exchanger) {
		super();
		this.exchanger = exchanger;
	}

	public void run() {
		try {
			/*
			 * 类Exchanger中的exchanger(V v,long timeout,TimeUnit unit)调用后
			 * 
			 * 再指定的时间内没有其他的线程获取数据，则出现超时异常
			 */
			System.out.println("在线程C中得到线程B的值：" + exchanger.exchange("中国人C！",5,TimeUnit.SECONDS));
			System.out.println("C end！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
}
