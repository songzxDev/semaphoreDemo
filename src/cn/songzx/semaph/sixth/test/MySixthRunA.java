/**   
* @Title: MySixthRunA.java 
* @Package cn.songzx.semaph.sixth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月16日 下午9:54:58 
* @version V1.0   
*/
package cn.songzx.semaph.sixth.test;

import cn.songzx.semaph.sixth.extthread.MySixthThreadA;
import cn.songzx.semaph.sixth.tools.MySixthListPool;

/**
 * @ClassName: MySixthRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月16日 下午9:54:58
 * 
 */
public class MySixthRunA {

	/**
	 * @Date: 2017年10月16日下午9:54:58
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		/*
		 * 类Semaphore可以有效的限制并发执行任务的数量，这种功能可以应用在pool池技术中，可以设置同时访问pool池中数据的线程数量
		 * 
		 * 本实验的功能是同时有若干个线程可以访问池中的数据，但同时只有一个线程可以取得数据，使用完毕后再放回池中
		 */
		MySixthListPool listPool = new MySixthListPool();
		MySixthThreadA[] threadArray = new MySixthThreadA[12];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MySixthThreadA(listPool);
		}
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i].start();
		}
	}

}
