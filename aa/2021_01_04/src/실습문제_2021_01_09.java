import java.util.Scanner;

public class �ǽ�����_2021_01_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner s = new Scanner(System.in);
	
	/*	
		System.out.printf("�Ǻ���ġ������ 10��° ���� ������ \n");  
		
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; //����° ��
		int temp = 0;
		
		System.out.print(num1 + ","+num2);
		
		for(int i = 0; i<10; i++) {
			num3 = num1 + num2; // ������ ���� ù��°�� �ι�° ���� ���ؼ�
			temp = num1;
			System.out.print(","+num3); //����° ���� ���
			num1 = num2; // �� ��° ������ ù ��° ������ �Ѵ�
			num2 =num3; // �� ��° ������ �� ��° ������ �Ѵ�
			
		}
		System.out.println();
		System.out.println("10��° ����" + (temp) + "�Դϴ�");
	*/	
	
		
	/*	
		System.out.printf("���ڿ��� ���ڰ� �ִ��� �Ǵ� ���α׷��� \n");	
		
		String a;
		boolean b = false;
		
		System.out.print("���ڿ��� �Է��ϼ��� :  ");
		a = s.nextLine();
		
		for(int i =0; i< a.length(); i++) {
			if(a.charAt(i)>'0' && a.charAt(i)<='9') {
				System.out.printf("%d�ڸ� ���ڴ� ������.\n",(i+1));
				b = true;
			}
		}
		
		if (b == false) {
			System.out.println("�Է��� ���ڿ�" + a + "�� ���ڰ� �����ϴ�");
		}else {
			System.out.println("�Է��� ���ڿ�" + a + "�� ���ڰ� �ֽ��ϴ�");
		}
	*/
		
	/*	
		System.out.printf("�迭�� ��� ��� ���� �� \n");
		
		int[ ]arr = {3,6,9};
		int hap = 0;
		
		for(int i =0;i<arr.length ;i++){
			hap = hap +arr[i];
		} 
		
		System.out.println(hap);
	*/	
	/*
		System.out.printf("�迭�� ��� ��� ���� ���ϰ� ����� ���ϴ� ���α׷��� \n");
		
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
		
		System.out.println("arr�迭�� ��� ���� ���� "+hap+"�Դϴ�.");
		System.out.println("arr�迭�� ����� "+(hap/(row*colum))+"�Դϴ�.");
	*/	
	/*	
		System.out.printf("�� ������ ������ŭ *�� �� �׷����� �׸��� ���α׷��� \n");
		
		int answer[];
		
		int �迭ũ��;
		
		System.out.print("������ ���� �迭�� ũ�⸦ �Է��ϼ��� : ");
		
		�迭ũ�� = s.nextInt();
		
		answer = new int[�迭ũ��];
		
		System.out.println("��"+answer.length+"ũ���� �迭�� ��������ϴ�");
		
		for(int i = 0; i < answer.length; i++) {
			System.out.print("�迭 ["+i+"]�� ���� �Է��ϼ��� : ");
			answer[i] =s.nextInt();
		}
		
		System.out.println("�Է��� �迭 ���� ���� ����ؼ� �׷����� �׸��ô�");
		for(int i =0; i<answer.length; i++) {
			if(i<10){
				System.out.print("�迭 ["+i+"] ���� : ");
			}else {
				System.out.print("�迭 ["+i+"] ���� : ");
			}
			for(int j =0; j<answer.length; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	*/	
	/*	
		System.out.printf("���ڿ��� �������� �ٲ� ��ȣȭ���� \n");
	//String => ���ڿ� => ���� �迭 => char[]
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
			//������ char[] �迭�� �ɰ��ش�.
			
			//question[0] ='h'
			//question[1] ='e'
			//question[2] ='l'
			//question[3] ='l'
			//question[4] ='o'
			
			for(int j=0;j<question.length;j++) { //j<5
				int idx = (int)(Math.random() * question.length);
				//0.4545454(�������� 0~1������ �ƹ�����)*5=2.2727...(������ �ٲ�⿡)=> 2 => idx = 2
				char tmp = question[i];
				//tmp = 'h'
				question[i] = question[idx];
				//question[0] ='l' (���� idx�� 2�̱⋚����)
				question[idx] = tmp;
				//question[2] ='h' (tmp�� ���� h�̱⋚����)
			}
		
			System.out.print("������ ���� ���ڴ� �����ϱ��? ");
			
			for(int k=0; k<question.length; k++) {
				System.out.print(question[k]);
			}
			
			System.out.print(" => ");
			
			while(true) {
				ss = s.nextLine();
				if(Q[i].equals(ss)) {
					System.out.print("�¾ҽ��ϴ�.");
					break;
				}else {
					System.out.print("Ʋ�Ƚ��ϴ�. �ٽ� �Է��ϼ��� => ");
				}
			}
			System.out.println();
		}
		
		System.out.println("��� ������ Ǯ�����ϴ�");
	
	*/	
		int x,y,x1,y1;
		double d;
		Scanner s = new Scanner(System.in);
		System.out.println("�� �������� �Ÿ��� ���ϴ� ���α׷��Դϴ�");
		System.out.print("ù ���� ���� ��ǥ�� �Է��ϼ��� : ");
		x = Integer.parseInt(s.next()); // ���� ���� �и� �Է�
		y = Integer.parseInt(s.next());
		
		System.out.print("�� ��° ���� ��ǥ�� �Է��ϼ��� : ");
		x1 = Integer.parseInt(s.next());
		y1 = Integer.parseInt(s.next());
		
		d = getDistance(x,y,x1,y1);
		
		
		
	} //public static void main(String[] args)

	
	
	static double getDistance(int x2, int y2, int x1, int y1) {
		
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		//Math.sqrt(�Ǽ�) ������ ��� ����� return
		
	} //static double getDistance(int x2, int y2, int x1, int y1)
	
	
	
	
	static int max(int arr[]) {
		int max = 0;
		
		return max;
	} //static int max(int arr[])
	
	
	
	
	
	
	
	

	
}
