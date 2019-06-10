/*
 * 这种方法引入一种 “测试套件” 的概念，JUnit 提供了一种批量运行测试类的方法，叫测试套件。

测试套件的写法需要遵循以下原则：

1.创建一个空类作为测试套件的入口；

2.使用注解 org.junit.runner.RunWith 和 org.junit.runners.Suite.SuitClasses 修饰这个空类。

3.将 org.junit.runners.Suite 作为参数传入给注解 RunWith，以提示 JUnit 为此类测试使用套件运行器执行。

4.将需要放入此测试套件的测试类组成数组作为注解 SuiteClasses 的参数。

5.保证这个空类使用public修饰，而且存在公开的不带任何参数的构造函数。

单独创建一个测试类 runAllTest .
 */
package junitDemo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({CountTest.class,TestFixture.class,判断一个数是不是素数.class,测试是否是按照方法首字母执行.class})

public class runAllTest {

}

//把需要运行的测试类放到 SuiteClasses 中，运行 runAllTest 测试类，即可批量执行测试用例。
