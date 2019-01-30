//ОБЪЯВЛЯЕМ переменную numOfGuess для хранения количества ходов пользователя
//СОЗДАЕМ новый экземпляр класса SimpleDotCom
//ВЫЧИСЛЯЕМ случайное число от 0 до 4 для местоположения начальной ячейки
//ЗАДАЕМ положение "сайта" -- создаем целочисленный массив с тремя элементами
//	используя сгенерированное число, число + 1, число + 2
//ВЫЗЫВАЕМ метод setLocationCells() из экземпляра класса SimpleDotCom
//ОБЪЯВЛЯЕМ булеву переменную isAlive для хранения состояния игры.
// присваиеваем ей значение True

//ПОКА "сайт" не потоплен (isAlive == true):
// ПОЛУЧАЕМ пользовательский ввод из командной строки
// ПРОВЕРЯЕМ полученную информацию
// ВЫЗЫВАЕМ метод checkYourSelf() из экземпляра SimpleDotCom
// ИНКРЕМЕНТИРУЕМ переменную numOfGuesses
// ПРОВЕРЯЕМ не потоплен ли "сайт"
// ЕСЛИ результат равен Потопил
// 	ПРИСВАИВАЕМ переменной isAlive значение false (это значит, что мы не хотим
// 	снова заходить в цикл)
// 	ВЫВОДИМ количество сделанных ходов
// КОНЕЦ ВЕТВЛЕНИЯ
//КОНЕЦ ЦИКЛА
//КОНЕЦ МЕТОДА
  
  public staitic void main (String[] args) {
  
	int numOfGuesses = 0;
	GameHelper helper = new GameHelper();
	
	SimpleDotCom theDotCom = new SimpleDotCom();
	int randomNum = (int) (Math.random() * 5);
	
	int[] location = {randomNum, randomNum + 1, randomNum + 2};
	theDotCom.setLocationCells(location);
	boolean isAlive = true;
	
	while (isAlive == true) {
		String guess = helper.getUserInput("Введите число");
		String result = theDotCom.checkYourSelf(guess);
		if (result.equals("Потопил")){
			isAlive = false;
			System.out.println("Вам потребовалось" + numOfGuesses + "попыток(и)");
		}//конец IF
	}//конец WHILE
  }//конец МЕТОДА MAIN