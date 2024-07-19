package main;

public interface Calc {

	int ERROR = -999; // 에러 대체 값(에러 코드)

	int add(int num1, int num2);

	int subStract(int num1, int num2);

	int times(int num1, int num2);

	double divide(double num1, double num2);
}
