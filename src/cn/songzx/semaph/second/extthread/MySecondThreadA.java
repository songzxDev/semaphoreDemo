/**   
* @Title: MySecondThreadA.java 
* @Package cn.songzx.semaph.second.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����12:34:35 
* @version V1.0   
*/
package cn.songzx.semaph.second.extthread;

import cn.songzx.semaph.second.service.MySecondServiceA;

/**
 * @ClassName: MySecondThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����12:34:35
 * 
 */
public class MySecondThreadA extends Thread {

	private MySecondServiceA service;

	/**
	 * @Date: 2017��10��15������12:35:02
	 * @Title: MySecondThreadA.java
	 * @Description: TODO(������һ�仰�����������������)
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
