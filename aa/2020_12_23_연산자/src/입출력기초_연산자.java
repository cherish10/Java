
public class 입출력기초_연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p,t = 5, r = 3;
		
		p = t + r;
		
		System.out.printf("%d + %d = %d \n",t ,r ,p);
		
		
	
		
		int a = 2, b = 3, c = 4;
		int result1, mok, namugi;
		float result2;
		
		result1 = a + b - c;
		System.out.printf("%d + %d - %d = %d \n", a , b , c ,result1);
		
		result1 = a + b * c;
		System.out.printf("%d + %d * %d = %d \n", a , b , c ,result1);
		
		result2 = a * b / (float) c;
		System.out.printf("%d * %d / %d = %f \n", a , b , c ,result2);
		
		mok = c / b;
		System.out.printf("%d / %d 의 몫은 %d \n", c , b ,mok);
		
		namugi = c % b;
		System.out.printf("%d / %d 의 나머지는 %d \n", c , b ,namugi);
		
		
		int x =100, y =200;
		
		System.out.printf("%d == %d 는 %s 이다. \n", x, y, x == y);
		System.out.printf("%d != %d 는 %s 이다. \n", x, y, x != y);
		System.out.printf("%d > %d 는 %s 이다. \n", x, y, x > y);
		System.out.printf("%d < %d 는 %s 이다. \n", x, y, x < y);
		System.out.printf("%d >= %d 는 %s 이다. \n", x, y, x >= y);
		System.out.printf("%d <= %d 는 %s 이다. \n", x, y, x <= y);
		
		System.out.printf("%d = %d 는 %s 이다. \n", x, y, x = y);
		
		
		int z = 10;
		
		z++;
		System.out.printf(" z ++ ==> %d \n", z);
		
		z--;
		System.out.printf(" z -- ==> %d \n", z);
		
		z += 5;
		System.out.printf(" z += 5 ==> %d \n", z);
		
		z-= 5;
		System.out.printf(" z -= 5 ==> %d \n", z);
		
		z *= 5;
		System.out.printf(" z *= 5 ==> %d \n", z);
		
		z /= 5;
		System.out.printf(" z /= 5 ==> %d \n", z);
		
		z %= 5;
		System.out.printf(" z %%= 5 ==> %d \n", z);
		
		
		
		
	}

}
