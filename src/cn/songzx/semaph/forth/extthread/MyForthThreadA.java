/**   
* @Title: MyForthThreadA.java 
* @Package cn.songzx.semaph.forth.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����6:43:17 
* @version V1.0   
*/
package cn.songzx.semaph.forth.extthread;

import cn.songzx.semaph.forth.service.MyForthServiceA;

/**
 * @ClassName: MyForthThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����6:43:17
 * 
 */
public class MyForthThreadA extends Thread {

	private MyForthServiceA service;

	/**
	 * @Date: 2017��10��15������6:43:46
	 * @Title: MyForthThreadA.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param service
	 */
	public MyForthThreadA(MyForthServiceA service) {
		super();
		this.service = service;
	}

	public void run() {
		System.out.println("ThreadName=" + this.getName() + "�����ˣ�");
		service.testMethodA();
	}
}
