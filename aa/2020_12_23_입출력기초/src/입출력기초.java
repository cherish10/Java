
public class ����±��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.printf("�ȳ��ϼ���");
		System.out.printf("%d", 100);
		System.out.printf("%f", 100.00);
		
		System.out.println();
		
		System.out.print(100.00);
		System.out.print(100);
		System.out.print("�ȳ��ϼ���");
		
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
		//%c =�ܾ� �߾Ⱦ�
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
		System.out.println("==������==");
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
		System.out.println("==16����==");
		System.out.printf("%x",15);
		System.out.printf("\n");
		System.out.printf("%x",16);
		System.out.printf("\n");
		System.out.println("========");
		System.out.printf("%s ---- !!!! %s","�ȳ��ϼ���","�ݰ����ϴ�.");
		
		//%d = 10���� ����
		//%f = �Ǽ�
		//%x = 16���� ����
		//%s = ����
		
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
		System.out.printf("\n�ٹٲ�\n���� \n");
		System.out.printf("\t��Ű\t���� \n");
		System.out.printf("�̰���\r����ϴ� \n");
		System.out.printf("���ڰ� \"����\"�Ǵ� ȿ�� \n");
		System.out.printf("\\\\\\ �������� ���� ��� \n");		
/*
		System.out.println("==����==");

		
		int a;
		float b;
		
		a = (int) 123.45f;
		b = 200;
		
		
		System.out.printf("a�� �� ==> %d \n", a);
		System.out.printf("b�� �� ==> %f \n", b);
		
		
		
	
		
		int a, b, c, d;
		
		a = 100 + 100;
		b = a + 100;
		c = a + b - 100;
		d = a + b + c;
		System.out.printf("a,b,c,d�� �� ==> %d,%d,%d,%d \n",a,b,c,d);
		
		a = b = c = d = 100;
		System.out.printf("a,b,c,d�� �� ==> %d,%d,%d,%d \n",a,b,c,d);
		
		a = 100;
		a = a + 200;
		System.out.printf("a�� �� ==> %d \n", a);
		
		System.out.println("==�Ҽ����̾���������==");
		
		int x =100, y=200;
		float result;
		
		result = x / y;
		
		System.out.printf("%f \n", result);
		
		System.out.println("==�Ҽ����̾��½Ǽ���==");
		
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
		
		d = '��';
		e = (char) (d + 1);
		System.out.printf("%d \t",(int) d);
		System.out.printf("%c \n",e);
	
		System.out.println("========");
		
		boolean boo1,boo2;
		
		boo1 = true;
		System.out.printf("%s \n", boo1);
		
		boo2 = (10 == 20);
		System.out.printf("%s \n", boo2);
		
		System.out.println("==���ڿ�==");
		
		String str1 = "IT CookBook �Դϴ�";
		String str2 = "10";
		String str3 = "20";
		
		str1 = "Java �Դϴ�.";
		
		System.out.printf("%s \n", str1);
		System.out.printf("%s \n", str2 + str3);
		
 
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
	}

}
