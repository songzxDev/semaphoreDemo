/**   
* @Title: MyFirstThreadA.java 
* @Package cn.songzx.semaph.first.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����12:05:30 
* @version V1.0   
*/
package cn.songzx.semaph.first.extthread;

import cn.songzx.semaph.first.service.MyFirstServiceB;

/**
 * @ClassName: MyFirstThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����12:05:30
 * 
 */
public class MyFirstThreadD extends Thread {
	private MyFirstServiceB service;

	/**
	 * @Date: 2017��10��15������12:06:32
	 * @Title: MyFirstThreadA.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param service
	 */
	public MyFirstThreadD(MyFirstServiceB service) {
		super();
		this.service = service;
	}

	/**
	 * @Date: 2017��10��15������12:06:44
	 * @Title: run
	 * @Description: TODO(������һ�仰�����������������)
	 * @return ����ֵ����
	 */
	@Override
	public void run() {
		service.testMethodB();
		
	}

}
