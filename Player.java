public class Player {
	int number = 0; //������ ������� ����������� �����
	//����� �������� ����� �� 0 �� 9
	public void guess() {
		number = (int) (Math.random() * 10);
		System.out.println ("�����, ��� ����� " + number);
	}
}