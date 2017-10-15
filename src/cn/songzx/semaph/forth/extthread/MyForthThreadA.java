/**   
* @Title: MyForthThreadA.java 
* @Package cn.songzx.semaph.forth.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午6:43:17 
* @version V1.0   
*/
package cn.songzx.semaph.forth.extthread;

import cn.songzx.semaph.forth.service.MyForthServiceA;

/**
 * @ClassName: MyForthThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午6:43:17
 * 
 */
public class MyForthThreadA extends Thread {

	private MyForthServiceA service;

	/**
	 * @Date: 2017年10月15日下午6:43:46
	 * @Title: MyForthThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param service
	 */
	public MyForthThreadA(MyForthServiceA service) {
		super();
		this.service = service;
	}

	public void run() {
		System.out.println("ThreadName=" + this.getName() + "启动了！");
		service.testMethodA();
	}
}
