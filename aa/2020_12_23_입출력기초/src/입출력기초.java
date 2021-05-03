
public class 입출력기초 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.printf("안녕하세요");
		System.out.printf("%d", 100);
		System.out.printf("%f", 100.00);
		
		System.out.println();
		
		System.out.print(100.00);
		System.out.print(100);
		System.out.print("안녕하세요");
		
		System.out.printf("\t");
		System.out.printf("100+100");
		System.out.printf("\n"); 
		System.out.printf("%d", 100+100);
		System.out.printf("\n");
		System.out.printf("300");
		System.out.printf("\n");
		System.out.printf("%f", 3.14);
		System.out.printf("\n");
		System.out.println("========");
		
		System.out.print(100);
		System.out.print("  ");
		System.out.print(200);
		System.out.print("  ");
		System.out.printf("\n");
		
		
		System.out.printf("%d %d %f", 100,200,3.14);
		System.out.printf("\n");
		System.out.println("========");
		
		System.out.printf("%c",'A');
		System.out.printf("\n");
		//%c =단어 잘안씀
		System.out.println("========");
		System.out.printf("%d + %d = %d", 100,200,300);
		System.out.printf("\n");
		System.out.printf("%d / %d = %f", 100,200,0.5);
		System.out.printf("\n");
		System.out.printf("%d + %d = %d", 100,200,100+200);
		System.out.printf("\n");
		System.out.printf("%d / %d = %f", 100,200,100.0/200.0);
		System.out.printf("\n");
		
	/*	
		System.out.println("==구구단==");
		System.out.printf("\n");
		
	
		int a;
		int b;
		
		a=1;
		b=2;
	
		
		System.out.printf("\n");
		System.out.printf("%d * %d = %d \n",a, b, a*b);
		System.out.printf("%d * %d = %d \n",a, b=b+1, a*b);
		System.out.printf("%d * %d = %d \n",a, b=b+1, a*b);
		System.out.printf("%d * %d = %d \n",a, b=b+1, a*b);
		System.out.printf("\n");

	*/	
		System.out.println("==16진수==");
		System.out.printf("%x",15);
		System.out.printf("\n");
		System.out.printf("%x",16);
		System.out.printf("\n");
		System.out.println("========");
		System.out.printf("%s ---- !!!! %s","안녕하세요","반갑습니다.");
		
		//%d = 10진수 정수
		//%f = 실수
		//%x = 16진수 정수
		//%s = 문장
		
		System.out.printf("\n");
		System.out.println("========");
		System.out.printf("%d\n", 123);
		System.out.printf("%5d\n", 123);
		System.out.printf("%05d\n", 123);
		
		System.out.printf("%f\n", 123.45);
		System.out.printf("%7.1f\n", 123.45);
		System.out.printf("%7.3f\n", 123.45);
		
		System.out.printf("%s\n", "Hi~Java");
		System.out.printf("%10s\n", "Hi~Java");
		System.out.println("========");
		System.out.printf("\n줄바꿈\n연습 \n");
		System.out.printf("\t탭키\t연습 \n");
		System.out.printf("이것을\r덮어씁니다 \n");
		System.out.printf("글자가 \"강조\"되는 효과 \n");
		System.out.printf("\\\\\\ 역슬래시 세개 출력 \n");		
/*
		System.out.println("==변수==");

		
		int a;
		float b;
		
		a = (int) 123.45f;
		b = 200;
		
		
		System.out.printf("a의 값 ==> %d \n", a);
		System.out.printf("b의 값 ==> %f \n", b);
		
		
		
	
		
		int a, b, c, d;
		
		a = 100 + 100;
		b = a + 100;
		c = a + b - 100;
		d = a + b + c;
		System.out.printf("a,b,c,d의 값 ==> %d,%d,%d,%d \n",a,b,c,d);
		
		a = b = c = d = 100;
		System.out.printf("a,b,c,d의 값 ==> %d,%d,%d,%d \n",a,b,c,d);
		
		a = 100;
		a = a + 200;
		System.out.printf("a의 값 ==> %d \n", a);
		
		System.out.println("==소수점이없는정수형==");
		
		int x =100, y=200;
		float result;
		
		result = x / y;
		
		System.out.printf("%f \n", result);
		
		System.out.println("==소수점이없는실수형==");
		
		float u = 0.1234567890123456789012345f;
		double g = 0.1234567890123456789012345;
		
		System.out.printf("%30.25f \n", u);
		System.out.printf("%30.25f \n", g);
		
	
	*/	
		
		System.out.println("========");
		
		char a,b,c,d,e;
		
		a = 'A';
		System.out.printf("%c \t",a);
		System.out.printf("%d \n",(int)a);
		
		b = 'a';
		c = (char) (b + 1);
		System.out.printf("%c \t",b);
		System.out.printf("%c \n",c);
		
		d = 90;
		System.out.printf("%c \n",d);
		
		d = '가';
		e = (char) (d + 1);
		System.out.printf("%d \t",(int) d);
		System.out.printf("%c \n",e);
	
		System.out.println("========");
		
		boolean boo1,boo2;
		
		boo1 = true;
		System.out.printf("%s \n", boo1);
		
		boo2 = (10 == 20);
		System.out.printf("%s \n", boo2);
		
		System.out.println("==문자열==");
		
		String str1 = "IT CookBook 입니다";
		String str2 = "10";
		String str3 = "20";
		
		str1 = "Java 입니다.";
		
		System.out.printf("%s \n", str1);
		System.out.printf("%s \n", str2 + str3);
		
 
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
	}

}
