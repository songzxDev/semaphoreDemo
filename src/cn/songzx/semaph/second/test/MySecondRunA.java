/**   
* @Title: MySecondRunA.java 
* @Package cn.songzx.semaph.second.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午12:35:41 
* @version V1.0   
*/
package cn.songzx.semaph.second.test;

import cn.songzx.semaph.second.extthread.MySecondThreadA;
import cn.songzx.semaph.second.service.MySecondServiceA;

/**
 * @ClassName: MySecondRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午12:35:41
 * 
 */
public class MySecondRunA {

	/**
	 * @Date: 2017年10月15日下午12:35:41
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		/*
		 * 总共有10个许可，每次执行semaphore.acquire(2);代码时消耗掉2个，所以10/2=5，说明同一时间只有5个线程
		 * 
		 * 允许执行acquire()和release()之间的代码，如果多次调用Semaphore类的release()
		 * 
		 * 或release(int)方法时还可以动态增加permits数目
		 */
		MySecondServiceA service = new MySecondServiceA();
		MySecondThreadA[] threads = new MySecondThreadA[10];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new MySecondThreadA(service);
			threads[i].start();
		}
	}

}
