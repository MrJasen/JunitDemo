/*
 * JUnit ���Է���
JUnit ���ṩ�Ķ��Է���:

����	˵��
assertArrayEquals(expecteds, actuals)	�鿴���������Ƿ���ȡ�
assertEquals(expected, actual)	�鿴���������Ƿ���ȡ��������ַ����Ƚ�ʹ�õ�equals()������
assertNotEquals(first, second)	�鿴���������Ƿ���ȡ�
assertNull(object)	�鿴�����Ƿ�Ϊ�ա�
assertNotNull(object)	�鿴�����Ƿ�Ϊ�ա�
assertSame(expected, actual)	�鿴��������������Ƿ���ȡ�������ʹ�á�==���Ƚ���������
assertNotSame(unexpected, actual)	�鿴��������������Ƿ���ȡ�������ʹ�á�!=���Ƚ���������
assertTrue(condition)	�鿴���н���Ƿ�Ϊtrue��
assertFalse(condition)	�鿴���н���Ƿ�Ϊfalse��
assertThat(actual, matcher)	�鿴ʵ��ֵ�Ƿ�����ָ����������
fail()	�ò���ʧ�ܡ�
 */
package junitDemo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
 * ʹ��assertTrue�ж�һ�����ǲ�������
 */
public class �ж�һ�����ǲ������� {

	public static boolean Prime(int n) {
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}

	@Test
	public void testPrime() {
		int n = 7;
		assertTrue(�ж�һ�����ǲ�������.Prime(n));
	}
	
	
	
	
	
}






