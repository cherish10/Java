
public class 예외처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int 연봉,인센티브;
		
		연봉 = 50000000;
		인센티브 = (int)(연봉 * 0.2);
		
		try {
			인센티브 = (int)(연봉 * 0.2);
			System.out.printf("연봉 : %d, 인센티브 : %d\n",연봉,인센티브);
		}catch(Exception 오류) {
			오류.printStackTrace();
		}
		
		int[] aa = new int[3];
		try {
			aa[3] = 100;
		}catch (ArrayIndexOutOfBoundsException 오류) {
			System.out.println("배열 첨자가 배열 크기보다 커요~~");
		}
		
		int[]bb = new int[3];
		try {
			bb[2] = 100 / 0;
			bb[3] = 100;
		}catch (ArrayIndexOutOfBoundsException 오류) {
			System.out.println("배열 첨자가 배열 크기보다 커요~~");
		}catch (ArithmeticException 오류) {
			System.out.println("0으로 나누는 등의 오류에요~~");
		}finally {
			System.out.println("이 부분은 무조건 나와요 ~~");
		}
		
		int a = 100,b = 0;
		int result;
		try {
			if(b == 0)
				throw new Exception("0으로 나누려고요? 안됩니다.");
		}catch (Exception 오류) {
			System.out.print("발생 오류 ==>");
			System.out.println(오류.getMessage());
		}
	}

}
