/**   
* @Title: MyThreadD.java 
* @Package cn.songzx.semaph.forth.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����7:28:50 
* @version V1.0   
*/
package cn.songzx.semaph.forth.extthread;

import cn.songzx.semaph.forth.service.MyForthServiceC;

/**
 * @ClassName: MyThreadD
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����7:28:50
 * 
 */
public class MyThreadE extends Thread {

	private MyForthServiceC service;

	/**
	 * @Date: 2017��10��15������7:29:10
	 * @Title: MyThreadD.java
	 * @Description: TODO(������һ�仰�����������������)
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
