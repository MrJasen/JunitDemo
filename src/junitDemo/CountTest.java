package junitDemo;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class CountTest {

	//实例化被测类，验证add方法，正常逻辑
	@Test
	public void testAdd() {
//		Count count =new Count();
//		int result = count.add(2, 2);
		
		int result = new Count().add(2, 2);
		//断言值和预期是否一致
		assertEquals(result, 5);
	}
	
	//验证超时
	@Test(timeout = 100)
	public void testAdd2() throws InterruptedException {
		//超时模拟
		Thread.sleep(101);
		Count count =new Count();
		count.add(3, 3);
		
	}
	
	//验证抛出异常，用除数为0的异常ArithmeticException
	//如果出现的异常和预期的异常一致，则通过
	@Test(expected = ArithmeticException.class)
	public void testDivision() {
		new Count().division(2, 0);
	}
	
	//跳过这条用例，不执行
	@Ignore
	@Test
	public void testAdd3() {
		Count count = new Count();
	    int result = count.add(5, 5);
		assertEquals(result, 9);
		
		
		
	}
	
	
}
