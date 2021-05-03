import java.util.Scanner;

public class 반복문의_기본_for문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
		int i;
		
		for(i=0; i < 5; i++)
		{
		System.out.printf("안녕하세요? 빙글빙글 for 문을 공부중입니다. ^^\n");
		}
		//1부터5까지합
		
		int j;
		int sum = 0;
		
		for(j = 1; j<=5; j++) {
			sum = sum +j;
		}			
			System.out.printf("1부터 5의 합은 %d 입니다.\n",sum);
	*/
	/*	
		int hap = 0;
		int i;
			
		for(i = 501; i <= 1000; i = i +2) {
			hap += i;
		}
		
	//	<다른 응용법>
	 //    for(i = 500; i <=1000: i++){
	     
		//	 if(i%2==1) {
			//	hap = hap +1
	     //    }
	  
		System.out.printf("500에서 1000까지이 홀수의 합: %d \n",hap);
	*/
	/*	
		Scanner s = new Scanner(System.in);
			//Scanner - 클래스 (API 클래스)
			// s - Scanner 클래스의 object
			// new Scanner(System.in) - 생성자
		
		int hap = 0;
		int i;
		int num;
		
		System.out.printf("값 입력 : ");
		num = s.nextInt();
		
		for(i = 1; i <= num; i++) {
			hap = hap + i;
		}
		
		System.out.printf("1에서 %d까지의 합 : %d \n", num, hap);
		System.out.printf("1에서 %d까지의 평균 : %d \n", num, hap/num);
	*/
	/*	
		Scanner s = new Scanner(System.in);
		
		int hap =0;
		int i;
		int num1, num2, num3;
		
		System.out.printf(" 시작값 입력 : ");
		num1 = s.nextInt();
		System.out.printf(" 끝값 입력 : ");
		num2 = s.nextInt();
		System.out.printf(" 증가값 입력 : ");
		num3 = s.nextInt();
		
		for(i = num1; i<=num2;i=i+num3) {
			hap = hap +i;
		}
		System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합: %d \n",num1, num2, num3,hap);
		
		
		int j,k;
		
		for(j = 0; j <3; j ++)
		{
			for(k =0; k <2; k++)
			{
				System.out.printf("중첩 for 문입니다. ( j값 : %d, k값 : %d)\n", j, k);
			}
		}
	*/	
		int j,h;
		
		for(j = 1; j <= 9; j++) {
			for(h = 2; h <= 9 ; h++) {
				System.out.printf(h+"X"+j+"="+h*j+"\t"); //가로로 구구단 나오는 식
			}
			System.out.printf("\n");
		}
		
		Scanner s = new Scanner(System.in);
		int a,b;
		char c;
	
		for( ; ;) {
			System.out.print("====계산기입니다=== \n");
			System.out.print("계산하시겠습니까?(y/n)");
			
			c = s.next().charAt(0);
			//s.next() 문장을 받아서 입력해준다
			//charAt() 입력받은 문장에서 ()안에 숫자로 순서를 정하여 원하는 단어를 뽐아준다
			
			if(c =='y') {
			  System.out.printf("더할 첫 번쨰 수 입력 : ");
			    a = s.nextInt();
			  System.out.printf("더할 두 번쨰 수 입력 : ");
			    b = s.nextInt();
			
			  System.out.printf("%d + %d = %d \n", a, b, a + b);
			}else
				break;
		}

		
		
		
		
		
		
		
		
		
	
		
		
	}

}
