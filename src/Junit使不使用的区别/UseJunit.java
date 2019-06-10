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
package Junitʹ��ʹ�õ�����;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UseJunit {

	Calculator ca=null;
	//ִ��ÿ������֮ǰ��ִ�е����
	@Before
	public void testBefore() {
		ca=new Calculator();
	}
	
	@Test
	//����add����
	public void testAdd() {
		//Calculator calculator =new Calculator();
		int result=ca.add(3, 3);
		assertEquals(result, 6);
	}
	
	@Test
	//����sub()
	public void testSub() {
		//Calculator calculator =new Calculator();
		int result =ca.sub(4, 1);
		assertEquals(result, 3);
	}
	
}
