package junitDemo;
import static org.junit.Assert.assertArrayEquals;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Count {

	//返回两个传入参数的和
	public int add(int x,int y) {
		return x+y;
	}
	
	//测试两个传入参数的商
	public int division(int x , int y ) {
		return x / y;
	}
	
	
}
