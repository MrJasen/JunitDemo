/*
 * ���ַ�������һ�� �������׼��� �ĸ��JUnit �ṩ��һ���������в�����ķ������в����׼���

�����׼���д����Ҫ��ѭ����ԭ��

1.����һ��������Ϊ�����׼�����ڣ�

2.ʹ��ע�� org.junit.runner.RunWith �� org.junit.runners.Suite.SuitClasses ����������ࡣ

3.�� org.junit.runners.Suite ��Ϊ���������ע�� RunWith������ʾ JUnit Ϊ�������ʹ���׼�������ִ�С�

4.����Ҫ����˲����׼��Ĳ��������������Ϊע�� SuiteClasses �Ĳ�����

5.��֤�������ʹ��public���Σ����Ҵ��ڹ����Ĳ����κβ����Ĺ��캯����

��������һ�������� runAllTest .
 */
package junitDemo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({CountTest.class,TestFixture.class,�ж�һ�����ǲ�������.class,�����Ƿ��ǰ��շ�������ĸִ��.class})

public class runAllTest {

}

//����Ҫ���еĲ�����ŵ� SuiteClasses �У����� runAllTest �����࣬��������ִ�в���������
