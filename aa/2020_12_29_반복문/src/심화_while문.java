import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class 심화_while문 {

	public static void main(String[] args) /*throws IOException */{
		// TODO Auto-generated method stub
	/*		
		int hap = 0;
		int i =0;
		
		i=1;
		while(i <=10) {
			hap=hap+i;
			i++;
		}
		
		System.out.printf("1에서 10까지의 합: %d \n", hap);
	*/
	/*	
		Scanner s = new Scanner(System.in);
		int a =0,b=0;
		
		while(true) {
			
			try {
			System.out.printf("더할 첫 번째 수 입력 : ");
			a = s.nextInt();
			System.out.printf("더할 두 번째 수 입력 : ");
			b = s.nextInt();
			
			} catch (InputMismatchException e){
				
				System.out.printf("입력값에 오류가 있습니다");
			} finally{
				System.out.printf("두 수 의 합은 : ",+(a+b));
				if(a==0 ||b==0) {
					break;
				 }	
			 }
		  }
	*/	
	/*	
		Scanner s = new Scanner(System.in);
		int k,j;
		char ch;
		
		while(true) {
			System.out.printf("계산할 첫번째 수를 입력 : ");
			k = s.nextInt();
			System.out.printf("계산할 두번째 수를 입력 : ");
			j = s.nextInt();
			System.out.printf("계산할 연산자를 입력하세요 : ");
			ch = (char) System.in.read();
			
			switch(ch) {
			case '+':
				System.out.printf("%d + %d = %d 입니다. \n", k, j, k+j); break;
			case '-':
				System.out.printf("%d - %d = %d 입니다. \n", k, j, k-j); break;
			case '*':
				System.out.printf("%d * %d = %d 입니다. \n", k, j, k*j); break;
			case '/':
				System.out.printf("%d / %d = %f 입니다. \n", k, j, k/(float)j); break;
			case '%':
				System.out.printf("%d %% %d = %d 입니다. \n", k, j, k%j); break;
			default:
				System.out.printf("연산자를 잘못 입력했습니다. \n");
			}
		}
    */
		/*
			Scanner s =  new Scanner(System.in);
			
			int n;
			char c;
			
			System.out.printf("대문자 하나를 입력하세요 : ");
			c = (char)System.in.read();
			
			System.out.println((int), c);
			
			if(c>=65 && c<=91) {
				c = (char)(c +32);
				System.out.println((char)(c+32));
				
			}else {
				System.out.println(c);
			}
		
			
			System.out.println((char)('A'+32));
			System.out.println((char)('B'+32));
			System.out.println((char)('C'+32));
		*/
		
			
			Scanner s =  new Scanner(System.in);
			int n;
			int menu;
			int temp = 0;
			int count = 0;
			
			do {
				System.out.println("주문 받겠습니다");
				
				if(count ==0) {
				System.out.print("1.카페라떼 2.카푸피노 3.아메리카노");
			}else {
				System.out.print("1.카페라떼 2.카푸피노 3.아메리카노 4.그만시킬래요");
			   }
				
				n = s.nextInt();
				if(n==4 && count ==0) {
					temp = n + 1;
				}else {
					temp =n;
				}
				
			
				switch (n) {
				
				case 1:
					System.out.print("카페라떼 주문하셨습니다");
					count++;
					break;
					
				case 2:
					System.out.print("카푸치노 주문하셨습니다");
					count++;
					break;
					
				case 3:
					System.out.print("아메라카노 주문하셨습니다");
					count++;
					break;
					
				case 4:
					System.out.print("주문하신 커피 준비하겠습니다");
					break;
					
					default:
						System.out.print("잘못 주문하셨습니다");
						break;
			 }
						
				
			}while(n != 4);
		
			
			
		/*	
			int hap = 0;
			int i;
			
			for(i =1; i <=100; i++) {
				hap = hap +i;
				
				if(hap >= 1000)
					break;
			}
			
			System.out.printf(" 1~100의 합에서 최초로 1000이 넘는 위치는? : %d\n", i);
		*/	
	/*		
		int hap = 0;
		int i;
		
		
	나가고싶어 : for(;;) {	
		 for (;;) {
		   for (i = 1; i <= 100; i++) {
			 if(i %3 !=0)
			 hap = hap + i;
			 if(hap > 2000) {
				 System.out.printf("%d\n", hap);
				 hap = 0;
				 break 나가고싶어;
			 }
		
		  }
		
		}	
	}		
		
	*/
	
	}

}
