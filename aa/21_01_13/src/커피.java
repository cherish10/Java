public class 커피 {
	
	private String 원산지;//인스턴스 별ㄹ수
	private String 종류;
	private int 가격;
	static int 판매수량; //클래스 변수
	
	void get판매수량() {
		System.out.println(판매수량);
	}
	
	public 커피() {
		
	}
	static void 커피수량() {
		
		System.out.println("아직 재고 파악이 안되었음");
	}
	public 커피(String s,String ss) {
		원산지 = s;
		종류 = ss;
	}
	
	public 커피(String s) {
		원산지 = s;
	}
	
	public 커피(String s,int i) {
		원산지 = s;
	}
	
	public void set원산지(String s) {//설정자(set) 결정자(get)
		원산지 = s;
	}
	
	public String get원산지() {
		return 원산지;
	}
	
	public void 내린다() {
		
	}

	public void 볶는다() {
	
	}
	
}