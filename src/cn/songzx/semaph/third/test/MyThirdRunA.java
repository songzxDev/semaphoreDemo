/**   
* @Title: MyThirdRunA.java 
* @Package cn.songzx.semaph.third.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午2:45:21 
* @version V1.0   
*/
package cn.songzx.semaph.third.test;

import cn.songzx.semaph.third.extthread.MyThirdThreadA;
import cn.songzx.semaph.third.extthread.MyThirdThreadB;
import cn.songzx.semaph.third.service.MyThirdServiceA;

/**
 * @ClassName: MyThirdRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午2:45:21
 * 
 */
public class MyThirdRunA {

	/**
	 * @Date: 2017年10月15日下午2:45:21
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			MyThirdServiceA service = new MyThirdServiceA();
			MyThirdThreadA a = new MyThirdThreadA(service);
			a.setName("MyThirdThreadA");
			a.start();

			MyThirdThreadB b = new MyThirdThreadB(service);
			b.setName("MyThirdThreadB");
			b.start();

			Thread.sleep(1000L);

			b.interrupt();
			System.out.println("main线程中断了线程：MyThirdThreadA");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
