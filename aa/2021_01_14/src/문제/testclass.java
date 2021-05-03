package ¹®Á¦;

public class testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SutdaCard card1 = new SutdaCard(3,false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
		
		
		
		Student s1 = new Student();
		
		s1.kor = 95;
		s1.eng = 60;
		s1.math = 72;
		
		System.out.println(s1.getTotal());
		System.out.println(s1.getAverage());
		
		
		
		
	}

}
