/**   
* @Title: MyFirstRunB.java 
* @Package cn.songzx.semaph.first.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����12:19:19 
* @version V1.0   
*/
package cn.songzx.semaph.first.test;

import cn.songzx.semaph.first.extthread.MyFirstThreadD;
import cn.songzx.semaph.first.extthread.MyFirstThreadE;
import cn.songzx.semaph.first.extthread.MyFirstThreadF;
import cn.songzx.semaph.first.service.MyFirstServiceB;

/**
 * @ClassName: MyFirstRunB
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����12:19:19
 * 
 */
public class MyFirstRunB {

	/**
	 * @Date: 2017��10��15������12:19:19
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		MyFirstServiceB service = new MyFirstServiceB();
		MyFirstThreadD d = new MyFirstThreadD(service);
		d.setName("MyFirstThreadD");
		MyFirstThreadE e = new MyFirstThreadE(service);
		e.setName("MyFirstThreadE");
		MyFirstThreadF f = new MyFirstThreadF(service);
		f.setName("MyFirstThreadF");
		d.start();
		e.start();
		f.start();
	}

}
