import java.util.Scanner;

public class �ǽ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1"+"2"); //���� ��� 12
		System.out.println(true + ""); //���� ��� true
		System.out.println('A'+'B'); //���� ��� (���������� ���� ���)A=65 B=66 131
		System.out.println('1'+2); //���� ��� 1 = 49 +2 51
		System.out.println('1'+'2'); //���� ��� 1=49 2=50 99
		System.out.println('J'+"ava");//���� ���
		/*System.out.println(true + null);*/ //���� �߻�
		
		Scanner s = new Scanner(System.in);
	/*	
		int max ;
		int �����;
		
		System.out.println("����� �ٱ��Ͽ� ��� ���ô�");
		
		System.out.print("�� �ٱ��Ͽ� ���� �� �ִ� �ִ� ��� ������ �Է��ϼ��� : ");
		max = s.nextInt();
		System.out.print("���� ��� ������ �Է��ϼ��� : ");
		����� = s.nextInt();
		
		if((����� % max) >0){
			System.out.println((�����/max)+1 + " ���� �ٱ��ϰ� �ʿ��մϴ�");
		}else {
			System.out.println((�����/max) + " ���� �ٱ��ϰ� �ʿ��մϴ�");
		}
	*/
	/*	
		int a;
		
		System.out.println("�Է� ������ ���� �Ǵ� ���α׷��Դϴ�");
		
		System.out.print("������ �Է��ϼ��� : ");
		
		try {
			a = s.nextInt();
		
			if(a>=0) {
				if(a > 0) {
					System.out.printf("�Է��Ͻ� ������ %d�� ����Դϴ�. \n",a);
				}else {
					System.out.printf("�Է��Ͻ� ������ %d�� 0 �Դϴ� \n",a);
				}	
		
			}else{
				System.out.printf("�Է��Ͻ� ������ %d�� ���� �Դϴ� \n",a);
			}
		
		}catch (Exception e) {
			System.out.println("�Է� ���� �߸��Ǿ����ϴ�");
			} //s.next()-���� ���ѷ����� �ɸ��� s.next��  �ؿ� �Է��Ͽ� ���߰� �Ѵ�

			//s.next();
	*/
	/*	
		System.out.println("2x + 4y = 10 ���� �ظ� ���մϴ�");
		int x,y;
		
		for(x =0; x <=5; x++) {
			for(y =0; y <=2; y++) {
				if((2*x)+(4*y)==10) {
					System.out.printf("x = %d, y = %d \n",x,y);
				}
			}
		}
	*/
		
		
		int i;
		
		int n = 0;
		int count = 0;
		
		n = (int)(Math.random()*100);
		
		System.out.println("0~100 ������ ���� ���ĺ�����~");
		for(;;) {
	
		System.out.print("������ �Է��ϼ��� : ");
		
		i = s.nextInt();
		count++; 
		
			if(n>i) {
				System.out.println("�Է��Ͻ� ���� �۽��ϴ�.");
			}else if(n<i) {
				System.out.println("�Է��Ͻ� ���� Ů�ϴ�.");
			}else {
				System.out.println("������~");
				System.out.printf("�� %dȸ ���� ������ ���߾����ϴ�",count);
				break;
			}
		}
		
	}
}
