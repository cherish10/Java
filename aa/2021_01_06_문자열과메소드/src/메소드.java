import java.util.Scanner;
/*class myInt{
	int a;	
}
*/
class myChar{
	char x;
	char y;
}
public class �޼ҵ� {
	/*
	static int coffee_machine(int button) {
		System.out.printf("\n#1.(�ڵ�����) �߰ſ� ���� �غ��Ѵ�\n");
		System.out.printf("\n#2.(�ڵ�����) �������� �غ��Ѵ�\n");
		
		switch(button) {
		case 1:
			System.out.printf("#3.(�ڵ�����) ����Ŀ�Ǹ� ź��\n"); break;
		case 2:
			System.out.printf("#3.(�ڵ�����) ����Ŀ�Ǹ� ź��\n"); break;
		case 3:
			System.out.printf("#3.(�ڵ�����) ��Ŀ�Ǹ� ź��\n"); break;
		default:
			System.out.printf("#3.(�ڵ�����) �ƹ��ų� ź��\n"); break;
		}
		
		System.out.printf("#4.(�ڵ�����) ���� �״´�\n");
		System.out.printf("#5.(�ڵ�����) ��Ǭ���� ��� ���δ�\n");
		
		return 0;
		
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int coffee;
		int ret;
		
		System.out.printf("� Ŀ�� �帱���? (1:����, 2:����, 3:��)");
		coffee = s.nextInt();
		
		ret = coffee_machine(coffee);
		
		System.out.printf("�մ�~ Ŀ�� ���� �ֽ��ϴ�.\n");
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
			System.out.printf("100�� 200�� plus() �޼ҵ� ����� : %d\n",hap);
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
		
		
		
		System.out.printf("��� �Է� (1:+,2:-,3:*,4:/) : ");
		oper = s.nextInt();
		
		System.out.printf("ù��° ���ڸ� �Է� : ");
		a =s.nextInt();
		System.out.printf("�ι�° ���ڸ� �Է� : ");
		b =s.nextInt();
		
		res = calc(a,b,oper);
		
		System.out.printf("��� ����� : %d\n",res);
		
	}
	*/
/*	
	static void func1(int a){
		a = a +1;
		System.out.printf("���޹��� a ==> %d\n",a);
	}
	
	public static void main(String[] args) {
		int a = 10;
		
		func1(a);
		System.out.printf("func1() ���� ���� a ==> %d\n",a);
	}
	*/
/*	
	static void func1(myInt m) {
		m.a = m.a +1;
		System.out.printf("���� ���� a ==> %d\n",m.a);
	}
	
	public static void main(String[] args) {
		myInt m = new myInt();
		m.a =10;
		
		func1(m);
		System.out.printf("func1() ���� ���� a ==> %d\n",m.a);
	}
*/
/*	
	static void func1(int a) {
		a = a+ 1;
		System.out.printf("���޹��� a ==> %d\n",a);
	}
	
	public static void main(String[] args) {
		int a = 10;
		
		func1(a);
		System.out.printf("func1() ���� ���� a ==> %d\n",a);
	}
	*/
/*	
	static void func1(myInt m) {
		m.a = m.a +1;
		System.out.printf("���޹��� a ==> %d\n",m.a);
	}
	
	public static void main(String[] args) {
		myInt m = new myInt();
		
		m.a = 10;
		
		func1(m);
		System.out.printf("���� ���� a ==>%d\n",m.a);
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
		System.out.printf("���� ��    :x=%c, y=%c\n", x,y);
		func1(x,y);
		System.out.printf("���� ������ �� : x = %c, y = %c\n\n", x ,y);
		
		myChar ch = new myChar();
		ch.x = 'A';
		ch.y = 'Z';
		System.out.printf("���� ��    :x=%c, y=%c\n",ch.x, ch.y);
		func2(ch);
		System.out.printf("�ּҸ� ������ �� : x = %c, y = %c\n\n", ch.x ,ch.y);
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}




