package main;

public class Ex02 {

	public static void main(String[] args) {

		// 인터페이스로 형변환
		// 부모타입 변수 = 자식 객체 인스턴스화
		Calc calc = new Calculator();
		Calc calc2 = new Calculator();
		int ERROR = calc.ERROR;
		System.out.println(ERROR);

		// 자식타입 변수 = (자식타입) 부모 변수
		// 자식클래스에서 상속 받지 않은 메소드를 사용하기 위한 강제 형변환
		if (calc instanceof Calculator) {
			Calculator calculator = (Calculator) calc2;
			calculator.showInfo();
		}
	}

}
