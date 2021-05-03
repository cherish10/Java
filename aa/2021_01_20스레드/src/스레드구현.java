
public class 스레드구현 {

	public static void main(String[] args) {
		class Car extends Thread{//다른 클래스를 상속 받을 수 없기 때문
			//인터페이스를 활용하여 스레드 기능을 수행 할수있도록 지원
			
			String carName;
			
			Car(String carName) {
				this.carName = carName;
			}
			
			public void run() {
				for (int i = 0; i<3; i++) {
					try {
						Thread.sleep(10);//초수(1000 = 1초)
						System.out.println(carName + "~~달립니다.");
					}catch (Exception e) {
						
					}
				}
			}
		}

		Car car1 = new Car("$자동차1");
		car1.start();
		
		Car car2 = new Car("@자동차2");
		car2.start();
		
		Car car3 = new Car("*자동차3");
		car3.start();
		
	}

}