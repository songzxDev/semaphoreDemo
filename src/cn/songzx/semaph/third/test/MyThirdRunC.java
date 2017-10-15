/**   
* @Title: MyThirdRunC.java 
* @Package cn.songzx.semaph.third.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月15日 下午5:54:03 
* @version V1.0   
*/
package cn.songzx.semaph.third.test;

import cn.songzx.semaph.third.extthread.MyThirdThreadC;
import cn.songzx.semaph.third.service.MyThirdServiceC;

/**
 * @ClassName: MyThirdRunC
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月15日 下午5:54:03
 * 
 */
public class MyThirdRunC {

	/**
	 * @Date: 2017年10月15日下午5:54:03
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		MyThirdServiceC service = new MyThirdServiceC();
		MyThirdThreadC firstThread = new MyThirdThreadC(service);
		firstThread.start();
		MyThirdThreadC[] threadArray = new MyThirdThreadC[4];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MyThirdThreadC(service);
			threadArray[i].start();
		}

	}

}
