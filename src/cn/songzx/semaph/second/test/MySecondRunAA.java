/**   
* @Title: MySecondRunAA.java 
* @Package cn.songzx.semaph.second.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午1:44:53 
* @version V1.0   
*/
package cn.songzx.semaph.second.test;

import java.util.concurrent.Semaphore;

/**
 * @ClassName: MySecondRunAA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午1:44:53
 * 
 */
public class MySecondRunAA {

	/**
	 * @Date: 2017年10月15日下午1:44:53
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			/*
			 * 构造参数new Semaphore(5);中的5并不是最终的许可数量，仅仅是初始的状态值。
			 */
			Semaphore semaphore = new Semaphore(5);
			semaphore.acquire();
			semaphore.acquire();
			semaphore.acquire();
			semaphore.acquire();
			semaphore.acquire();
			System.out.println(semaphore.availablePermits());
			semaphore.release();
			semaphore.release();
			semaphore.release();
			semaphore.release();
			semaphore.release();
			semaphore.release();
			System.out.println(semaphore.availablePermits());
			semaphore.release(4);
			System.out.println(semaphore.availablePermits());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
