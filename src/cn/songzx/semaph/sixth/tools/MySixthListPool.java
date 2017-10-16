/**   
* @Title: MySixthListPool.java 
* @Package cn.songzx.semaph.sixth.tools 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月16日 下午9:44:55 
* @version V1.0   
*/
package cn.songzx.semaph.sixth.tools;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: MySixthListPool
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月16日 下午9:44:55
 * 
 */
public class MySixthListPool {

	private int poolMaxSize = 3;
	private int semaphorePermits = 5;
	private List<String> list = new ArrayList<String>();
	private Semaphore concurrencySemaphore = new Semaphore(semaphorePermits);
	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	/**
	 * @Date: 2017年10月16日下午9:48:03
	 * @Title: MySixthListPool.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 */
	public MySixthListPool() {
		super();
		for (int i = 0; i < poolMaxSize; i++) {
			list.add("孙悟空" + (i + 1));
		}
	}

	/**
	 * 
	 * @Date: 2017年10月16日下午9:58:01
	 * @Title: get
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return
	 * @return String 返回值类型
	 */
	public String get() {
		String getString = null;
		try {
			concurrencySemaphore.acquire();
			lock.lock();
			while (list.size() == 0) {
				condition.await();
			}
			getString = list.remove(0);
			lock.unlock();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return getString;
	}

	public void put(String stringValue) {
		lock.lock();
		list.add(stringValue);
		condition.signalAll();
		lock.unlock();
		concurrencySemaphore.release();
	}

}
