import java.util.Scanner;

public class �迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s;
		
		s= new Scanner(System.in);
/*
		int[] a; //���ʺ����� �ƴ϶� ���� ���� ������ �ƴ� ���� �����
		
		int b =100;
		
		a = new int[100]; //100���� ���� 0���� ����~n-1 index
		
		a[0] = 100;
		a[72] = 200;
		
		System.out.println(b);
		
		for(int i = 0; 0<a.length; i++) { //a.length �� a�� ���̿� ���� ���� ���� 
			System.out.println(a[i]);
		}
	*/
	/*	
		int[ ]aa = new int[4];
		int i, hap = 0;
		
		for(i =0;i<aa.length ;i++){
			System.out.printf("%d ��° ���� �Է��ϼ��� : ",i +1);
			aa[i] = s.nextInt();
			hap = hap +aa[i];
		} 
		System.out.printf("�Է��� �迭 ������ �� ���� %d �Դϴ� \n", hap);
	*/
	/*	
		//�ؿ��ִ� ���� �迭���� �����ϴ� �Ϳ��Ը� ��밡��
   		int count = 0;
		int a[] = {2,3,4,5,6,7,8,9,10};
		
		String ss[] = {"�迭","�����","����� ����","�������"};
		
		double d[] = {1.0,20.0,3.14,33.22};
		
		char CHAR[] = new char[3];
		
		long LONG[] = new long[100];
		
		Scanner sw[] = new Scanner[100];
		sw[0] = new Scanner(System.in);
		
		for(String xx :ss) {
			System.out.println(xx);
		}
		
		for(int n = 0; n<a.length;n++) { //�迭�� �����ؼ� ó���ϴ� �ݺ�
			System.out.println(a[n]);
		}
		for(int x : a) { //�迭�� ���Ҹ� 0���� ������ �ϳ��� �����ִ� �ݺ�
			System.out.println(x);
		}
	*/	
	/*	
		int a[] = { 100, 200, 300, 400};
		int b[] = new int [] {100, 200, 300};
		
		int c[];
		c = new int[] {100,200};
		int[] d = new int[1];
		d[0] = 100;
		int i;
		
		for(i = 0; i < 4; i++)
		System.out.printf("a[%d]==>%d\t",i,a[i]);
		System.out.printf("\n");
		
		for(i = 0; i <3; i++)
		System.out.printf("b[%d]==>%d\t",i,b[i]);
		System.out.printf("\n");
		
		for(i=0; i<2;i++)
		System.out.printf("c[%d]==>%d\t",i,c[i]);
		System.out.printf("\n");
		
		for(i = 0; i< 1; i++)
		System.out.printf("d[%d]==>%d\t",i,d[i]);
		System.out.printf("\n");
			
		int aa[] = new int[100];
		int bb[] = new int[100];
		int n;
		
		for (n = 0; n < 100; n++) {
			aa[n] = n *2;
		}
		
		for (n = 0; n < 100; n++) { //for (int n = 99; n >= 0; n++) �̰ɷ� �ص� �ȴ� ������ �򰥸� �� ������ ����!
			bb[n] = aa[99-n];  
		}
		
		System.out.printf("bb[0]�� %d, bb[99]�� %d �Էµ� \n", bb[0],bb[99]);
		
		int cc[] = {10, 20, 30, 40, 50};
		int count,size;                                                        
																	           
		count = cc.length;
		size = count * Integer.BYTES;
		
		System.out.printf("�迭 cc[]�� ����� ������ %d �� �Դϴ�. \n", count);
		System.out.printf("�迭 cc[]�� ����� ��ü ũ��� %d ����Ʈ�Դϴ�. \n", size);
	*/	
	
	/*	
		int = Integer; //���� �ڷ����� objectȭ �Ѵ�.
		char = Character;
		==========
		double = Double;
		float = Float;
		byte = Byte; 
		boolean = Boolean;
		short = Short;
		long =Long;
	*/	
	/*	
		int x[][] = new int[2][3]; //���� 0~1, �� 0~2 ����
		
		x[0][0] = 100;
		x[0][1] = 100;
		x[0][2] = 200;
		x[1][0] = 300;
		x[1][1] = 400;
		x[1][2] = 500;
		System.out.println(x.length* Integer.BYTES);
	*/
	/*	
		int xx[][] = new int[3][4];
		
		
		xx[0][0] = 1; xx[0][1] = 2; xx[0][2] = 3; xx[0][3] = 4;
		xx[1][0] = 5; xx[1][1] = 6; xx[1][2] = 7; xx[1][3] = 8;
		xx[2][0] = 9; xx[2][1] = 10; xx[2][2] = 11; xx[2][3] = 12;
	*/	
	/*	
		System.out.printf("xx[0][0]���� xx[2][3]���� ��� \n");
		
		System.out.printf("%3d %3d %3d %3d\n",xx[0][0],xx[0][1],xx[0][2],xx[0][3]);
		System.out.printf("%3d %3d %3d %3d\n",xx[1][0],xx[1][1],xx[1][2],xx[1][3]);
		System.out.printf("%3d %3d %3d %3d\n",xx[2][0],xx[2][1],xx[2][2],xx[2][3]);
	*/
	/*
		for(int i = 0; i<3; i++);{
			for(int j = 0; j < 4; j++) {
				System.out.printf("a[%d][%d] : %d\t", i,j,xx[i][j]);
			}
			System.out.println();
		}
	*/
	/*	
		b[0] = 10;b[1] = 20; b[2] = 30;
		
		int cc[][] = {{10,20,30},{40,50,60},{70,80,90}};
		
		for(int xx[] : cc) {
			System.out.println(xx);
		}
	*/	
		
		int x[][] = {
				{1,2,3,4,},
				{5,6,7,8},
				{9,10,11,12}
		}; //x[3][4] = error
		
		int row,col;
		
		System.out.print("�� ������ �Է� : ");
		row = s.nextInt();
		System.out.print("�� ������ �Է� : ");
		col = s.nextInt();
		
		int[][] aa = new int[row][col];
		int i,k;
		int val =1;
		
		for(i = 0; i<row; i++) {
			for(k = 0; k<col; k++) {
				aa[i][k] = val;
				val++;
			}
		}
 		
		System.out.printf("aa[0][0]���� aa[%d][%d]���� ��� \n",row,col);
		
		for(i = 0; i<row; i++) {
			for(k = 0; k<col; k++) {
				System.out.printf("%3d",aa[i][k]);
			}
			System.out.printf("\n");
		}
	
		
		char stack[] = new char[5];
		int top =0;
	/*	
		stack[top] = 'A';
		System.out.printf("%C �ڵ����� �ͳο� ��\n", stack[top]);
		top++;
		
		stack[top] = 'B';
		System.out.printf("%C �ڵ����� �ͳο� ��\n", stack[top]);
		top++;
		
		stack[top] = 'C';
		System.out.printf("%C �ڵ����� �ͳο� ��\n", stack[top]);
		top++;
		
		System.out.printf("\n");
		
		top--;
		System.out.printf("%C �ڵ����� �ͳ��� ��������\n", stack[top]);
		stack[top] = ' ';
		
		top--;
		System.out.printf("%C �ڵ����� �ͳ��� ��������\n", stack[top]);
		stack[top] = ' ';
		
		top--;
		System.out.printf("%C �ڵ����� �ͳ��� ��������\n", stack[top]);
	*/	
		char carName = 'A';
		int select = 9;
		
		while (select != 3) {
			System.out.printf("<1> �ڵ��� �ֱ� <2> �ڵ��� ���� <3> �� : ");
			select = s.nextInt();
			
			switch(select) {
			case 1:
				if(top>=5) {
					System.out.printf("�ͳ��� �� ���� ���� �� ��\n");
				}else {
					stack[top] = carName++;
					System.out.printf("%c �ڵ����� �ͳο� ��\n",stack[top]);
					top++;
				}
				break;
		
			case 2:
				if(top<=0) {
					System.out.printf("�������� �ڵ����� ����\n");
				}else {
					top--;	
					System.out.printf("%c �ڵ����� �ͳο� ����\n",stack[top]);
					stack[top]=' ';
				}
				break;
				
			case 3:
				System.out.printf("���� �ͳο� %d�밡 ����\n", top);
				System.out.printf("���α׷��� �����մϴ�\n");
				break;
			
		default:
			System.out.printf("�߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���. \n");
		 }
	   }	
		
		
	}
}
