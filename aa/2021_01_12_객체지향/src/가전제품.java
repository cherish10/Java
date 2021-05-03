
public class 가전제품 {
	 
	int 에너지등급;
	int 생산년도;
	String 브랜드;
	String 제품종류;
	String 색상;
	boolean 전원;
	int 가격;
	
	public 가전제품(int year,int 등급,int 구분자) {
		생산년도 = year;
		에너지등급 = 등급;
	}
	
	
	public 가전제품(int price,int 등급) {
		가격 = price;
		에너지등급 = 등급;
	}
	
	public 가전제품() {
		
	}
	
	
	public void 켜기() {
		if(전원 = true);
	}
	
	public void 메뉴실행() {
		if(전원) {
			System.out.println("메뉴를 실행합니다");
		}else {
			System.out.println("전원부터 켜주세요");
		}
	}
	


}
