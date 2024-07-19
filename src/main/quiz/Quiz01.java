package main.quiz;

import main.Calc;

public class Quiz01 {

	public static void main(String[] args) {

		Calc calc = new Calculator();

		// 자식타입 변수 = (자식타입) 부모 변수
		// 자식클래스에서 부모클래스로부터 상속 받지 않은 메소드를 사용하기 위한 강제 형변환(다운 캐스팅)
		if (calc instanceof Calculator) { // 형변환 확인
			Calculator calculator = (Calculator) calc;
			calculator.showInfo();

			// 부모타입 변수 = (부모타입) 자식 변수
			// 업캐스팅
			Calc calc2 = (Calc) calculator;
			System.out.println(calc2.add(5, 10));
			System.out.println(calc2.subStract(5, 10));
			System.out.println(calc2.times(5, 10));
			System.out.println(calc2.divide(5, 10));
		}
	}
}

//계산기(인터페이스)의 구현 클래스
class Calculator implements Calc { // 인터페이스 상속 키워드: implements

	@Override
	public int add(int num1, int num2) {
		int add = num1 + num2;
		return add;
	}

	@Override
	public int subStract(int num1, int num2) {
		return num1 - num2;
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
		System.out.println("Calc 인터페이스를 구현");
	}

}