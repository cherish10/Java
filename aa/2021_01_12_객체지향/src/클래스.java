
import java.util.Scanner;
public class Ŭ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		�ڵ��� ī�Ϲ� = new �ڵ���();
		// new Ŭ������() => ������
		�ڵ��� IG = new �ڵ���();
		�ڵ��� �ƺ�Ÿ���� = new �ڵ���();
		�ڵ��� �ƹݶ� = new �ڵ���();
		�ڵ��� G80 = new �ڵ���();
		�ڵ��� ��� = new �ڵ���();
		�ڵ��� level3 = new �ڵ���();
		
		�ڵ��� ����[] = new �ڵ���[100];
		
		�ڵ��� ��Ÿ����[] = {new �ڵ���(), new �ڵ���()
				,new �ڵ���(), new �ڵ���()};
	
		��Ÿ����[0].���� = "����";
		
		���.���� = "����";
		
		for(int i = 0;i<����.length;i++) {
			����[i] = new �ڵ���();
		}
		
		����[0].���� = "�Ķ�";
		
		
		
		������ǰ LEDTV = new ������ǰ();
		������ǰ �Ƿ������� = new ������ǰ();
		
		LEDTV.����=1000000;
		LEDTV.��������� = 1;
		
		Scanner s = new Scanner(System.in);
		
		
		
		System.out.println(LEDTV.����);
		System.out.println(���.����);
		System.out.println(���.����);
		
		
		����[0].���� = "�������";
		
		System.out.println(����[0].get����());
		
		����[0].set������("����");
		
		System.out.println(����[0].������);
		
		System.out.println(����[0].get������());
		
	
		������ī ��������� = new ������ī("ȭ��Ʈ");
		
		System.out.println(���������.����);
		
		������ī ��� = new ������ī();
		
		������ǰ ��Ź�� = new ������ǰ();
		
		
	}

}
