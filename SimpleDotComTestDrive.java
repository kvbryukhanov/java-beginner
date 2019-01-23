/* 
Псевдокод для SimpleDotCom
переменные экземпляра:
1) целочисленный массив для хранения кол-ва попаданий 
	locationCells
2) количество попаданий
	numOfHits = 0
методы:
1) Проверяющий методы "попал, мимо, потопил"
	checkYourself()
2) Сеттер положения корабля String(1,3,..)
	setLocationCells
*/

public class SimpleDotComTestDrive {
	public static void main (String[] args) {
		SimpleDotCom dot = new SimpleDotCom();\
		
		int[] location = {2,3,4};
		dot.setLocationCells(location);
		String userGuess = "2";
		String result = dot.chechYourself(userGuess);
		String tetstResult = "Неудача";
		if (result.equals("Попал")) {
			testResult = "Пройден";
		}
		System.out.println(testResult);
	}
}
