/**   
* @Title: MyForthThreadB.java 
* @Package cn.songzx.semaph.forth.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����7:07:29 
* @version V1.0   
*/
package cn.songzx.semaph.forth.extthread;

import cn.songzx.semaph.forth.service.MyForthServiceB;

/**
 * @ClassName: MyForthThreadB
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����7:07:29
 * 
 */
public class MyForthThreadB extends Thread {

	private MyForthServiceB service;

	/**
	 * @Date: 2017��10��15������7:08:14
	 * @Title: MyForthThreadB.java
	 * @Description: TODO(������һ�仰�����������������)
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
