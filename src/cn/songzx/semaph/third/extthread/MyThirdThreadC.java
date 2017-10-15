/**   
* @Title: MyThirdThreadC.java 
* @Package cn.songzx.semaph.third.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午5:52:51 
* @version V1.0   
*/
package cn.songzx.semaph.third.extthread;

import cn.songzx.semaph.third.service.MyThirdServiceC;

/**
 * @ClassName: MyThirdThreadC
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午5:52:51
 * 
 */
public class MyThirdThreadC extends Thread {

	private MyThirdServiceC service;

	/**
	 * @Date: 2017年10月15日下午5:53:15
	 * @Title: MyThirdThreadC.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param service
	 */
	public MyThirdThreadC(MyThirdServiceC service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMethodC();
	}
}
