package main;

public class Ex01 {

	public static void main(String[] args) {

		//d
		Calculator calculator = new Calculator();

		int add = calculator.add(5, 10);
		int subStract = calculator.subStract(5, 10);
		int times = calculator.times(5, 10);
		double divide = calculator.divide(5, 10);

		System.out.println(add);
		System.out.println(subStract);
		System.out.println(times);
		System.out.println(divide);
		calculator.showInfo();
		System.out.println();
		System.out.println(calculator.add(5, 10));
		System.out.println(calculator.subStract(5, 10));
		System.out.println(calculator.times(5, 10));
		System.out.println(calculator.divide(5, 10));

	}

}

// 계산기(인터페이스)의 구현 클래스
class Calculator implements Calc { // 인터페이스 상속 키워드: implements

	@Override
	public int add(int num1, int num2) {
		int add = num1 + num2;
		return add;
	}

	@Override
	public int subStract(int num1, int num2) {
		int subStract = num1 - num2;
		return subStract;
	}

	@Override
	public int times(int num1, int num2) {
		int times = num1 * num2;
		return times;
	}

	@Override
	public double divide(double num1, double num2) {
		return num1 / num2;
	}

	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현했다.");
	}

}