/*
 * 1.@Test: ���Է���

��������a)(expected=XXException.class)���������쳣��XXException.classһ���������ͨ��
��������b)(timeout=100)��������ִ������100����֮����ɣ������ͨ��

����2.@Ignore: �����ԵĲ��Է���������֮����ʱ�����д˶δ���

����3.@Before: ÿһ�����Է���֮ǰ����

����4.@After: ÿһ�����Է���֮������

����5.@BeforeClass: �����������Ҫ�Ǿ�̬������static �����������в��Կ�ʼ֮ǰ���У�ע������before�������в��Է���

����6.@AfterClass: ��������Ҫ�Ǿ�̬������static �����������в��Խ���֮�����У�ע������ @After
 */
package junitDemo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFixture {

	// �ڵ�ǰ�����࿪ʼʱ����
	@BeforeClass
	public static void beforeClass() {
		System.out.println("--------------beforeClass--------");
	}

	// �ڵ�ǰ���������ʱ����
	@AfterClass
	public static void afterClass() {
		System.out.println("--------------afterClass--------");
	}

	// ��ÿ�����Է�������ǰ����
	@Before
	public void before() {
		System.out.println("--------------before--------");
	}

	// ��ÿ�����Է�������������
	@After
	public void after() {
		System.out.println("--------------after--------");
	}

	// ִ�е�һ����������
	@Test
	public void testadd1() {
		int result = new Count().add(6, 6);
		assertEquals(result, 12);
		System.out.println("����ִ�е�һ����������");
	}

	// ִ�еڶ�����������
	@Test
	public void testadd2() {
		int result = new Count().add(7, 7);
		assertEquals(result, 14);
		System.out.println("����ִ�еڶ�����������");
	}

}
