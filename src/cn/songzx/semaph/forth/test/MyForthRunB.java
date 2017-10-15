/**   
* @Title: MyForthRunA.java 
* @Package cn.songzx.semaph.forth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午6:45:46 
* @version V1.0   
*/
package cn.songzx.semaph.forth.test;

import cn.songzx.semaph.forth.extthread.MyForthThreadB;
import cn.songzx.semaph.forth.extthread.MyForthThreadBB;
import cn.songzx.semaph.forth.extthread.MyForthThreadC;
import cn.songzx.semaph.forth.extthread.MyForthThreadCC;
import cn.songzx.semaph.forth.service.MyForthServiceB;
import cn.songzx.semaph.forth.service.MyForthServiceBB;

/**
 * @ClassName: MyForthRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午6:45:46
 * 
 */
public class MyForthRunB {

	/**
	 * @Date: 2017年10月15日下午6:45:46
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		MyForthServiceB service = new MyForthServiceB();

		MyForthThreadB b = new MyForthThreadB(service);
		b.setName("MyForthThreadB");
		b.start();

		MyForthThreadC c = new MyForthThreadC(service);
		c.setName("MyForthThreadC");
		c.start();

		MyForthServiceBB serviceB = new MyForthServiceBB();
		MyForthThreadBB bb = new MyForthThreadBB(serviceB);
		bb.setName("MyForthThreadBB");
		bb.start();

		MyForthThreadCC cc = new MyForthThreadCC(serviceB);
		cc.setName("MyForthThreadCC");
		cc.start();

	}

}
