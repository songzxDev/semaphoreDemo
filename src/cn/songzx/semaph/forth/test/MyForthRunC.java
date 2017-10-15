/**   
* @Title: MyForthRunC.java 
* @Package cn.songzx.semaph.forth.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����7:29:49 
* @version V1.0   
*/
package cn.songzx.semaph.forth.test;

import cn.songzx.semaph.forth.extthread.MyThreadD;
import cn.songzx.semaph.forth.extthread.MyThreadE;
import cn.songzx.semaph.forth.service.MyForthServiceC;

/**
 * @ClassName: MyForthRunC
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����7:29:49
 * 
 */
public class MyForthRunC {

	/**
	 * @Date: 2017��10��15������7:29:49
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		MyForthServiceC service = new MyForthServiceC();

		MyThreadD d = new MyThreadD(service);
		d.setName("MyThreadD");
		d.start();

		MyThreadE e = new MyThreadE(service);
		e.setName("MyThreadE");
		e.start();
	}

}
