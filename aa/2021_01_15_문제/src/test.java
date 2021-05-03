
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Buyer b = new Buyer(); //다향성(앱 캐스팅)
				//Product p = new 과자();
			b.buy(new 과자());
			b.buy(new 라면());
			b.buy(new 라면());
			b.buy(new 과자());
			b.buy(new 음료());
			b.summary();
		
	}

}
