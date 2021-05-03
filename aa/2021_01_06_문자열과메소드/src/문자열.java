import java.util.Scanner;

public class 문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		String str ="IT CookBook. Java";
		int len;
		
		len = str.length();
		
		System.out.printf("문자열 : %s \n", str);
		System.out.printf("문자열 길이 : %d", len);
	*/	
	/*	
		Scanner s = new Scanner(System.in);             
		String str;                                    
		                                                
		System.out.print("문자열 입력 ==>");
		str = s.nextLine();
		
		System.out.print("출력 문자열 ==>");
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'o')                             //*메소드는 기능을 수행한다.
				System.out.printf("%c", '$');                    //*메소드는 입력이 있을 수 있다.
			else                                                 //*메소드는 기능 수행 후 종료되거나,반환 값을 내어준다
				System.out.printf("%c", str.charAt(i));
		}
	*/
	/*	
		Scanner s = new Scanner(System.in);             
		String str;
		
		System.out.print("문자열 입력 ==>");
		str = s.nextLine();
		
		System.out.print("출력 문자열 ==>");
		
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
		
		System.out.print("문자열을 입력하세요 : ");
		str = s.nextLine();
		
		strRep =str.replace(" ", "$");
		strSub =str.substring(3,8);
		strAry =str.split(" ");
		
		System.out.println("입력 문자열 ==>" + str);
		System.out.println("바꾼 문자열 ==>" + strRep);
		System.out.println("일부 문자열 ==>" + strSub);
		for(int i = 0; i< strAry.length; i++)
			System.out.println("분리한 문자열" + i + "==>" + strAry[i]);
	*/
		
		String str =" a b c d e ";
		
		System.out.println(str.toUpperCase());   //대문자로 변경
		
		System.out.println(str.toLowerCase());   //소문자로 변경
		
		System.out.println(str.trim());          //앞,뒤 공백제거
		
		System.out.println(str.replace(" ", ""));//공백있는 것들 다 제거
		
		
		String s ="a";
		String ss ="ac";
		
		System.out.println(str.compareTo(s)); // 문자열의 유니코드를 비교
		System.out.println(str.contains(s)); // s에 있는 d가 ss에 포함을 하면 true
		
		
	}
   
	
	}
	
	
	

