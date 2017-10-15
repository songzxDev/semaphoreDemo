/**   
* @Title: MySecondThreadA.java 
* @Package cn.songzx.semaph.second.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午12:34:35 
* @version V1.0   
*/
package cn.songzx.semaph.second.extthread;

import cn.songzx.semaph.second.service.MySecondServiceA;

/**
 * @ClassName: MySecondThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午12:34:35
 * 
 */
public class MySecondThreadA extends Thread {

	private MySecondServiceA service;

	/**
	 * @Date: 2017年10月15日下午12:35:02
	 * @Title: MySecondThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param service
	 */
	public MySecondThreadA(MySecondServiceA service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMethodA();
	}

}
