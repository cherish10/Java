import java.util.Scanner;

public class 실습문제_2021_01_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner s = new Scanner(System.in);
	
	/*	
		System.out.printf("피보나치수열의 10번째 수를 구하자 \n");  
		
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; //세번째 값
		int temp = 0;
		
		System.out.print(num1 + ","+num2);
		
		for(int i = 0; i<10; i++) {
			num3 = num1 + num2; // 세번쨰 값은 첫번째와 두번째 값을 더해서
			temp = num1;
			System.out.print(","+num3); //세번째 수열 출력
			num1 = num2; // 두 번째 수열을 첫 번째 값으로 한다
			num2 =num3; // 세 번째 수열을 두 번째 값으로 한다
			
		}
		System.out.println();
		System.out.println("10번째 값은" + (temp) + "입니다");
	*/	
	
		
	/*	
		System.out.printf("문자열에 숫자가 있는지 판단 프로그래밍 \n");	
		
		String a;
		boolean b = false;
		
		System.out.print("문자열을 입력하세요 :  ");
		a = s.nextLine();
		
		for(int i =0; i< a.length(); i++) {
			if(a.charAt(i)>'0' && a.charAt(i)<='9') {
				System.out.printf("%d자리 글자는 숫자임.\n",(i+1));
				b = true;
			}
		}
		
		if (b == false) {
			System.out.println("입력한 문자열" + a + "는 숫자가 없습니다");
		}else {
			System.out.println("입력한 문자열" + a + "는 숫자가 있습니다");
		}
	*/
		
	/*	
		System.out.printf("배열에 담긴 모든 값을 합 \n");
		
		int[ ]arr = {3,6,9};
		int hap = 0;
		
		for(int i =0;i<arr.length ;i++){
			hap = hap +arr[i];
		} 
		
		System.out.println(hap);
	*/	
	/*
		System.out.printf("배열에 담긴 모든 값을 더하고 평균을 구하는 프로그래밍 \n");
		
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int row;
		int colum;
		int hap = 0;

		row = arr.length;
		colum =arr[0].length;
		
		for(int i = 0; i<row;i++) {	
			for(int j = 0; j<colum;j++) {	
				hap = hap + arr[i][j];
				//arr[0][0] + arr[0][1] +arr[0][2]
				//arr[1][0] + arr[1][1] +arr[1][2]
				//arr[2][0] + arr[2][1] +arr[2][2]
			}
		}
		
		System.out.println("arr배열의 모든 원소 합은 "+hap+"입니다.");
		System.out.println("arr배열의 평균은 "+(hap/(row*colum))+"입니다.");
	*/	
	/*	
		System.out.printf("각 숫자의 개수만큼 *을 찍어서 그래프를 그리는 프로그래밍 \n");
		
		int answer[];
		
		int 배열크기;
		
		System.out.print("생성할 정수 배열의 크기를 입력하세여 : ");
		
		배열크기 = s.nextInt();
		
		answer = new int[배열크기];
		
		System.out.println("총"+answer.length+"크기의 배열을 만들었습니다");
		
		for(int i = 0; i < answer.length; i++) {
			System.out.print("배열 ["+i+"]에 갑을 입력하세요 : ");
			answer[i] =s.nextInt();
		}
		
		System.out.println("입력한 배열 원소 값을 기반해서 그래프를 그립시다");
		for(int i =0; i<answer.length; i++) {
			if(i<10){
				System.out.print("배열 ["+i+"] 번지 : ");
			}else {
				System.out.print("배열 ["+i+"] 번지 : ");
			}
			for(int j =0; j<answer.length; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	*/	
	/*	
		System.out.printf("문자열을 랜덤으로 바꿔 암호화같이 \n");
	//String => 문자열 => 문자 배열 => char[]
		//String s = "hello"
		//char[] c = {'h','e','l','l','o'}
		String ss;
		String Q[] = {"hello","i love you","method","object"};
		//Q[0] ='hello'
		//Q[1] ='i love you'
		//Q[2] ='method'
		//Q[3] ='object'
		
		for(int i=0;i<Q.length;i++) {
			
			char[] question = Q[i].toCharArray();
			//문장을 char[] 배열로 쪼개준다.
			
			//question[0] ='h'
			//question[1] ='e'
			//question[2] ='l'
			//question[3] ='l'
			//question[4] ='o'
			
			for(int j=0;j<question.length;j++) { //j<5
				int idx = (int)(Math.random() * question.length);
				//0.4545454(랜덤으로 0~1사이의 아무숫자)*5=2.2727...(정수로 바뀌기에)=> 2 => idx = 2
				char tmp = question[i];
				//tmp = 'h'
				question[i] = question[idx];
				//question[0] ='l' (지금 idx는 2이기떄문에)
				question[idx] = tmp;
				//question[2] ='h' (tmp는 지금 h이기떄문에)
			}
		
			System.out.print("다음의 원래 글자는 무엇일까요? ");
			
			for(int k=0; k<question.length; k++) {
				System.out.print(question[k]);
			}
			
			System.out.print(" => ");
			
			while(true) {
				ss = s.nextLine();
				if(Q[i].equals(ss)) {
					System.out.print("맞았습니다.");
					break;
				}else {
					System.out.print("틀렸습니다. 다시 입력하세요 => ");
				}
			}
			System.out.println();
		}
		
		System.out.println("모든 문제를 풀었습니다");
	
	*/	
		int x,y,x1,y1;
		double d;
		Scanner s = new Scanner(System.in);
		System.out.println("두 점사이의 거리를 구하느 츠로그램입니다");
		System.out.print("첫 번재 점의 좌표를 입력하세요 : ");
		x = Integer.parseInt(s.next()); // 공백 기준 분리 입력
		y = Integer.parseInt(s.next());
		
		System.out.print("두 번째 점의 좌표를 입력하세요 : ");
		x1 = Integer.parseInt(s.next());
		y1 = Integer.parseInt(s.next());
		
		d = getDistance(x,y,x1,y1);
		
		
		
	} //public static void main(String[] args)

	
	
	static double getDistance(int x2, int y2, int x1, int y1) {
		
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		//Math.sqrt(실수) 제곱근 계산 결과물 return
		
	} //static double getDistance(int x2, int y2, int x1, int y1)
	
	
	
	
	static int max(int arr[]) {
		int max = 0;
		
		return max;
	} //static int max(int arr[])
	
	
	
	
	
	
	
	

	
}
