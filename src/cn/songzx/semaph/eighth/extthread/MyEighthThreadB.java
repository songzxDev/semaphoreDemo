/**   
* @Title: MyEighthThreadA.java 
* @Package cn.songzx.semaph.eighth.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��17�� ����9:34:48 
* @version V1.0   
*/
package cn.songzx.semaph.eighth.extthread;

import java.util.concurrent.Exchanger;

/**
 * @ClassName: MyEighthThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��17�� ����9:34:48
 * 
 */
public class MyEighthThreadB extends Thread {
	/**
	 * ��Exchanger�Ĺ��ܿ���ʹ�����߳�֮�䴫������
	 */
	private Exchanger<String> exchanger;

	/**
	 * @Date: 2017��10��17������9:35:40
	 * @Title: MyEighthThreadA.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param exchanger
	 */
	public MyEighthThreadB(Exchanger<String> exchanger) {
		super();
		this.exchanger = exchanger;
	}

	public void run() {
		try {
			/*
			 * ��Exchanger�е�exchanger()���������������ԣ�Ҳ���Ǵ˷��������ú�ȴ������߳���ȡ�����ݣ����û����һֱ�����ȴ�
			 */
			System.out.println("���߳�B�еõ��߳�A��ֵ��" + exchanger.exchange("�й���B��"));
			System.out.println("B end��");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
