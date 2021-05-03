public class 트럭 extends 자동차{

	int 적재량;
	
	트럭(){ //1. 서브클래스 생성자 호출위치에서 스킵 
		//4. 서브클래스 멤버들을 생성 
		
		System.out.println("서브클래스생성자 실행");
	}
	
	트럭(String s){
//		super(); //스트링에스인 부모를 생성자를 가지고싶으면 적으면 되고 슈퍼사이에 있는 에스는 아무거나 적어도 자동차에있는 +s+자리에 들어간다
		System.out.println("서브클래스 문자열을 출력하는 생성자입니다");
	}
	
	@Override
	void 감속() {
		System.out.println("트럭의 속도를 감소 시킵니다");
	}
	void 적재량알아보기() {
		
	}
}
