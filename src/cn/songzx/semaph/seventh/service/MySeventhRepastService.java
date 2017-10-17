/**   
* @Title: MySeventhRepastService.java 
* @Package cn.songzx.semaph.seventh.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��17�� ����8:56:44 
* @version V1.0   
*/
package cn.songzx.semaph.seventh.service;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: MySeventhRepastService
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��17�� ����8:56:44
 * 
 */
public class MySeventhRepastService {
	volatile private Semaphore setSemaphore = new Semaphore(10);// ��ʦ
	volatile private Semaphore getSemaphore = new Semaphore(20);// �Ͳ���
	volatile private ReentrantLock lock = new ReentrantLock();
	volatile private Condition setCondition = lock.newCondition();
	volatile private Condition getCondition = lock.newCondition();
	// producePosition��������˼�����ֻ��4�����Ӵ�Ų�Ʒ
	volatile private Object[] producePosition = new Object[4];

	private boolean isEmpty() {
		boolean isEmpty = true;
		for (int i = 0; i < producePosition.length; i++) {
			if (producePosition[i] != null) {
				isEmpty = false;
				break;
			}
		}
		if (isEmpty == true) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isFull() {
		boolean isFull = true;
		for (int i = 0; i < producePosition.length; i++) {
			if (producePosition[i] == null) {
				isFull = false;
				break;
			}
		}
		return isFull;
	}

	public void set() {
		try {
			// System.out.println("set()���������ã�");
			setSemaphore.acquire();// ����ͬʱ�����10����ʦ��������
			lock.lock();
			while (isFull()) {
				// System.out.println("��ʦ�������ڵȴ���");
				setCondition.await();
			}
			for (int i = 0; i < producePosition.length; i++) {
				if (producePosition[i] == null) {
					producePosition[i] = "����";
					System.out.println(Thread.currentThread().getName() + " ������ " + producePosition[i]);
					break;
				}
			}
			getCondition.signalAll();
			lock.unlock();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			setSemaphore.release();
		}
	}

	public void get() {
		try {
			// System.out.println("get()���������ã�");
			getSemaphore.acquire();// ����ͬʱ�����16���Ͳ���
			lock.lock();
			while (isEmpty()) {
				// System.out.println("�Ͳ��������ڵȴ���");
				getCondition.await();
			}
			for (int i = 0; i < producePosition.length; i++) {
				if (producePosition[i] != null) {
					System.out.println(Thread.currentThread().getName() + " ������ " + producePosition[i]);
					producePosition[i] = null;
					break;
				}
			}
			setCondition.signalAll();
			lock.unlock();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			getSemaphore.release();
		}
	}
}
