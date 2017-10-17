/**   
* @Title: MyEighthRunA.java 
* @Package cn.songzx.semaph.eighth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月17日 下午9:38:12 
* @version V1.0   
*/
package cn.songzx.semaph.eighth.test;

import java.util.concurrent.Exchanger;

import cn.songzx.semaph.eighth.extthread.MyEighthThreadC;

/**
 * @ClassName: MyEighthRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月17日 下午9:38:12
 * 
 */
public class MyEighthRunC {

	/**
	 * @Date: 2017年10月17日下午9:38:12
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		Exchanger<String> exchanger = new Exchanger<String>();
		MyEighthThreadC c = new MyEighthThreadC(exchanger);
		c.setName("C");
		c.start();

		System.out.println("main end！");
	}

}
