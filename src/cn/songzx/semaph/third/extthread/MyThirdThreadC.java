/**   
* @Title: MyThirdThreadC.java 
* @Package cn.songzx.semaph.third.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����5:52:51 
* @version V1.0   
*/
package cn.songzx.semaph.third.extthread;

import cn.songzx.semaph.third.service.MyThirdServiceC;

/**
 * @ClassName: MyThirdThreadC
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����5:52:51
 * 
 */
public class MyThirdThreadC extends Thread {

	private MyThirdServiceC service;

	/**
	 * @Date: 2017��10��15������5:53:15
	 * @Title: MyThirdThreadC.java
	 * @Description: TODO(������һ�仰�����������������)
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
