/**   
* @Title: MyFifthThreadA.java 
* @Package cn.songzx.semaph.fifth.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��16�� ����9:07:05 
* @version V1.0   
*/
package cn.songzx.semaph.fifth.extthread;

import cn.songzx.semaph.fifth.service.MyFifthServiceB;

/**
 * @ClassName: MyFifthThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��16�� ����9:07:05
 * 
 */
public class MyFifthThreadB extends Thread {

	private MyFifthServiceB service;

	/**
	 * @Date: 2017��10��16������9:07:51
	 * @Title: MyFifthThreadA.java
	 * @Description: TODO(������һ�仰�����������������)
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