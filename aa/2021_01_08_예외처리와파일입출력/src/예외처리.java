
public class ����ó�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ����,�μ�Ƽ��;
		
		���� = 50000000;
		�μ�Ƽ�� = (int)(���� * 0.2);
		
		try {
			�μ�Ƽ�� = (int)(���� * 0.2);
			System.out.printf("���� : %d, �μ�Ƽ�� : %d\n",����,�μ�Ƽ��);
		}catch(Exception ����) {
			����.printStackTrace();
		}
		
		int[] aa = new int[3];
		try {
			aa[3] = 100;
		}catch (ArrayIndexOutOfBoundsException ����) {
			System.out.println("�迭 ÷�ڰ� �迭 ũ�⺸�� Ŀ��~~");
		}
		
		int[]bb = new int[3];
		try {
			bb[2] = 100 / 0;
			bb[3] = 100;
		}catch (ArrayIndexOutOfBoundsException ����) {
			System.out.println("�迭 ÷�ڰ� �迭 ũ�⺸�� Ŀ��~~");
		}catch (ArithmeticException ����) {
			System.out.println("0���� ������ ���� ��������~~");
		}finally {
			System.out.println("�� �κ��� ������ ���Ϳ� ~~");
		}
		
		int a = 100,b = 0;
		int result;
		try {
			if(b == 0)
				throw new Exception("0���� ���������? �ȵ˴ϴ�.");
		}catch (Exception ����) {
			System.out.print("�߻� ���� ==>");
			System.out.println(����.getMessage());
		}
	}

}
