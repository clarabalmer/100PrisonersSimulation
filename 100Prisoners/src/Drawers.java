import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

//Drawers class makes a map of numbered drawers which each contain a unique, random, prisoner's number
public class Drawers {
	private int numberOfDrawers;
	private Map<Integer, Integer> drawerMap = new TreeMap<>();
	
	public Drawers(int numberOfDrawers) {
		setNumberOfDrawers(numberOfDrawers);
		ArrayList<Integer> prisonerNumbersSorted = new ArrayList<>();
		//create array list of the prisoner numbers, in order
		for (int i = 1; i <= this.numberOfDrawers; i++) {
			prisonerNumbersSorted.add(i);
		}
		//for each drawer in order, randomly select a prisoner number,
		//prisoner number=value, drawer number=key
		for (int j = 1; j <= this.numberOfDrawers; j++) {
			int entryPull = generateRandomDieRoll(prisonerNumbersSorted.size());
			drawerMap.put(j, prisonerNumbersSorted.get(entryPull));
			prisonerNumbersSorted.remove(entryPull);
		}
	}
	
	//methods
	@Override
	public String toString() {
		String result = "";
		for (int i = 1; i <= numberOfDrawers; i++) {
			result += "\nDrawer " + i + ": " + drawerMap.get(i);
		}
		return result;
	}
	//rolls an N sided die (includes zero)
	public static int generateRandomDieRoll(int sides) {
		Random rand = new Random();
		int randomRoll = Math.abs(rand.nextInt() % sides);
		return randomRoll;
	}
	
	//getters/setters
	public int getNumberOfDrawers() {
		return numberOfDrawers;
	}
	public void setNumberOfDrawers(int numberOfDrawers) {
		this.numberOfDrawers = numberOfDrawers;
	}
	public Map<Integer, Integer> getDrawerNumbers() {
		return drawerMap;
	}
}
