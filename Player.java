public class Player {
	int number = 0; //Хранит вариант загаданного числа
	//игрок называет число от 0 до 9
	public void guess() {
		number = (int) (Math.random() * 10);
		System.out.println ("Думаю, это число " + number);
	}
}