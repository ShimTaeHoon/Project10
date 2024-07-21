package main;

public class Ex3 {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		System.out.println(calculator.add(10, 5));
		System.out.println(calculator.subStract(10, 5));
		System.out.println(calculator.times(10, -5));
		System.out.println(calculator.divide(10, 50));
		System.out.println();

		NewCalculator cal = new NewCalculator();
		System.out.println(cal.add(10, 5));
		System.out.println(cal.subStract(10, 5));
		System.out.println(cal.times(10, -5));
		System.out.println(cal.divide(10, 50));
		System.out.println();
		
		Calc calculator2 = new NewCalculator();
		System.out.println(calculator2.add(10, 5));
		System.out.println(calculator2.subStract(10, 5));
		System.out.println(calculator2.times(10, -5));
		System.out.println(calculator2.divide(10, 50));
//		System.out.println(calculator2.tes);
		
	}

}

// 인터페이스 상속받을때는 implements
class NewCalculator implements Calc{

	@Override
	public int add(int num1, int num2) {
		
		return num1 + num2;
		
	}

	@Override
	public int subStract(int num1, int num2) {
		
		return num1 - num2;

	}

	@Override
	public int times(int num1, int num2) {
		
		if (num2 > 0) { // 양수일때 두 수 곱하기
			return num1 * num2;
		} else { // validation (검증), 음수가 나오면 에러코드 반환
			return Calc.ERROR; // -999
		}
	
	}

	// 첫번째숫자가 두번째숫자보다 더 작으면 에러코드 반환
	@Override
	public double divide(double num1, double num2) {

		if (num1 > num2) {
			return num1 / num2;
		} else {
			return Calc.ERROR;
		}
		
	}
	
}