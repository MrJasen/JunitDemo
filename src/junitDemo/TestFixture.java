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
package junitDemo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFixture {

	// 在当前测试类开始时运行
	@BeforeClass
	public static void beforeClass() {
		System.out.println("--------------beforeClass--------");
	}

	// 在当前测试类结束时运行
	@AfterClass
	public static void afterClass() {
		System.out.println("--------------afterClass--------");
	}

	// 在每个测试方法运行前运行
	@Before
	public void before() {
		System.out.println("--------------before--------");
	}

	// 在每个测试方法结束后运行
	@After
	public void after() {
		System.out.println("--------------after--------");
	}

	// 执行第一条测试用例
	@Test
	public void testadd1() {
		int result = new Count().add(6, 6);
		assertEquals(result, 12);
		System.out.println("现在执行第一条测试用例");
	}

	// 执行第二条测试用例
	@Test
	public void testadd2() {
		int result = new Count().add(7, 7);
		assertEquals(result, 14);
		System.out.println("现在执行第二条测试用例");
	}

}
