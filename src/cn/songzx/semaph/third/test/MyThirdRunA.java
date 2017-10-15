/**   
* @Title: MyThirdRunA.java 
* @Package cn.songzx.semaph.third.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����2:45:21 
* @version V1.0   
*/
package cn.songzx.semaph.third.test;

import cn.songzx.semaph.third.extthread.MyThirdThreadA;
import cn.songzx.semaph.third.extthread.MyThirdThreadB;
import cn.songzx.semaph.third.service.MyThirdServiceA;

/**
 * @ClassName: MyThirdRunA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����2:45:21
 * 
 */
public class MyThirdRunA {

	/**
	 * @Date: 2017��10��15������2:45:21
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		try {
			MyThirdServiceA service = new MyThirdServiceA();
			MyThirdThreadA a = new MyThirdThreadA(service);
			a.setName("MyThirdThreadA");
			a.start();

			MyThirdThreadB b = new MyThirdThreadB(service);
			b.setName("MyThirdThreadB");
			b.start();

			Thread.sleep(1000L);

			b.interrupt();
			System.out.println("main�߳��ж����̣߳�MyThirdThreadA");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
