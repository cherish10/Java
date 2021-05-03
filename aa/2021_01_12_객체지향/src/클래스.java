
import java.util.Scanner;
public class 클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		자동차 카니발 = new 자동차();
		// new 클래스명() => 생성자
		자동차 IG = new 자동차();
		자동차 아벤타도르 = new 자동차();
		자동차 아반떼 = new 자동차();
		자동차 G80 = new 자동차();
		자동차 쏘랜토 = new 자동차();
		자동차 level3 = new 자동차();
		
		자동차 포터[] = new 자동차[100];
		
		자동차 스타랙스[] = {new 자동차(), new 자동차()
				,new 자동차(), new 자동차()};
	
		스타랙스[0].색상 = "은색";
		
		쏘랜토.색상 = "검정";
		
		for(int i = 0;i<포터.length;i++) {
			포터[i] = new 자동차();
		}
		
		포터[0].색상 = "파랑";
		
		
		
		가전제품 LEDTV = new 가전제품();
		가전제품 의류관리기 = new 가전제품();
		
		LEDTV.가격=1000000;
		LEDTV.에너지등급 = 1;
		
		Scanner s = new Scanner(System.in);
		
		
		
		System.out.println(LEDTV.가격);
		System.out.println(쏘랜토.색상);
		System.out.println(쏘랜토.연비);
		
		
		포터[0].차종 = "상용차량";
		
		System.out.println(포터[0].get차종());
		
		포터[0].set제조사("현대");
		
		System.out.println(포터[0].제조사);
		
		System.out.println(포터[0].get제조사());
		
	
		스포츠카 람보르기니 = new 스포츠카("화이트");
		
		System.out.println(람보르기니.색상);
		
		스포츠카 페라리 = new 스포츠카();
		
		가전제품 세탁기 = new 가전제품();
		
		
	}

}
