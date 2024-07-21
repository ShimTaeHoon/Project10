package main;

public interface Calc {

	// final int ERROR; < 인터페이스에서 변수를 선언하면 자동으로 상수가 된다.
	int ERROR = -999; // 에러 대체 값(에러 코드)

	// 인터페이스에서 메소드를 선언하면 자동으로 추상메소드가 된다.
	int add(int num1, int num2);

	int subStract(int num1, int num2);

	int times(int num1, int num2);

	double divide(double num1, double num2);
}
