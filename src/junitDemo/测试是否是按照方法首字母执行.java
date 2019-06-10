/*
 * MethodSorters.JVM
Leaves the test methods in the order returned by the JVM. 
Note that the order from the JVM may vary from run to run (����JVM�õ��ķ���˳��Ҳ���Ǵ����ж���ķ���˳��)

MethodSorters.DEFAULT(Ĭ�ϵ�˳��)
Sorts the test methods in a deterministic, but not predictable, order() (��ȷ��������Ԥ�ڵ�˳��ִ��)

MethodSorters.NAME_ASCENDING
Sorts the test methods by the method name, in lexicographic order, 
with Method.toString() used as a tiebreaker (����������ĸ˳��ִ��)
 * 
 */
package junitDemo;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

//�����Ƿ��ǰ��շ�������ĸִ��
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class �����Ƿ��ǰ��շ�������ĸִ�� {

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
