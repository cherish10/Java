import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ��ȭ_while�� {

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
		
		System.out.printf("1���� 10������ ��: %d \n", hap);
	*/
	/*	
		Scanner s = new Scanner(System.in);
		int a =0,b=0;
		
		while(true) {
			
			try {
			System.out.printf("���� ù ��° �� �Է� : ");
			a = s.nextInt();
			System.out.printf("���� �� ��° �� �Է� : ");
			b = s.nextInt();
			
			} catch (InputMismatchException e){
				
				System.out.printf("�Է°��� ������ �ֽ��ϴ�");
			} finally{
				System.out.printf("�� �� �� ���� : ",+(a+b));
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
			System.out.printf("����� ù��° ���� �Է� : ");
			k = s.nextInt();
			System.out.printf("����� �ι�° ���� �Է� : ");
			j = s.nextInt();
			System.out.printf("����� �����ڸ� �Է��ϼ��� : ");
			ch = (char) System.in.read();
			
			switch(ch) {
			case '+':
				System.out.printf("%d + %d = %d �Դϴ�. \n", k, j, k+j); break;
			case '-':
				System.out.printf("%d - %d = %d �Դϴ�. \n", k, j, k-j); break;
			case '*':
				System.out.printf("%d * %d = %d �Դϴ�. \n", k, j, k*j); break;
			case '/':
				System.out.printf("%d / %d = %f �Դϴ�. \n", k, j, k/(float)j); break;
			case '%':
				System.out.printf("%d %% %d = %d �Դϴ�. \n", k, j, k%j); break;
			default:
				System.out.printf("�����ڸ� �߸� �Է��߽��ϴ�. \n");
			}
		}
    */
		/*
			Scanner s =  new Scanner(System.in);
			
			int n;
			char c;
			
			System.out.printf("�빮�� �ϳ��� �Է��ϼ��� : ");
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
				System.out.println("�ֹ� �ްڽ��ϴ�");
				
				if(count ==0) {
				System.out.print("1.ī��� 2.īǪ�ǳ� 3.�Ƹ޸�ī��");
			}else {
				System.out.print("1.ī��� 2.īǪ�ǳ� 3.�Ƹ޸�ī�� 4.�׸���ų����");
			   }
				
				n = s.nextInt();
				if(n==4 && count ==0) {
					temp = n + 1;
				}else {
					temp =n;
				}
				
			
				switch (n) {
				
				case 1:
					System.out.print("ī��� �ֹ��ϼ̽��ϴ�");
					count++;
					break;
					
				case 2:
					System.out.print("īǪġ�� �ֹ��ϼ̽��ϴ�");
					count++;
					break;
					
				case 3:
					System.out.print("�Ƹ޶�ī�� �ֹ��ϼ̽��ϴ�");
					count++;
					break;
					
				case 4:
					System.out.print("�ֹ��Ͻ� Ŀ�� �غ��ϰڽ��ϴ�");
					break;
					
					default:
						System.out.print("�߸� �ֹ��ϼ̽��ϴ�");
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
			
			System.out.printf(" 1~100�� �տ��� ���ʷ� 1000�� �Ѵ� ��ġ��? : %d\n", i);
		*/	
	/*		
		int hap = 0;
		int i;
		
		
	������;� : for(;;) {	
		 for (;;) {
		   for (i = 1; i <= 100; i++) {
			 if(i %3 !=0)
			 hap = hap + i;
			 if(hap > 2000) {
				 System.out.printf("%d\n", hap);
				 hap = 0;
				 break ������;�;
			 }
		
		  }
		
		}	
	}		
		
	*/
	
	}

}
