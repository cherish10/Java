public class �ڵ��� {

		public int ����;
		public double ����;
		public String ����;
		public String ������;
		public String ����;
		public String �����̸�;
		int �ӵ�;
		private int price;
		
		public void �ڵ���() {
			
		}
		
		//�ڵ���()=> ������ �żҵ�� �ȸ���� �⺻������ �����Ϸ��� �ڵ����� �����.

		String get����() { //���α׷��� ���̿� get�޼ҵ� �տ� �پ�������
			//�ʵ忡 �����ؼ� �����͸� �о�(����)���� ������ ����
			return ����;
		}
		
		String get������() {
			return ������;
		}
		
		public void set����(int ����) { //���α׷��� ���̿� set�޼ҵ� �տ� �پ�������
			//�ʵ忡 �����ؼ� ����ó�� ����(�����ϴ�) ������ ����
			//setXXX()
			this.price = ����;
		}

		public void set������(String ������) {
			this.������ = ������;
		}
		
		
		public void ����() {
			�ӵ� = �ӵ� + 10;
		}
		
		public void ����(int value) {
			�ӵ� = �ӵ� + value;
		}
		
		public void ����() {
			if( �ӵ� <= 0) {
				�ӵ� =0;
			}else {
				�ӵ� = �ӵ� - 10;
			}
		}
		
		
		public void �׺���̼��ѱ�() {
			
		}
		
}
