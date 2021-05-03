import java.io.IOException;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class 표준_파일_입출력 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	/*	
		//아이디 입력
		String userName = "hanbit";
		String input = "";
		int key;
		
		try {
			System.out.print("Id : ");
			while ((key = System.in.read()) !=13) { //관계연산자가 있으면 무조건 T/F
				input += Character.toString((char)key);	
			}
			if(userName.equals(input))
				System.out.println(input + "님 어서오세요~");
			else
				System.out.println(input + "님 등록이 안되었습니다~");
		}catch (IOException e) {
			e.printStackTrace();
		}
	*/	
	/*	
		FileInputStream fis = new FileInputStream("C:\\Temp\\data1.txt"); //fis = 뒤에 선언한 경로 안의 파일 정보가 들어 있음
		
		int ch;
		byte[] bt = new byte[1024];
		
		int i = 0;
		while ((ch = fis.read()) != -1) { //EOF 파일의 끝을 의미(End Of File) 한글 2바이트
			bt[i] = (byte) ch;
		i++;
		}
		
		System.out.print(new String(bt));
		fis.close(); //무조건 close해야됨
	*/	
	/*
		FileReader fReader = new FileReader("C:\\Temp\\data1.txt");
		BufferedReader bReader =new BufferedReader(fReader);
		
		String str = null;
		
		while((str = bReader.readLine())!=null) {
			System.out.println((str));
		}
		
		bReader.close();
		fReader.close();
	*/
	/*	
		Scanner sc = new Scanner(new File("C:\\Temp\\data3.txt"));
		
		int hap = 0;
		
		while(sc.hasNextLine())
			hap += sc.nextInt();
		
		System.out.println("합계 : " +hap);
		sc.close();
	*/
		
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\data4.txt");
		
		int ch;
		
		while ((ch = System.in.read()) !=13)
			fos.write((byte) ch);
		
		fos.close();
	
	/*	
		Scanner sc = new Scanner(System.in);
		FileWriter fw = new FileWriter("C:\\Temp\\data5.txt");
		String str;
		
		while(!(str =sc.nextLine()).equals(""))
			fw.write(str +"\r\n");
		
		
		fw.close();
	*/
//		
//		//복사 하는법
//		FileInputStream fis = new FileInputStream("C:\\Temp\\data4.txt");
//		FileOutputStream fos = new FileOutputStream("C:\\Temp\\data6.txt");
//		int ch;
//		
//		while((ch = fis.read()) !=-1)
//			fos.write((byte) ch);
//		
//		System.out.println("복사 완료");
//		fis.close();
//		fos.close();
	}

}
