import java.util.ArrayList;

//Prisoners class makes a set of prisoners and a list of their statuses:
//-1 if they haven't searched the drawers yet, 0 if searched the drawers and died, 1 if searched the drawers and lived.
public class Prisoners {
	private int numberOfPrisoners;
	private ArrayList<Integer> aliveOrDead = new ArrayList<>(); //-1 = null (ish), 0 = dead, 1 = alive
	
	
	//constructors
	Prisoners() {}
	//sets all prisoners aliveOrDead as -1 (unsure)
	Prisoners(int numberOfDrawers) {
		setNumberOfPrisoners(numberOfDrawers);
		for (int i = 0; i < numberOfPrisoners; i++) {
			aliveOrDead.add(-1);
		}
	}
	
	public String aliveResults() {
		String result = "";
		for (int i = 0; i < aliveOrDead.size(); i++) {
			result += "\nPrisoner " + (i + 1) + ": " + aliveOrDead.get(i);
		}
		return result;
	}
	
	
	//getters/setters
	public int getNumberOfPrisoners() {
		return numberOfPrisoners;
	}
	public void setNumberOfPrisoners(int numberOfPrisoners) {
		this.numberOfPrisoners = numberOfPrisoners;
	}
	public ArrayList<Integer> getAliveOrDead() {
		return aliveOrDead;
	}
	public void setAliveOrDead(ArrayList<Integer> aliveOrDead) {
		this.aliveOrDead = aliveOrDead;
	}
}
