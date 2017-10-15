/**   
* @Title: MyForthThreadB.java 
* @Package cn.songzx.semaph.forth.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午7:07:29 
* @version V1.0   
*/
package cn.songzx.semaph.forth.extthread;

import cn.songzx.semaph.forth.service.MyForthServiceB;

/**
 * @ClassName: MyForthThreadB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午7:07:29
 * 
 */
public class MyForthThreadB extends Thread {

	private MyForthServiceB service;

	/**
	 * @Date: 2017年10月15日下午7:08:14
	 * @Title: MyForthThreadB.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param service
	 */
	public MyForthThreadB(MyForthServiceB service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMethodB();
	}
}
