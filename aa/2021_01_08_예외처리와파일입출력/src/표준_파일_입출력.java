import java.io.IOException;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class ǥ��_����_����� {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	/*	
		//���̵� �Է�
		String userName = "hanbit";
		String input = "";
		int key;
		
		try {
			System.out.print("Id : ");
			while ((key = System.in.read()) !=13) { //���迬���ڰ� ������ ������ T/F
				input += Character.toString((char)key);	
			}
			if(userName.equals(input))
				System.out.println(input + "�� �������~");
			else
				System.out.println(input + "�� ����� �ȵǾ����ϴ�~");
		}catch (IOException e) {
			e.printStackTrace();
		}
	*/	
	/*	
		FileInputStream fis = new FileInputStream("C:\\Temp\\data1.txt"); //fis = �ڿ� ������ ��� ���� ���� ������ ��� ����
		
		int ch;
		byte[] bt = new byte[1024];
		
		int i = 0;
		while ((ch = fis.read()) != -1) { //EOF ������ ���� �ǹ�(End Of File) �ѱ� 2����Ʈ
			bt[i] = (byte) ch;
		i++;
		}
		
		System.out.print(new String(bt));
		fis.close(); //������ close�ؾߵ�
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
		
		System.out.println("�հ� : " +hap);
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
//		//���� �ϴ¹�
//		FileInputStream fis = new FileInputStream("C:\\Temp\\data4.txt");
//		FileOutputStream fos = new FileOutputStream("C:\\Temp\\data6.txt");
//		int ch;
//		
//		while((ch = fis.read()) !=-1)
//			fos.write((byte) ch);
//		
//		System.out.println("���� �Ϸ�");
//		fis.close();
//		fos.close();
	}

}
