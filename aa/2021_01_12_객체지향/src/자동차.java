public class 자동차 {

		public int 연식;
		public double 연비;
		public String 색상;
		public String 제조사;
		public String 차종;
		public String 차량이름;
		int 속도;
		private int price;
		
		public void 자동차() {
			
		}
		
		//자동차()=> 생성자 매소드는 안만들면 기본적으로 컴파일러가 자동으로 만든다.

		String get차종() { //프로그래머 사이에 get메소드 앞에 붙어있으면
			//필드에 접근해서 데이터를 읽어(가져)오는 것으로 인지
			return 차종;
		}
		
		String get제조사() {
			return 제조사;
		}
		
		public void set가격(int 가격) { //프로그래머 사이에 set메소드 앞에 붙어있으면
			//필드에 접슨해서 데이처를 쓰는(저장하는) 것으로 인지
			//setXXX()
			this.price = 가격;
		}

		public void set제조사(String 제조사) {
			this.제조사 = 제조사;
		}
		
		
		public void 가속() {
			속도 = 속도 + 10;
		}
		
		public void 가속(int value) {
			속도 = 속도 + value;
		}
		
		public void 감속() {
			if( 속도 <= 0) {
				속도 =0;
			}else {
				속도 = 속도 - 10;
			}
		}
		
		
		public void 네비게이션켜기() {
			
		}
		
}
