package Junitʹ��ʹ�õ�����;
/**
* @author ����:Jasen.liu
* @createDate ����ʱ�䣺2019��6��10�� ����3:49:43
*/
public class NoUseJunit {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		// ����add()
		int result = calculator.add(1, 2);
		if (result == 3) {
			System.out.println("add()������ȷ");
		}

		// ����sub()
		int result2 = calculator.sub(3, 1);
		if (result2 == 2) {
			System.out.println("sub()������ȷ");
		}
	}
}
//����Junit��횵�ʹ��main��������в���

