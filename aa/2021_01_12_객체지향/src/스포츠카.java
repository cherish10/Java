
public class 스포츠카 extends 자동차{
		
	public 스포츠카(){
			
	}
		
	public 스포츠카(String color) {
		색상 = color;
	}
		
		
	@Override
	public void 가속() {
		속도 = 속도 + 50;
	}
		
}
