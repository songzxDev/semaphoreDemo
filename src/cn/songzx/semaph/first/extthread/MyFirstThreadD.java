/**   
* @Title: MyFirstThreadA.java 
* @Package cn.songzx.semaph.first.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午12:05:30 
* @version V1.0   
*/
package cn.songzx.semaph.first.extthread;

import cn.songzx.semaph.first.service.MyFirstServiceB;

/**
 * @ClassName: MyFirstThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午12:05:30
 * 
 */
public class MyFirstThreadD extends Thread {
	private MyFirstServiceB service;

	/**
	 * @Date: 2017年10月15日下午12:06:32
	 * @Title: MyFirstThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param service
	 */
	public MyFirstThreadD(MyFirstServiceB service) {
		super();
		this.service = service;
	}

	/**
	 * @Date: 2017年10月15日下午12:06:44
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	public void run() {
		service.testMethodB();
		
	}

}
