/**   
* @Title: MyFifthRunA.java 
* @Package cn.songzx.semaph.fifth.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��16�� ����9:08:45 
* @version V1.0   
*/
package cn.songzx.semaph.fifth.test;

import cn.songzx.semaph.fifth.extthread.MyFifthThreadA;
import cn.songzx.semaph.fifth.service.MyFifthServiceA;

/**
 * @ClassName: MyFifthRunA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��16�� ����9:08:45
 * 
 */
public class MyFifthRunA {

	/**
	 * @Date: 2017��10��16������9:08:45
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		MyFifthServiceA service = new MyFifthServiceA();
		MyFifthThreadA[] threadArray = new MyFifthThreadA[12];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MyFifthThreadA(service);
			threadArray[i].start();
		}
	}

}
