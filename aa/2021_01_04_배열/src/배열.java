import java.util.Scanner;

public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s;
		
		s= new Scanner(System.in);
/*
		int[] a; //기초변수가 아니라 참조 변수 스택이 아닌 힙에 저장됨
		
		int b =100;
		
		a = new int[100]; //100개의 공간 0부터 시작~n-1 index
		
		a[0] = 100;
		a[72] = 200;
		
		System.out.println(b);
		
		for(int i = 0; 0<a.length; i++) { //a.length 는 a의 길이에 대한 값을 말함 
			System.out.println(a[i]);
		}
	*/
	/*	
		int[ ]aa = new int[4];
		int i, hap = 0;
		
		for(i =0;i<aa.length ;i++){
			System.out.printf("%d 번째 수를 입력하세요 : ",i +1);
			aa[i] = s.nextInt();
			hap = hap +aa[i];
		} 
		System.out.printf("입력한 배열 원소의 총 합은 %d 입니다 \n", hap);
	*/
	/*	
		//밑에있는 것은 배열같이 연속하는 것에게만 사용가능
   		int count = 0;
		int a[] = {2,3,4,5,6,7,8,9,10};
		
		String ss[] = {"배열","힘드네","포기는 없다","배고프다"};
		
		double d[] = {1.0,20.0,3.14,33.22};
		
		char CHAR[] = new char[3];
		
		long LONG[] = new long[100];
		
		Scanner sw[] = new Scanner[100];
		sw[0] = new Scanner(System.in);
		
		for(String xx :ss) {
			System.out.println(xx);
		}
		
		for(int n = 0; n<a.length;n++) { //배열에 접근해서 처리하는 반복
			System.out.println(a[n]);
		}
		for(int x : a) { //배열이 원소를 0부터 끝까지 하나씩 던저주는 반복
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
		
		for (n = 0; n < 100; n++) { //for (int n = 99; n >= 0; n++) 이걸로 해도 된다 하지만 헷갈릴 수 있으니 조심!
			bb[n] = aa[99-n];  
		}
		
		System.out.printf("bb[0]는 %d, bb[99]는 %d 입력됨 \n", bb[0],bb[99]);
		
		int cc[] = {10, 20, 30, 40, 50};
		int count,size;                                                        
																	           
		count = cc.length;
		size = count * Integer.BYTES;
		
		System.out.printf("배열 cc[]의 요소의 개수는 %d 개 입니다. \n", count);
		System.out.printf("배열 cc[]의 요소의 전체 크기는 %d 바이트입니다. \n", size);
	*/	
	
	/*	
		int = Integer; //기초 자료형을 object화 한다.
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
		int x[][] = new int[2][3]; //행은 0~1, 열 0~2 까지
		
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
		System.out.printf("xx[0][0]부터 xx[2][3]까지 출력 \n");
		
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
		
		System.out.print("행 개수를 입력 : ");
		row = s.nextInt();
		System.out.print("열 개수를 입력 : ");
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
 		
		System.out.printf("aa[0][0]부터 aa[%d][%d]까지 출력 \n",row,col);
		
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
		System.out.printf("%C 자동차가 터널에 들어감\n", stack[top]);
		top++;
		
		stack[top] = 'B';
		System.out.printf("%C 자동차가 터널에 들어감\n", stack[top]);
		top++;
		
		stack[top] = 'C';
		System.out.printf("%C 자동차가 터널에 들어감\n", stack[top]);
		top++;
		
		System.out.printf("\n");
		
		top--;
		System.out.printf("%C 자동차가 터널을 빠져나감\n", stack[top]);
		stack[top] = ' ';
		
		top--;
		System.out.printf("%C 자동차가 터널을 빠져나감\n", stack[top]);
		stack[top] = ' ';
		
		top--;
		System.out.printf("%C 자동차가 터널을 빠져나감\n", stack[top]);
	*/	
		char carName = 'A';
		int select = 9;
		
		while (select != 3) {
			System.out.printf("<1> 자동차 넣기 <2> 자동차 빼기 <3> 끝 : ");
			select = s.nextInt();
			
			switch(select) {
			case 1:
				if(top>=5) {
					System.out.printf("터널이 꽉 차서 차가 못 들어감\n");
				}else {
					stack[top] = carName++;
					System.out.printf("%c 자동차가 터널에 들어감\n",stack[top]);
					top++;
				}
				break;
		
			case 2:
				if(top<=0) {
					System.out.printf("빠져나갈 자동차가 없음\n");
				}else {
					top--;	
					System.out.printf("%c 자동차가 터널에 빠짐\n",stack[top]);
					stack[top]=' ';
				}
				break;
				
			case 3:
				System.out.printf("현재 터널에 %d대가 있음\n", top);
				System.out.printf("프로그램을 종료합니다\n");
				break;
			
		default:
			System.out.printf("잘못 입력했습니다. 다시 입력하세요. \n");
		 }
	   }	
		
		
	}
}
