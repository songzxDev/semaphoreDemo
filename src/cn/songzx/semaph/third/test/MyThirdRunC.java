/**   
* @Title: MyThirdRunC.java 
* @Package cn.songzx.semaph.third.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��15�� ����5:54:03 
* @version V1.0   
*/
package cn.songzx.semaph.third.test;

import cn.songzx.semaph.third.extthread.MyThirdThreadC;
import cn.songzx.semaph.third.service.MyThirdServiceC;

/**
 * @ClassName: MyThirdRunC
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��15�� ����5:54:03
 * 
 */
public class MyThirdRunC {

	/**
	 * @Date: 2017��10��15������5:54:03
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		MyThirdServiceC service = new MyThirdServiceC();
		MyThirdThreadC firstThread = new MyThirdThreadC(service);
		firstThread.start();
		MyThirdThreadC[] threadArray = new MyThirdThreadC[4];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MyThirdThreadC(service);
			threadArray[i].start();
		}

	}

}
