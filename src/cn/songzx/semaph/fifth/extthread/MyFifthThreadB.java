/**   
* @Title: MyFifthThreadA.java 
* @Package cn.songzx.semaph.fifth.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月16日 下午9:07:05 
* @version V1.0   
*/
package cn.songzx.semaph.fifth.extthread;

import cn.songzx.semaph.fifth.service.MyFifthServiceB;

/**
 * @ClassName: MyFifthThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月16日 下午9:07:05
 * 
 */
public class MyFifthThreadB extends Thread {

	private MyFifthServiceB service;

	/**
	 * @Date: 2017年10月16日下午9:07:51
	 * @Title: MyFifthThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param service
	 */
	public MyFifthThreadB(MyFifthServiceB service) {
		super();
		this.service = service;
	}

	public void run() {
		service.sayHello();
	}
}
