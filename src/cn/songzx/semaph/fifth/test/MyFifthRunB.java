/**   
* @Title: MyFifthRunB.java 
* @Package cn.songzx.semaph.fifth.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��16�� ����9:28:16 
* @version V1.0   
*/
package cn.songzx.semaph.fifth.test;

import cn.songzx.semaph.fifth.extthread.MyFifthThreadB;
import cn.songzx.semaph.fifth.service.MyFifthServiceB;

/**
 * @ClassName: MyFifthRunB
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��16�� ����9:28:16
 * 
 */
public class MyFifthRunB {

	/**
	 * @Date: 2017��10��16������9:28:16
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		MyFifthServiceB service = new MyFifthServiceB();
		MyFifthThreadB[] threadArray = new MyFifthThreadB[12];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MyFifthThreadB(service);
			threadArray[i].start();
		}
	}


}
