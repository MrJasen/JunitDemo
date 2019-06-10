package Junit使不使用的区别;
/**
* @author 作者:Jasen.liu
* @createDate 创建时间：2019年6月10日 下午3:49:43
*/
public class NoUseJunit {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		// 测试add()
		int result = calculator.add(1, 2);
		if (result == 3) {
			System.out.println("add()方法正确");
		}

		// 测试sub()
		int result2 = calculator.sub(3, 1);
		if (result2 == 2) {
			System.out.println("sub()方法正确");
		}
	}
}
//不用Junit必須得使用main方法來进行测试

