import java.util.Scanner;
/*class myInt{
	int a;	
}
*/
class myChar{
	char x;
	char y;
}
public class 메소드 {
	/*
	static int coffee_machine(int button) {
		System.out.printf("\n#1.(자동으로) 뜨거운 물을 준비한다\n");
		System.out.printf("\n#2.(자동으로) 종이컵을 준비한다\n");
		
		switch(button) {
		case 1:
			System.out.printf("#3.(자동으로) 보통커피를 탄다\n"); break;
		case 2:
			System.out.printf("#3.(자동으로) 설탕커피를 탄다\n"); break;
		case 3:
			System.out.printf("#3.(자동으로) 블랙커피를 탄다\n"); break;
		default:
			System.out.printf("#3.(자동으로) 아무거나 탄다\n"); break;
		}
		
		System.out.printf("#4.(자동으로) 물을 붓는다\n");
		System.out.printf("#5.(자동으로) 스푼으로 저어서 녹인다\n");
		
		return 0;
		
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int coffee;
		int ret;
		
		System.out.printf("어떤 커피 드릴까요? (1:보통, 2:설탕, 3:블랙)");
		coffee = s.nextInt();
		
		ret = coffee_machine(coffee);
		
		System.out.printf("손님~ 커피 여기 있습니다.\n");
	}
			  
*/	
	/*
		static int plus(int v1, int v2) {
			int result;
			result = v1 + v2;
			return result;
		}
		
		public static void main(String[] args) {
			int hap;
			hap = plus(100,200);
			System.out.printf("100과 200의 plus() 메소드 결과는 : %d\n",hap);
		}
	*/	
	/*
	static int calc(int v1, int v2, int op) {
		int result;
		
		switch(op) {
		case 1: result = v1 + v2; break;
		case 2: result = v1 - v2; break;
		case 3: result = v1 * v2; break;
		case 4: result = v1 / v2; break;
		default : result = 0;
		}
		
		return result;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int res;
		int oper,a,b;
		
		
		
		System.out.printf("계산 입력 (1:+,2:-,3:*,4:/) : ");
		oper = s.nextInt();
		
		System.out.printf("첫번째 숫자를 입력 : ");
		a =s.nextInt();
		System.out.printf("두번째 숫자를 입력 : ");
		b =s.nextInt();
		
		res = calc(a,b,oper);
		
		System.out.printf("계산 결과는 : %d\n",res);
		
	}
	*/
/*	
	static void func1(int a){
		a = a +1;
		System.out.printf("전달받은 a ==> %d\n",a);
	}
	
	public static void main(String[] args) {
		int a = 10;
		
		func1(a);
		System.out.printf("func1() 실행 후의 a ==> %d\n",a);
	}
	*/
/*	
	static void func1(myInt m) {
		m.a = m.a +1;
		System.out.printf("전달 받은 a ==> %d\n",m.a);
	}
	
	public static void main(String[] args) {
		myInt m = new myInt();
		m.a =10;
		
		func1(m);
		System.out.printf("func1() 실행 후의 a ==> %d\n",m.a);
	}
*/
/*	
	static void func1(int a) {
		a = a+ 1;
		System.out.printf("전달받은 a ==> %d\n",a);
	}
	
	public static void main(String[] args) {
		int a = 10;
		
		func1(a);
		System.out.printf("func1() 실행 후의 a ==> %d\n",a);
	}
	*/
/*	
	static void func1(myInt m) {
		m.a = m.a +1;
		System.out.printf("전달받은 a ==> %d\n",m.a);
	}
	
	public static void main(String[] args) {
		myInt m = new myInt();
		
		m.a = 10;
		
		func1(m);
		System.out.printf("실행 후의 a ==>%d\n",m.a);
	}
	*/
	
	static void func1(char x,char y) {
		char imsi;
		imsi = x;
		x = y;
		y = imsi;
	}
	
	static void func2(myChar ch) {
		char imsi;
		imsi = ch.x;
		ch.x = ch.y;
		ch.y = imsi;
	}
	
	public static void main(String[] args) {
		
		char x = 'A',y = 'Z';
		System.out.printf("원래 값    :x=%c, y=%c\n", x,y);
		func1(x,y);
		System.out.printf("값을 전달한 후 : x = %c, y = %c\n\n", x ,y);
		
		myChar ch = new myChar();
		ch.x = 'A';
		ch.y = 'Z';
		System.out.printf("원래 값    :x=%c, y=%c\n",ch.x, ch.y);
		func2(ch);
		System.out.printf("주소를 전달한 후 : x = %c, y = %c\n\n", ch.x ,ch.y);
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}




