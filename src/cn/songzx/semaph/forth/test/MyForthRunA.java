/**   
* @Title: MyForthRunA.java 
* @Package cn.songzx.semaph.forth.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����6:45:46 
* @version V1.0   
*/
package cn.songzx.semaph.forth.test;

import cn.songzx.semaph.forth.extthread.MyForthThreadA;
import cn.songzx.semaph.forth.service.MyForthServiceA;

/**
 * @ClassName: MyForthRunA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����6:45:46
 * 
 */
public class MyForthRunA {

	/**
	 * @Date: 2017��10��15������6:45:46
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		MyForthServiceA service = new MyForthServiceA();

		MyForthThreadA firstThread = new MyForthThreadA(service);
		firstThread.start();

		MyForthThreadA[] threadArray = new MyForthThreadA[4];

		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MyForthThreadA(service);
			threadArray[i].start();

		}
	}

}
