/* 
��������� ��� SimpleDotCom
���������� ����������:
1) ������������� ������ ��� �������� ���-�� ��������� 
	locationCells
2) ���������� ���������
	numOfHits = 0
������:
1) ����������� ������ "�����, ����, �������"
	checkYourself()
2) ������ ��������� ������� String(1,3,..)
	setLocationCells
*/

public class SimpleDotComTestDrive {
	public static void main (String[] args) {
		SimpleDotCom dot = new SimpleDotCom();\
		
		int[] location = {2,3,4};
		dot.setLocationCells(location);
		String userGuess = "2";
		String result = dot.chechYourself(userGuess);
		String tetstResult = "�������";
		if (result.equals("�����")) {
			testResult = "�������";
		}
		System.out.println(testResult);
	}
}
