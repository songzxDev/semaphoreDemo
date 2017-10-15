/**   
* @Title: MyForthRunC.java 
* @Package cn.songzx.semaph.forth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午7:29:49 
* @version V1.0   
*/
package cn.songzx.semaph.forth.test;

import cn.songzx.semaph.forth.extthread.MyThreadD;
import cn.songzx.semaph.forth.extthread.MyThreadE;
import cn.songzx.semaph.forth.service.MyForthServiceC;

/**
 * @ClassName: MyForthRunC
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午7:29:49
 * 
 */
public class MyForthRunC {

	/**
	 * @Date: 2017年10月15日下午7:29:49
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		MyForthServiceC service = new MyForthServiceC();

		MyThreadD d = new MyThreadD(service);
		d.setName("MyThreadD");
		d.start();

		MyThreadE e = new MyThreadE(service);
		e.setName("MyThreadE");
		e.start();
	}

}
