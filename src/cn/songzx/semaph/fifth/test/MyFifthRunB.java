/**   
* @Title: MyFifthRunB.java 
* @Package cn.songzx.semaph.fifth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月16日 下午9:28:16 
* @version V1.0   
*/
package cn.songzx.semaph.fifth.test;

import cn.songzx.semaph.fifth.extthread.MyFifthThreadB;
import cn.songzx.semaph.fifth.service.MyFifthServiceB;

/**
 * @ClassName: MyFifthRunB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月16日 下午9:28:16
 * 
 */
public class MyFifthRunB {

	/**
	 * @Date: 2017年10月16日下午9:28:16
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
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
