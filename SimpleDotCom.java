public class SimpleDotCom {
	
	int[] locationCells;
	int numOfHits = 0;
	
	public void setLocationCells (int[] locs) {
		locationCells = locs;
	}
	
	public String checkYourSelf (String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "����";
		for (int cells : locationCells) {
			if (guess == cells) {
				result = "�����";
				numOfHits++;
				break;
			}
		}
		
		if (numOfHits == locationCells.length) {
			result = "�������";
		}
		System.out.println(result);
		return result;
	}
}