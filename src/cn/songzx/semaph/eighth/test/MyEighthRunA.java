/**   
* @Title: MyEighthRunA.java 
* @Package cn.songzx.semaph.eighth.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��17�� ����9:38:12 
* @version V1.0   
*/
package cn.songzx.semaph.eighth.test;

import java.util.concurrent.Exchanger;

import cn.songzx.semaph.eighth.extthread.MyEighthThreadA;

/**
 * @ClassName: MyEighthRunA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��17�� ����9:38:12
 * 
 */
public class MyEighthRunA {

	/**
	 * @Date: 2017��10��17������9:38:12
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		Exchanger<String> exchanger = new Exchanger<String>();
		MyEighthThreadA a = new MyEighthThreadA(exchanger);
		a.start();
		System.out.println("main end��");
	}

}