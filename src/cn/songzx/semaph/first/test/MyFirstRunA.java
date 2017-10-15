/**   
* @Title: MyFirstRunA.java 
* @Package cn.songzx.semaph.first.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午12:08:04 
* @version V1.0   
*/
package cn.songzx.semaph.first.test;

import cn.songzx.semaph.first.extthread.MyFirstThreadA;
import cn.songzx.semaph.first.extthread.MyFirstThreadB;
import cn.songzx.semaph.first.extthread.MyFirstThreadC;
import cn.songzx.semaph.first.service.MyFirstServiceA;

/**
 * @ClassName: MyFirstRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午12:08:04
 * 
 */
public class MyFirstRunA {

	/**
	 * @Date: 2017年10月15日下午12:08:04
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		MyFirstServiceA service = new MyFirstServiceA();
		MyFirstThreadA a = new MyFirstThreadA(service);
		a.setName("MyFirstThreadA");
		MyFirstThreadB b = new MyFirstThreadB(service);
		b.setName("MyFirstThreadB");
		MyFirstThreadC c = new MyFirstThreadC(service);
		c.setName("MyFirstThreadC");
		a.start();
		b.start();
		c.start();
	}

}
