import java.util.Map;
import java.util.TreeMap;

//Prisoners class makes a map of prisoners and a list of their statuses: waiting, alive, dead
public class Prisoners {
	private int numberOfPrisoners;
	private Map<Integer, String> aliveOrDeadMap = new TreeMap<>();
	
	
	
	//constructors
	Prisoners(int numberOfPrisoners) {
		setNumberOfPrisoners(numberOfPrisoners);
		for (int i = 1; i <= numberOfPrisoners; i++) {
			aliveOrDeadMap.put(i, "waiting");
		}
	}
	public void setOnePrisoner(int prisonerID, String status) {
		aliveOrDeadMap.replace(prisonerID, status);
	}
	public String aliveResultsLong() {
		String result = "";
		for (int i = 1; i <= numberOfPrisoners; i++) {
			result += "\nPrisoner " + i + ": " + aliveOrDeadMap.get(i);
		}
		return result;
	}
	public String aliveResultsTotals() {
		int waitingCount = 0;
		int aliveCount = 0;
		int deadCount = 0;
		for (int i = 1; i <= numberOfPrisoners; i++) {
			if (aliveOrDeadMap.get(i).equalsIgnoreCase("waiting")) {
				waitingCount++;
			} else if (aliveOrDeadMap.get(i).equalsIgnoreCase("alive")) {
				aliveCount++;
			} else {
				deadCount++;
			}
		}
		return "Alive: " + aliveCount + ". Dead: " + deadCount + ". Waiting: " + waitingCount + ".";
	}
	
	
	//getters/setters
	public int getNumberOfPrisoners() {
		return numberOfPrisoners;
	}
	public void setNumberOfPrisoners(int numberOfPrisoners) {
		this.numberOfPrisoners = numberOfPrisoners;
	}
	public Map<Integer, String> getAliveOrDeadMap() {
		return aliveOrDeadMap;
	}
	public void setAliveOrDeadMap(Map<Integer, String> aliveOrDeadMap) {
		this.aliveOrDeadMap = aliveOrDeadMap;
	}
}
