/*
 * 1.@Test: 测试方法

　　　　a)(expected=XXException.class)如果程序的异常和XXException.class一样，则测试通过
　　　　b)(timeout=100)如果程序的执行能在100毫秒之内完成，则测试通过

　　2.@Ignore: 被忽略的测试方法：加上之后，暂时不运行此段代码

　　3.@Before: 每一个测试方法之前运行

　　4.@After: 每一个测试方法之后运行

　　5.@BeforeClass: 方法必须必须要是静态方法（static 声明），所有测试开始之前运行，注意区分before，是所有测试方法

　　6.@AfterClass: 方法必须要是静态方法（static 声明），所有测试结束之后运行，注意区分 @After
 */
package Junit使不使用的区别;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UseJunit {

	Calculator ca=null;
	//执行每个方法之前先执行的语句
	@Before
	public void testBefore() {
		ca=new Calculator();
	}
	
	@Test
	//测试add（）
	public void testAdd() {
		//Calculator calculator =new Calculator();
		int result=ca.add(3, 3);
		assertEquals(result, 6);
	}
	
	@Test
	//测试sub()
	public void testSub() {
		//Calculator calculator =new Calculator();
		int result =ca.sub(4, 1);
		assertEquals(result, 3);
	}
	
}
