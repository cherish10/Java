
public class Math�𷡽� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer s[] = {9, 3, 7, 2, 5 };
		Integer maxVal, minVal;
		int i,k;
		
		System.out.print("���� �� ==> ");
		for (i = 0; i < 5; i++)
			System.out.print(s[i] + " ");
		
		for(i = 0; i < 4; i++)
			for(k = i;k < 5; k++) {
				maxVal = Math.max(s[i],s[k]);
				minVal = Math.min(s[i], s[k]);
				s[i] = minVal;
				s[k] = maxVal;
			}
		System.out.print("\n���� �� ==> ");
		for(i = 0; i < 5; i++)
			System.out.print(s[i] + " ");
	}

}
