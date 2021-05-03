package ¹®Á¦;

public class SutdaCard {

	int num;
	boolean isKwang;
	SutdaCard(){
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		String s;
		if(isKwang) {
			s="k";
		}else {
			s="";
		}
		return num +(s);
	}
}
