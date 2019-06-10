package junitDemo;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class CountTest {

	//ʵ���������࣬��֤add�����������߼�
	@Test
	public void testAdd() {
//		Count count =new Count();
//		int result = count.add(2, 2);
		
		int result = new Count().add(2, 2);
		//����ֵ��Ԥ���Ƿ�һ��
		assertEquals(result, 5);
	}
	
	//��֤��ʱ
	@Test(timeout = 100)
	public void testAdd2() throws InterruptedException {
		//��ʱģ��
		Thread.sleep(101);
		Count count =new Count();
		count.add(3, 3);
		
	}
	
	//��֤�׳��쳣���ó���Ϊ0���쳣ArithmeticException
	//������ֵ��쳣��Ԥ�ڵ��쳣һ�£���ͨ��
	@Test(expected = ArithmeticException.class)
	public void testDivision() {
		new Count().division(2, 0);
	}
	
	//����������������ִ��
	@Ignore
	@Test
	public void testAdd3() {
		Count count = new Count();
	    int result = count.add(5, 5);
		assertEquals(result, 9);
		
		
		
	}
	
	
}
