/**   
* @Title: MyFifthRunA.java 
* @Package cn.songzx.semaph.fifth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月16日 下午9:08:45 
* @version V1.0   
*/
package cn.songzx.semaph.fifth.test;

import cn.songzx.semaph.fifth.extthread.MyFifthThreadA;
import cn.songzx.semaph.fifth.service.MyFifthServiceA;

/**
 * @ClassName: MyFifthRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月16日 下午9:08:45
 * 
 */
public class MyFifthRunA {

	/**
	 * @Date: 2017年10月16日下午9:08:45
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
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
