package main;

import java.util.Scanner;

public class DBDriverQuiz {

	public static void main(String[] args) {
		
		System.out.println("드라이버를 선택하세요.");
		System.out.println("1 : mysql");
		System.out.println("2 : oracle");
		System.out.println("3 : postgres");
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		DBDriver dbdriver = null;
		
		if(num == 1) {
			dbdriver = new MySqlDBDriver();
		} else if(num == 2) {
			dbdriver = new OracleDBDriver();
		} else if(num == 3) {
			dbdriver = new PostgresDBDriver();
		} else {
			System.out.println("1~3사이의 숫자를 입력해주세요.");
		}
		
		if(dbdriver != null) {
			dbdriver.dbConnect();
		}
	}	
}

class MySqlDBDriver implements DBDriver {

	@Override
	public void dbConnect() {

		System.out.println("MySqlDriver에 연결합니다.");
		
	}
	
}

class OracleDBDriver implements DBDriver {

	@Override
	public void dbConnect() {
		System.out.println("Oracle DB에 연결합니다.");
	}

}

//11
class PostgresDBDriver implements DBDriver {

	@Override
	public void dbConnect() {
		
		System.out.println("Postgres DB에 연결합니다.");
		
	}
	
}
