/*
 * MethodSorters.JVM
Leaves the test methods in the order returned by the JVM. 
Note that the order from the JVM may vary from run to run (按照JVM得到的方法顺序，也就是代码中定义的方法顺序)

MethodSorters.DEFAULT(默认的顺序)
Sorts the test methods in a deterministic, but not predictable, order() (以确定但不可预期的顺序执行)

MethodSorters.NAME_ASCENDING
Sorts the test methods by the method name, in lexicographic order, 
with Method.toString() used as a tiebreaker (按方法名字母顺序执行)
 * 
 */
package junitDemo;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

//测试是否是按照方法首字母执行
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class 测试是否是按照方法首字母执行 {

	@Test
	public void TestCase1() {
		assertEquals(2+2, 4);
	}
	
	
	
	@Test
	public void TestCase2() {
		assertEquals(3+3, 1);
	}
	
	@Test
	public void Aa() {
		assertEquals("hello", "hj");
	}
	
}
