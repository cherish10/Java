import java.util.Scanner;

public class 실습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1"+"2"); //문장 취급 12
		System.out.println(true + ""); //문장 취급 true
		System.out.println('A'+'B'); //문자 취급 (내부적으로 정수 취급)A=65 B=66 131
		System.out.println('1'+2); //문자 취급 1 = 49 +2 51
		System.out.println('1'+'2'); //문자 취급 1=49 2=50 99
		System.out.println('J'+"ava");//문장 취급
		/*System.out.println(true + null);*/ //오류 발생
		
		Scanner s = new Scanner(System.in);
	/*	
		int max ;
		int 사과수;
		
		System.out.println("사과를 바구니에 담아 봅시다");
		
		System.out.print("한 바구니에 담을 수 있는 최대 사과 개수를 입력하세요 : ");
		max = s.nextInt();
		System.out.print("현재 사과 개수를 입력하세요 : ");
		사과수 = s.nextInt();
		
		if((사과수 % max) >0){
			System.out.println((사과수/max)+1 + " 개의 바구니가 필요합니다");
		}else {
			System.out.println((사과수/max) + " 개의 바구니가 필요합니다");
		}
	*/
	/*	
		int a;
		
		System.out.println("입력 정수의 영역 판단 프로그램입니다");
		
		System.out.print("정수를 입력하세요 : ");
		
		try {
			a = s.nextInt();
		
			if(a>=0) {
				if(a > 0) {
					System.out.printf("입력하신 정수는 %d는 양수입니다. \n",a);
				}else {
					System.out.printf("입력하신 정수는 %d는 0 입니다 \n",a);
				}	
		
			}else{
				System.out.printf("입력하신 정수는 %d는 음수 입니다 \n",a);
			}
		
		}catch (Exception e) {
			System.out.println("입력 값이 잘못되었습니다");
			} //s.next()-만약 무한루프에 걸리면 s.next를  밑에 입력하여 멈추게 한다

			//s.next();
	*/
	/*	
		System.out.println("2x + 4y = 10 양의 해를 구합니다");
		int x,y;
		
		for(x =0; x <=5; x++) {
			for(y =0; y <=2; y++) {
				if((2*x)+(4*y)==10) {
					System.out.printf("x = %d, y = %d \n",x,y);
				}
			}
		}
	*/
		
		
		int i;
		
		int n = 0;
		int count = 0;
		
		n = (int)(Math.random()*100);
		
		System.out.println("0~100 사이의 값을 맞쳐보세요~");
		for(;;) {
	
		System.out.print("정수를 입력하세요 : ");
		
		i = s.nextInt();
		count++; 
		
			if(n>i) {
				System.out.println("입력하신 값은 작습니다.");
			}else if(n<i) {
				System.out.println("입력하신 값은 큽니다.");
			}else {
				System.out.println("딩동댕~");
				System.out.printf("총 %d회 만에 정답을 맞추엇습니다",count);
				break;
			}
		}
		
	}
}
