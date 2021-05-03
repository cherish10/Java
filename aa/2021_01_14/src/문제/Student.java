package ¹®Á¦;

public class Student {

	String name;
	int ban;
	int no;
	int kor; //95
	int eng; //60
	int math; //72
	int Total;
	int Average;
	
	int getTotal(){
		return kor + eng + math;
	}
	
	float getAverage() {
		return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
	}
	
	
	/*void getAverage() {
		System.out.printf("%.1f\n",getTotal() / 3f);
	}*/
	
	/*float getAverage() {
		return Math.round(((getTotal() / 3f)*10.0))/10.0f;
	}*/

}