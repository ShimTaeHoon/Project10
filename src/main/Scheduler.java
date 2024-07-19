package main;

public interface Scheduler {

	public void getNextCall(); // 다음 전화를 가져오는 메소드
	
	public void sendCallToAgent(); // 상담원에게 전화를 배분하는 메소드
	// {} 중괄호 없음. 추상메소드라서 구현부 없음 ; 으로 끝내줌
	
}
