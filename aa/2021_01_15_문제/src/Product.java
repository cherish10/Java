
public class Product{
	int price; //��ǰ�� ����
	
	Product(int price){ //������
		 this.price = price;
	}
	
	//����Ʈ ������ ����
	//EX)Product ���� = new Product(600); �����ڸ� ���ؼ�
	//   ����.price => 600
}	
class ���� extends Product{ //����.��Ĩ = new ����();
	
	����(){ // �������̸� ������ ����Ʈ ������ Ÿ��
		super(100); //price100
	}
	
	@Override //�θ𲨸� ������ ������ �ٲܼ��ְ� �ϴ� ��
	public String toString() { //���̹��� ������Ʈ�� ������� �� �� �ִ�.��,������Ʈ���� ��ӹ��� �Ŵϱ� ����� �����ϴ�.
		return"����";
	}
	
}
	
class ��� extends Product{
	���(){
		super(150);
	}
	@Override
	public String toString() {
		return"���";
	}
}

class ���� extends Product{
	����(){
		super(50);
	}
	@Override
	public String toString() {
		return"����";
	}
}
	