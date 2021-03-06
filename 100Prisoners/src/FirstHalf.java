
public class FirstHalf extends Strategy {
	//not a very good strategy: each prisoner opens drawers 1-50.
	
	
	
	FirstHalf(RiddleScenario riddle) {
		super(riddle);
		strategyName = "FirstHalf";
	}
	FirstHalf(RiddleTrials trials) {
		super(trials);
		strategyName = "FirstHalf";
	}

	@Override
	public void runTrials() {
		for (int i = 1; i <= trials.getNumOfTrials(); i++) { //trial number i
			for (int j = 1; j <= trials.getTrialList().get(i).getNumberOfPrisoners(); j++) { //prisoner number j
				for (int k = 1; k <= trials.getTrialList().get(i).getMaxGuesses(); k++) { //checking drawer number k
					if (trials.getTrialList().get(i).getDrawers().getDrawerNumbers().get(k) == j) { //if drawer k holds number == prisoner number j
						trials.getTrialList().get(i).getPrisoners().setOnePrisoner(j, "alive"); //mark prisoner as alive, and quit checking drawers
						break;
					}
				}
				if (trials.getTrialList().get(i).getPrisoners().getAliveOrDeadMap().get(j).equals("waiting")) { //if all drawers checked and not marked alive, mark dead
					trials.getTrialList().get(i).getPrisoners().setOnePrisoner(j, "dead");
				}
			}
		}
	}
	
	
}
