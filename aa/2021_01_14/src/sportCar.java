
public class sportCar extends 자동차 {
	

	boolean Turbo; //speed 변수 + 색상필드( 자동차 슈퍼클래스)
	
	
	void speedUp(int s) { //speedUp이라는 매소드를 상속하였지만 자식클래스에서 내용을 변경을 했다 매소드 오버라이딩
		
		speed = speed + s;
	}
}
