import java.util.Scanner;

public class �ݺ�����_�⺻_for�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
		int i;
		
		for(i=0; i < 5; i++)
		{
		System.out.printf("�ȳ��ϼ���? ���ۺ��� for ���� �������Դϴ�. ^^\n");
		}
		//1����5������
		
		int j;
		int sum = 0;
		
		for(j = 1; j<=5; j++) {
			sum = sum +j;
		}			
			System.out.printf("1���� 5�� ���� %d �Դϴ�.\n",sum);
	*/
	/*	
		int hap = 0;
		int i;
			
		for(i = 501; i <= 1000; i = i +2) {
			hap += i;
		}
		
	//	<�ٸ� �����>
	 //    for(i = 500; i <=1000: i++){
	     
		//	 if(i%2==1) {
			//	hap = hap +1
	     //    }
	  
		System.out.printf("500���� 1000������ Ȧ���� ��: %d \n",hap);
	*/
	/*	
		Scanner s = new Scanner(System.in);
			//Scanner - Ŭ���� (API Ŭ����)
			// s - Scanner Ŭ������ object
			// new Scanner(System.in) - ������
		
		int hap = 0;
		int i;
		int num;
		
		System.out.printf("�� �Է� : ");
		num = s.nextInt();
		
		for(i = 1; i <= num; i++) {
			hap = hap + i;
		}
		
		System.out.printf("1���� %d������ �� : %d \n", num, hap);
		System.out.printf("1���� %d������ ��� : %d \n", num, hap/num);
	*/
	/*	
		Scanner s = new Scanner(System.in);
		
		int hap =0;
		int i;
		int num1, num2, num3;
		
		System.out.printf(" ���۰� �Է� : ");
		num1 = s.nextInt();
		System.out.printf(" ���� �Է� : ");
		num2 = s.nextInt();
		System.out.printf(" ������ �Է� : ");
		num3 = s.nextInt();
		
		for(i = num1; i<=num2;i=i+num3) {
			hap = hap +i;
		}
		System.out.printf("%d���� %d���� %d�� ������ ���� ��: %d \n",num1, num2, num3,hap);
		
		
		int j,k;
		
		for(j = 0; j <3; j ++)
		{
			for(k =0; k <2; k++)
			{
				System.out.printf("��ø for ���Դϴ�. ( j�� : %d, k�� : %d)\n", j, k);
			}
		}
	*/	
		int j,h;
		
		for(j = 1; j <= 9; j++) {
			for(h = 2; h <= 9 ; h++) {
				System.out.printf(h+"X"+j+"="+h*j+"\t"); //���η� ������ ������ ��
			}
			System.out.printf("\n");
		}
		
		Scanner s = new Scanner(System.in);
		int a,b;
		char c;
	
		for( ; ;) {
			System.out.print("====�����Դϴ�=== \n");
			System.out.print("����Ͻðڽ��ϱ�?(y/n)");
			
			c = s.next().charAt(0);
			//s.next() ������ �޾Ƽ� �Է����ش�
			//charAt() �Է¹��� ���忡�� ()�ȿ� ���ڷ� ������ ���Ͽ� ���ϴ� �ܾ �˾��ش�
			
			if(c =='y') {
			  System.out.printf("���� ù ���� �� �Է� : ");
			    a = s.nextInt();
			  System.out.printf("���� �� ���� �� �Է� : ");
			    b = s.nextInt();
			
			  System.out.printf("%d + %d = %d \n", a, b, a + b);
			}else
				break;
		}

		
		
		
		
		
		
		
		
		
	
		
		
	}

}
