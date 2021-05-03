import java.util.Scanner;

public class 조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	
		System.out.println("---if문---");
		System.out.println("1)");
		
		int a = 99;
	    
		if (a < 100) 
			System.out.printf("100보다 작군요..\n");
		
		System.out.println("2)");
		
	    int b =200;
	    
	    if (b < 100)
	    	System.out.printf("100보다 작군요..\n");
	    else
	    	System.out.printf("100보다 크군요..\n");
	    
	    System.out.println("3)");
	    
	    Scanner s = new Scanner(System.in);
		int c; //변수
		
		System.out.printf("정수를 입력하세요 : ");
		c = s.nextInt();
		
		if(c / 2 == 0) {
			System.out.printf("짝수를 입력했군요..\n");
		}else {
			System.out.printf("홀수를 입력했군요..\n");
		}
		
	   //Scanner s - 참조형 타입의 API 매소드이기 때문에 s 라는 이름은 스택에
		//저장이 되지만 실제 내용물(object)은 힙에 저장이 됨
		//import java until Scanner; - *미리 정의 되어 있는 클래스*
		// 클래스이름 object 선언 = new 클래스이름();
	*/	
	/*
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		v = s1.nextDouble();
		
		if(v > 100.0) {
			System.out.printf("100보다 작은 수 \n");	
		}
		
		Scanner s = new Scanner(System.in);
		
		int h;
		System.out.print("년도를 입력하세요 : ");
		
		h = s.nextInt();
		
		if(h %4 == 0 && h % 100 !=0) {
			System.out.printf("입력하신 년도 %d는 윤년 입니다.\n", h);
		} else {
			System.out.printf("입력하신 년도 %d는 윤년이 아닙니다.\n",h);
		}
	*/	
	/*	
		int d = 75;
		
		if (d >= 50) {
		   if ( d < 100) {
			   System.out.printf("50보다 크고 100보다 작군요..\n");
		   } else {
			   System.out.printf("와~~100보다 크군요..\n");
		   }
		}else {
		  System.out.printf("애개~ 50보다 작군요..\n");
		}
	*/
		/*
		int n;
		
		Scanner s = new Scanner(System.in);
		
		
		while(true) { //무한반복
			System.out.println("자연수 크기 판별 프로그랩입니다.");
			
			System.out.printf("판별할 자연수를 입력하세요(종료를 원하시면 -1입력) : ");
			
			n = s.nextInt(); // 스캐너 s 오브젝트를 활용해서 정수를 입력벋어 n 변수에 넣어준다.
			
			if(n == -1) //만약 n값에 -1이면 다음 문장을 실행한다.
				break;
			
			if( n >= 50) { // 만약 n값이 50보다 크거나 같으면 다음 블록을 실행한다.
				
				if( n <100) { //만약 n값이 50보다 크거나 같으면 다음 블록을 실행한다.
					// && 만약 n값이 100보다 작으면 다음 블록을 실행한다.
					System.out.println("입력한 자연수는 50-100사이에 있네요~");
				} else {
					System.out.println("입력하신 자연수는 100보다 큽니다.");
				}
			}else {
				System.out.println("50보다 작은 수를 입력하셨습니다.");
			}	
		
		int y;
			
		if(y %3 == 0 ) {
			if( y % 4==0) {
			System.out.printf("입력하신 값은 3과 4의 공배수입니다.");
		    }else {
			System.out.printf("입력하신 값은 3의 배수입니다.");
		    }
	      }else {
		    System.out.printf("입력하신 값은 3의 배수가 아닙니다.");
           }
	*/
	//	if(n % 3 == 0) && if (n % 4 == 0)
	
	/*
		Scanner s = new Scanner(System.in);
		int h =-50;
		
		if(h<0) {
			System.out.printf("입력하신 값은 %d 입니다", h*-1);
		}else {
			System.out.printf("입력하신 값은 %d 입니다", h);
		}
	*/
	
		Scanner s = new Scanner(System.in);
	/*	int a;
		
		System.out.printf("점수를 입력하세요 : ");
		a = s.nextInt();
		
		if(a>=90)
			System.out.printf("A");
		else
			if(a>=80)
				System.out.printf("B");
			else
				if(a>=70)
					System.out.printf("C");
				else
					if(a>=60)
					 System.out.printf("D");
					else
						System.out.printf("P");
		
		System.out.printf(" 학점 입니다. \n");
	*/
	/*	int d;
		
		System.out.printf("1 ~ 4 중에 선택하세요 : ");
		d = s.nextInt();
		
		switch (d ) {
		case 1 :
			System.out.printf("1을 선택했다\n");
			break;
		case 2 :
			System.out.printf("2을 선택했다\n");
			break;
		case 3 :
			System.out.printf("3을 선택했다\n");
			break;
		case 4 :
			System.out.printf("4을 선택했다\n");
			break;
		  default:
			  System.out.printf("이상한걸 선택했다.\n");
		}	
	*/	
		int year;
		
		System.out.printf("출생연도를 입력하세요 : ");
		year = s.nextInt();
		switch( year % 12) {
		case 0 : System.out.printf("원숭이띠\n"); break;
		case 1 : System.out.printf("닭띠\n"); break;
		case 2 : System.out.printf("개띠\n"); break;
		case 3 : System.out.printf("돼지띠\n"); break;
		case 4 : System.out.printf("쥐띠\n"); break;
		case 5 : System.out.printf("소띠\n"); break;
		case 6 : System.out.printf("호랑이띠\n"); break;
		case 7 : System.out.printf("토끼띠\n"); break;
		case 8 : System.out.printf("용띠\n"); break;
		case 9 : System.out.printf("뱀띠\n"); break;
		case 10 : System.out.printf("말띠\n"); break;
		case 11 : System.out.printf("양띠\n"); break;
		}
		
		int month;
		
		System.out.printf("월을 입력하세요 : ");
		month = s.nextInt();
		switch(month) {
		case 12 :
		case 1 :
		case 2 :
			System.out.printf("겨울"); break;
		case 3 :
		case 4 :
		case 5 :
			System.out.printf("봄"); break;
		case 6 :
		case 7 :
		case 8 :
			System.out.printf("여름"); break;
		case 9 :
		case 10 :
		case 11 :
			System.out.printf("가을"); break;
		}
		
		
		
		
   }
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		