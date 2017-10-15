/**   
* @Title: MyFirstRunB.java 
* @Package cn.songzx.semaph.first.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午12:19:19 
* @version V1.0   
*/
package cn.songzx.semaph.first.test;

import cn.songzx.semaph.first.extthread.MyFirstThreadD;
import cn.songzx.semaph.first.extthread.MyFirstThreadE;
import cn.songzx.semaph.first.extthread.MyFirstThreadF;
import cn.songzx.semaph.first.service.MyFirstServiceB;

/**
 * @ClassName: MyFirstRunB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午12:19:19
 * 
 */
public class MyFirstRunB {

	/**
	 * @Date: 2017年10月15日下午12:19:19
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		MyFirstServiceB service = new MyFirstServiceB();
		MyFirstThreadD d = new MyFirstThreadD(service);
		d.setName("MyFirstThreadD");
		MyFirstThreadE e = new MyFirstThreadE(service);
		e.setName("MyFirstThreadE");
		MyFirstThreadF f = new MyFirstThreadF(service);
		f.setName("MyFirstThreadF");
		d.start();
		e.start();
		f.start();
	}

}
