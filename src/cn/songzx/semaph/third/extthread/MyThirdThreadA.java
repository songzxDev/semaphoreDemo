/**   
* @Title: MyThirdThreadA.java 
* @Package cn.songzx.semaph.third.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����2:44:02 
* @version V1.0   
*/
package cn.songzx.semaph.third.extthread;

import cn.songzx.semaph.third.service.MyThirdServiceA;

/**
 * @ClassName: MyThirdThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����2:44:02
 * 
 */
public class MyThirdThreadA extends Thread {
	private MyThirdServiceA service;

	/**
	 * @Date: 2017��10��15������2:44:26
	 * @Title: MyThirdThreadA.java
	 * @Description: TODO(������һ�仰�����������������)
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
