import java.util.Scanner;

public class ���ڿ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		String str ="IT CookBook. Java";
		int len;
		
		len = str.length();
		
		System.out.printf("���ڿ� : %s \n", str);
		System.out.printf("���ڿ� ���� : %d", len);
	*/	
	/*	
		Scanner s = new Scanner(System.in);             
		String str;                                    
		                                                
		System.out.print("���ڿ� �Է� ==>");
		str = s.nextLine();
		
		System.out.print("��� ���ڿ� ==>");
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'o')                             //*�޼ҵ�� ����� �����Ѵ�.
				System.out.printf("%c", '$');                    //*�޼ҵ�� �Է��� ���� �� �ִ�.
			else                                                 //*�޼ҵ�� ��� ���� �� ����ǰų�,��ȯ ���� �����ش�
				System.out.printf("%c", str.charAt(i));
		}
	*/
	/*	
		Scanner s = new Scanner(System.in);             
		String str;
		
		System.out.print("���ڿ� �Է� ==>");
		str = s.nextLine();
		
		System.out.print("��� ���ڿ� ==>");
		
		if(!str.startsWith("("))
			System.out.printf("(");
		
		for(int i = 0; i < str.length(); i++)
			System.out.printf("%c",str.charAt(i));
		
		if(!str.endsWith(")"))
			System.out.printf(")");
	*/	
	/*	
		Scanner s = new Scanner(System.in);
				String str,strRep,strSub,strAry[];
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		str = s.nextLine();
		
		strRep =str.replace(" ", "$");
		strSub =str.substring(3,8);
		strAry =str.split(" ");
		
		System.out.println("�Է� ���ڿ� ==>" + str);
		System.out.println("�ٲ� ���ڿ� ==>" + strRep);
		System.out.println("�Ϻ� ���ڿ� ==>" + strSub);
		for(int i = 0; i< strAry.length; i++)
			System.out.println("�и��� ���ڿ�" + i + "==>" + strAry[i]);
	*/
		
		String str =" a b c d e ";
		
		System.out.println(str.toUpperCase());   //�빮�ڷ� ����
		
		System.out.println(str.toLowerCase());   //�ҹ��ڷ� ����
		
		System.out.println(str.trim());          //��,�� ��������
		
		System.out.println(str.replace(" ", ""));//�����ִ� �͵� �� ����
		
		
		String s ="a";
		String ss ="ac";
		
		System.out.println(str.compareTo(s)); // ���ڿ��� �����ڵ带 ��
		System.out.println(str.contains(s)); // s�� �ִ� d�� ss�� ������ �ϸ� true
		
		
	}
   
	
	}
	
	
	

