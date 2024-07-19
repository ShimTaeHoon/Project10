package main;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("1 : 한명씩 차례로 할당");
		System.out.println("2 : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("3 : 우선순위가 높은 고객 먼저 할당");
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		// 참조변수는 주소값이라 0으로 초기화 하는게 아니라 null로 초기화
		Scheduler scheduler = null; // 부모 타입으로 변수 선언
		
		// 입력받은 숫자에 따라 정책 선택
		if(num == 1) {
			scheduler = new RoundRobin(); // 자식 객체 생성 // 같은부모 Scheduler
			// 부모타입(Scheduler)으로 통일해서 코드가 깔끔해짐
		} else if(num == 2) {
			scheduler = new LeastJob(); // 같은부모 Scheduler
		} else if(num == 3) {
			scheduler = new PriorityAllocation(); // 같은부모 Scheduler
		} else {
			System.out.println("지원되지 않는 기능입니다.");
		}
		
		if(scheduler != null) {
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}
	}

}

// 상담원 한명씩 돌아가며 동일하게 상담 업무 배분
class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		
		System.out.println("다음 순서 상담원에게 전달합니다.");
		
	}
	
}

// 현재 상담 업무가 없거나 상담 대기가 가장 적은 상담원에게 배분
class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담 업무가 없거나 대기가 가장 적은 상담원에게 전달합니다.");
		
	}
	
}

class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("등급이 높은 고객의 전화를 먼저 가져옵니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무스킬이 높은 상담원에게 우선적으로 전달합니다.");
		
	}

}
