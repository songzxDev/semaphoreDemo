/**   
* @Title: MyThreadD.java 
* @Package cn.songzx.semaph.forth.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午7:28:50 
* @version V1.0   
*/
package cn.songzx.semaph.forth.extthread;

import cn.songzx.semaph.forth.service.MyForthServiceC;

/**
 * @ClassName: MyThreadD
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午7:28:50
 * 
 */
public class MyThreadE extends Thread {

	private MyForthServiceC service;

	/**
	 * @Date: 2017年10月15日下午7:29:10
	 * @Title: MyThreadD.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param service
	 */
	public MyThreadE(MyForthServiceC service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMehtodC();
	}

}
