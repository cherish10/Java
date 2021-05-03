
public class 논리연산자_12_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	
		int a = 99;
		
		System.out.printf(" AND 연산 : %s \n", ( a >= 100) && ( a <= 200));
		System.out.printf(" OR 연산 : %s \n", ( a >= 100) || ( a <= 200));
		System.out.printf(" NOT 연산 : %s \n", !( a == 100));
		
		
		int num1 = 100, num2 = -200;
		
		boolean a = (num1 != 0);
		boolean b = (num2 != 0);
		
		System.out.printf(" 상수의 AND 연산 : %s \n", a && b);
		System.out.printf(" 상수의 OR 연산 : %s \n", a || b);
		System.out.printf(" 상수의 NOT 연산 : %s \n", !a);
	*/	
		System.out.println("=====");
		
		int x = 10; //1010
		System.out.printf("%d 를 왽쪽으로 1회 시프트하면 %d 이다.\n", x, x<<1);
		System.out.printf("%d 를 왽쪽으로 2회 시프트하면 %d 이다.\n", x, x<<2);
		System.out.printf("%d 를 왽쪽으로 3회 시프트하면 %d 이다.\n", x, x<<3);
		
		System.out.println("=====");
		
		int a = 100, result;
		int i;
		
		for(i = 1; i <= 5; i++) {
			result = a << i;
			System.out.printf("%d << %d = %d\n", a, i, result);
		}
		
		for(i = 1; i <= 5; i++) {
			result = a >> i;
		    System.out.printf("%d >> %d = %d\n", a, i, result); 
		}
		
		
		
		
	}

}
