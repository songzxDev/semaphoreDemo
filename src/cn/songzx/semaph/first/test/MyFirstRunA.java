/**   
* @Title: MyFirstRunA.java 
* @Package cn.songzx.semaph.first.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����12:08:04 
* @version V1.0   
*/
package cn.songzx.semaph.first.test;

import cn.songzx.semaph.first.extthread.MyFirstThreadA;
import cn.songzx.semaph.first.extthread.MyFirstThreadB;
import cn.songzx.semaph.first.extthread.MyFirstThreadC;
import cn.songzx.semaph.first.service.MyFirstServiceA;

/**
 * @ClassName: MyFirstRunA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����12:08:04
 * 
 */
public class MyFirstRunA {

	/**
	 * @Date: 2017��10��15������12:08:04
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		MyFirstServiceA service = new MyFirstServiceA();
		MyFirstThreadA a = new MyFirstThreadA(service);
		a.setName("MyFirstThreadA");
		MyFirstThreadB b = new MyFirstThreadB(service);
		b.setName("MyFirstThreadB");
		MyFirstThreadC c = new MyFirstThreadC(service);
		c.setName("MyFirstThreadC");
		a.start();
		b.start();
		c.start();
	}

}
