import java.util.Map;
import java.util.TreeMap;

public class RiddleTrials {
	private Map<Integer, RiddleScenario> trialList = new TreeMap<>();
	private int numOfTrials;
	
	RiddleTrials(RiddleScenario riddleScenario, int numOfTrials) {
		this.numOfTrials = numOfTrials;
		for (int i = 1; i <= numOfTrials; i++) {
			trialList.put(i, new RiddleScenario(riddleScenario.getNumberOfDrawers(), riddleScenario.getNumberOfPrisoners(), riddleScenario.getMaxGuesses()));
		}
	}
	
	public void displayTrialResults() {
		
	}
	
	public Map<Integer, RiddleScenario> getTrialList() {
		return trialList;
	}
	public int getNumOfTrials() {
		return numOfTrials;
	}
}

