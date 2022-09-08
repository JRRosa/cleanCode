package cleanCode.chapter2;

public class GuessStaticMessage {
	
	private void printGuessStatistics(char candidate, int count) {
		
		String number;
		String verb;
		String pluralModifier;
		
		if (count == 0) {
			number = "no";
			verb = "are";
			pluralModifier = "s";
		} else if (count == 1) {
			number = "1";
			verb = "is";
			pluralModifier = "";
		} else {
			number = Integer.toString(count);
			verb = "are";
			pluralModifier = "s";
		}
		
		String guessMessage = String.format(
				"There %s %s %s%s", verb, number, candidate, pluralModifier);
		
		System.out.print(guessMessage);
	}
		
	private String number;
	private String verb;
	private String pluralModifier;
	
	public String make(char candidate, int count) {
		createPluralDependentMessageParts(count);
		return String.format(
				"There %s %s %s%s", verb, number, candidate, pluralModifier);
	}
	
	private void createPluralDependentMessageParts(int count) {
		if (count == 0) {
			thereAreNoLetters();
		} else if (count == 1) {
			thereIsOneLetter();
		} else {
			thereAreManyLetter(count);
		}
		
	}

	private void thereAreManyLetter(int count) {
		number = Integer.toString(count);
		verb = "are";
		pluralModifier = "s";
	}

	private void thereIsOneLetter() {
		number = "1";
		verb = "is";
		pluralModifier = "";
	}

	private void thereAreNoLetters() {
		number = "no";
		verb = "are";
		pluralModifier = "s";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}