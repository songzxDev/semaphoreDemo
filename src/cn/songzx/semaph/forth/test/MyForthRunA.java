/**   
* @Title: MyForthRunA.java 
* @Package cn.songzx.semaph.forth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午6:45:46 
* @version V1.0   
*/
package cn.songzx.semaph.forth.test;

import cn.songzx.semaph.forth.extthread.MyForthThreadA;
import cn.songzx.semaph.forth.service.MyForthServiceA;

/**
 * @ClassName: MyForthRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午6:45:46
 * 
 */
public class MyForthRunA {

	/**
	 * @Date: 2017年10月15日下午6:45:46
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
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
