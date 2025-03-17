public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int lettersToFive(String word, char letter){
		int index = 0;
		int count = 0;
		while (index < word.length() && count < 5){
			if (word.charAt(index) == letter){
				count++;
			}
			index++;
		}
		if (count == 5){
			return index;
		}else{
			return -1;
		}
	}

	public static int countLetter(String word, char letter){
		int index = 0;
		int count = 0;
		while (index < word.length()){
			if (word.charAt(index) == letter){
				count++;
			}
			index++;
		}
		return count;
	}


	public static int oddSum (int num, int num2){
		int smallNum = Math.min(num, num2);
		int bigNum = Math.max(num, num2);
		int sum = 0;
		while (smallNum <= bigNum){
			if (smallNum % 2 != 0){
				sum += smallNum;
				}
				smallNum++;
			}
			return sum;
		}		
}


