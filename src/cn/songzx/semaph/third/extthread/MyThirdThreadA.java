/**   
* @Title: MyThirdThreadA.java 
* @Package cn.songzx.semaph.third.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午2:44:02 
* @version V1.0   
*/
package cn.songzx.semaph.third.extthread;

import cn.songzx.semaph.third.service.MyThirdServiceA;

/**
 * @ClassName: MyThirdThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午2:44:02
 * 
 */
public class MyThirdThreadA extends Thread {
	private MyThirdServiceA service;

	/**
	 * @Date: 2017年10月15日下午2:44:26
	 * @Title: MyThirdThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param service
	 */
	public MyThirdThreadA(MyThirdServiceA service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMethodA();
	}
}
