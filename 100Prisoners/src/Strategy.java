
public abstract class Strategy {
	protected String strategyName;
	protected RiddleTrials trials;

	//runs 
	Strategy(RiddleScenario riddle) {
		trials = new RiddleTrials(riddle, 1);
	}
	Strategy(RiddleTrials trials) {
		this.trials = trials;
	}
	
	abstract void runTrials();
	
	public void printResultLong() {
		for (int i = 1; i <= trials.getNumOfTrials(); i++) {
			System.out.println(trials.getTrialList().get(i).getPrisoners().aliveResultsLong());
		}
		
	}
	public void printResultTotals() {
		for (int i = 1; i <= trials.getNumOfTrials(); i++) {
			System.out.println(trials.getTrialList().get(i).getPrisoners().aliveResultsTotals());
		}
	}
	public void printStrategyStats() {
		int allAlive = 0;
		for (int i = 1; i <= trials.getNumOfTrials(); i++) { //trial number i
			int numAlive = 0;
			for (int j = 1; j <= trials.getTrialList().get(i).getNumberOfPrisoners(); j++) { //prisoner number j
				if (trials.getTrialList().get(i).getPrisoners().getAliveOrDeadMap().get(j).equals("alive")) {
					numAlive++;
				}
			}
			if (numAlive == trials.getTrialList().get(i).getNumberOfPrisoners()) {
				allAlive++;
			}
		}
		System.out.println("For the strategy " + strategyName + ", all prisoners found their number " + allAlive + "/" + trials.getNumOfTrials() + " trials, or " + ((100*allAlive)/trials.getNumOfTrials()) + "%.");
	}
	
	public RiddleTrials getTrials() {
		return trials;
	}
}
