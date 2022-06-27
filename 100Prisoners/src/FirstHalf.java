import java.util.ArrayList;
import java.util.Random;


//each prisoner gets his own instance of this class. The object records his guesses and cycles through them
public class FirstHalf {
	
	
	//instance variables
	private int maxGuesses; //the maximum number of guesses allowed per prisoner
	private int firstGuess; //the first drawer number guessed
	private int lastGuess; //the most recent drawer number guessed
	private ArrayList<Integer> recordedGuesses; //array of the guesses
	
	//constructors
	public FirstHalf(Drawers drawers, Prisoners prisoners, int prisonerID) {
		setMaxGuesses(drawers.getNumberOfDrawers()/2);
		setFirstGuess(1);
		setLastGuess(getFirstGuess());
		
	}
	public void searchDrawers(Drawers drawers, Prisoners prisoners, int prisonerID) {
		for (int i = 0; i < maxGuesses; i++) {
			if (drawers.getDrawerNumbers().get(getLastGuess()) == prisonerID) {
				prisoners.getAliveOrDead().set(prisonerID - 1, 1);
			} else {
				setLastGuess(getLastGuess() + 1);
			}
		}
		if (prisoners.getAliveOrDead().get(prisonerID) == -1) {
			prisoners.getAliveOrDead().set(prisonerID - 1, 0);
		}
	}
	
//	//rolls an N sided die (includes zero)
//		public static int generateRandomDieRoll(int sides) {
//			Random rand = new Random();
//			int randomRoll = Math.abs(rand.nextInt() % sides);
//			return randomRoll;
//		}
	
	//methods
	//
//	public boolean searchDrawers(Drawers drawers, int prisonerID) {
//		for (int i = 1; i <= drawers.getNumberOfDrawers(); i++) {
//			if (drawers.getDrawerNumbers().get(i) == prisonerID) {
//				return true;
//			} else {
//				return searchDrawers();
//			}
//		}
//	}
	
	//getters and setters
	public int getMaxGuesses() {
		return maxGuesses;
	}
	public void setMaxGuesses(int maxGuesses) {
		this.maxGuesses = maxGuesses;
	}
	public int getFirstGuess() {
		return firstGuess;
	}
	public void setFirstGuess(int firstGuess) {
		this.firstGuess = firstGuess;
	}
	public int getLastGuess() {
		return lastGuess;
	}
	public void setLastGuess(int lastGuess) {
		this.lastGuess = lastGuess;
	}
	public ArrayList<Integer> getAllGuesses() {
		return recordedGuesses;
	}
	public void setAllGuesses(ArrayList<Integer> allGuesses) {
		this.recordedGuesses = allGuesses;
	}
}
