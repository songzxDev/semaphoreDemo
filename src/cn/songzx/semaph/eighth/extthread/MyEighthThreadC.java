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
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @ClassName: MyEighthThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��17�� ����9:34:48
 * 
 */
public class MyEighthThreadC extends Thread {
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
	public MyEighthThreadC(Exchanger<String> exchanger) {
		super();
		this.exchanger = exchanger;
	}

	public void run() {
		try {
			/*
			 * ��Exchanger�е�exchanger(V v,long timeout,TimeUnit unit)���ú�
			 * 
			 * ��ָ����ʱ����û���������̻߳�ȡ���ݣ�����ֳ�ʱ�쳣
			 */
			System.out.println("���߳�C�еõ��߳�B��ֵ��" + exchanger.exchange("�й���C��",5,TimeUnit.SECONDS));
			System.out.println("C end��");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
}
