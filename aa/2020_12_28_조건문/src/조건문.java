import java.util.Scanner;

public class ���ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	
		System.out.println("---if��---");
		System.out.println("1)");
		
		int a = 99;
	    
		if (a < 100) 
			System.out.printf("100���� �۱���..\n");
		
		System.out.println("2)");
		
	    int b =200;
	    
	    if (b < 100)
	    	System.out.printf("100���� �۱���..\n");
	    else
	    	System.out.printf("100���� ũ����..\n");
	    
	    System.out.println("3)");
	    
	    Scanner s = new Scanner(System.in);
		int c; //����
		
		System.out.printf("������ �Է��ϼ��� : ");
		c = s.nextInt();
		
		if(c / 2 == 0) {
			System.out.printf("¦���� �Է��߱���..\n");
		}else {
			System.out.printf("Ȧ���� �Է��߱���..\n");
		}
		
	   //Scanner s - ������ Ÿ���� API �żҵ��̱� ������ s ��� �̸��� ���ÿ�
		//������ ������ ���� ���빰(object)�� ���� ������ ��
		//import java until Scanner; - *�̸� ���� �Ǿ� �ִ� Ŭ����*
		// Ŭ�����̸� object ���� = new Ŭ�����̸�();
	*/	
	/*
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		v = s1.nextDouble();
		
		if(v > 100.0) {
			System.out.printf("100���� ���� �� \n");	
		}
		
		Scanner s = new Scanner(System.in);
		
		int h;
		System.out.print("�⵵�� �Է��ϼ��� : ");
		
		h = s.nextInt();
		
		if(h %4 == 0 && h % 100 !=0) {
			System.out.printf("�Է��Ͻ� �⵵ %d�� ���� �Դϴ�.\n", h);
		} else {
			System.out.printf("�Է��Ͻ� �⵵ %d�� ������ �ƴմϴ�.\n",h);
		}
	*/	
	/*	
		int d = 75;
		
		if (d >= 50) {
		   if ( d < 100) {
			   System.out.printf("50���� ũ�� 100���� �۱���..\n");
		   } else {
			   System.out.printf("��~~100���� ũ����..\n");
		   }
		}else {
		  System.out.printf("�ְ�~ 50���� �۱���..\n");
		}
	*/
		/*
		int n;
		
		Scanner s = new Scanner(System.in);
		
		
		while(true) { //���ѹݺ�
			System.out.println("�ڿ��� ũ�� �Ǻ� ���α׷��Դϴ�.");
			
			System.out.printf("�Ǻ��� �ڿ����� �Է��ϼ���(���Ḧ ���Ͻø� -1�Է�) : ");
			
			n = s.nextInt(); // ��ĳ�� s ������Ʈ�� Ȱ���ؼ� ������ �Է¹��� n ������ �־��ش�.
			
			if(n == -1) //���� n���� -1�̸� ���� ������ �����Ѵ�.
				break;
			
			if( n >= 50) { // ���� n���� 50���� ũ�ų� ������ ���� ����� �����Ѵ�.
				
				if( n <100) { //���� n���� 50���� ũ�ų� ������ ���� ����� �����Ѵ�.
					// && ���� n���� 100���� ������ ���� ����� �����Ѵ�.
					System.out.println("�Է��� �ڿ����� 50-100���̿� �ֳ׿�~");
				} else {
					System.out.println("�Է��Ͻ� �ڿ����� 100���� Ů�ϴ�.");
				}
			}else {
				System.out.println("50���� ���� ���� �Է��ϼ̽��ϴ�.");
			}	
		
		int y;
			
		if(y %3 == 0 ) {
			if( y % 4==0) {
			System.out.printf("�Է��Ͻ� ���� 3�� 4�� ������Դϴ�.");
		    }else {
			System.out.printf("�Է��Ͻ� ���� 3�� ����Դϴ�.");
		    }
	      }else {
		    System.out.printf("�Է��Ͻ� ���� 3�� ����� �ƴմϴ�.");
           }
	*/
	//	if(n % 3 == 0) && if (n % 4 == 0)
	
	/*
		Scanner s = new Scanner(System.in);
		int h =-50;
		
		if(h<0) {
			System.out.printf("�Է��Ͻ� ���� %d �Դϴ�", h*-1);
		}else {
			System.out.printf("�Է��Ͻ� ���� %d �Դϴ�", h);
		}
	*/
	
		Scanner s = new Scanner(System.in);
	/*	int a;
		
		System.out.printf("������ �Է��ϼ��� : ");
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
		
		System.out.printf(" ���� �Դϴ�. \n");
	*/
	/*	int d;
		
		System.out.printf("1 ~ 4 �߿� �����ϼ��� : ");
		d = s.nextInt();
		
		switch (d ) {
		case 1 :
			System.out.printf("1�� �����ߴ�\n");
			break;
		case 2 :
			System.out.printf("2�� �����ߴ�\n");
			break;
		case 3 :
			System.out.printf("3�� �����ߴ�\n");
			break;
		case 4 :
			System.out.printf("4�� �����ߴ�\n");
			break;
		  default:
			  System.out.printf("�̻��Ѱ� �����ߴ�.\n");
		}	
	*/	
		int year;
		
		System.out.printf("��������� �Է��ϼ��� : ");
		year = s.nextInt();
		switch( year % 12) {
		case 0 : System.out.printf("�����̶�\n"); break;
		case 1 : System.out.printf("�߶�\n"); break;
		case 2 : System.out.printf("����\n"); break;
		case 3 : System.out.printf("������\n"); break;
		case 4 : System.out.printf("���\n"); break;
		case 5 : System.out.printf("�Ҷ�\n"); break;
		case 6 : System.out.printf("ȣ���̶�\n"); break;
		case 7 : System.out.printf("�䳢��\n"); break;
		case 8 : System.out.printf("���\n"); break;
		case 9 : System.out.printf("���\n"); break;
		case 10 : System.out.printf("����\n"); break;
		case 11 : System.out.printf("���\n"); break;
		}
		
		int month;
		
		System.out.printf("���� �Է��ϼ��� : ");
		month = s.nextInt();
		switch(month) {
		case 12 :
		case 1 :
		case 2 :
			System.out.printf("�ܿ�"); break;
		case 3 :
		case 4 :
		case 5 :
			System.out.printf("��"); break;
		case 6 :
		case 7 :
		case 8 :
			System.out.printf("����"); break;
		case 9 :
		case 10 :
		case 11 :
			System.out.printf("����"); break;
		}
		
		
		
		
   }
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		