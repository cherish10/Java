
public class Product{
	int price; //제품의 가격
	
	Product(int price){ //생성자
		 this.price = price;
	}
	
	//디폴트 생성자 없음
	//EX)Product 과자 = new Product(600); 생성자를 통해서
	//   과자.price => 600
}	
class 과자 extends Product{ //과자.콘칩 = new 과자();
	
	과자(){ // 생성자이며 구조는 디폴트 생성자 타입
		super(100); //price100
	}
	
	@Override //부모꺼를 받지만 내용을 바꿀수있게 하는 것
	public String toString() { //라이버리 오브젝트를 마음대로 쓸 수 있다.즉,오브젝트에서 상속받은 거니깐 사용이 가능하다.
		return"과자";
	}
	
}
	
class 라면 extends Product{
	라면(){
		super(150);
	}
	@Override
	public String toString() {
		return"라면";
	}
}

class 음료 extends Product{
	음료(){
		super(50);
	}
	@Override
	public String toString() {
		return"음료";
	}
}
	