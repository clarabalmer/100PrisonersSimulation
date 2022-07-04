
public class NumberFollow extends Strategy {
	//in this strategy, each prisoner opens the drawer with their number first,
	//then opens the drawer that matches the number they found, and so on.

	NumberFollow(RiddleScenario riddle) {
		super(riddle);
		strategyName = "NumberFollow";
	}
	NumberFollow(RiddleTrials trials) {
		super(trials);
		strategyName = "NumberFollow";
	}

	@Override
	void runTrials() {
		for (int i = 1; i <= trials.getNumOfTrials(); i++) { //trial number i
			for (int j = 1; j <= trials.getTrialList().get(i).getNumberOfPrisoners(); j++) { //prisoner number j
				int checkDrawer = j;														//start with drawer w/ same number as prisoner
				for (int k = 1; k <= trials.getTrialList().get(i).getMaxGuesses(); k++) {
					if (trials.getTrialList().get(i).getDrawers().getDrawerNumbers().get(checkDrawer) == j) {
						trials.getTrialList().get(i).getPrisoners().setOnePrisoner(j, "alive"); //mark prisoner as alive, and quit checking drawers
						break;
					} else {
						checkDrawer = trials.getTrialList().get(i).getDrawers().getDrawerNumbers().get(checkDrawer);
					}
				}
				if (trials.getTrialList().get(i).getPrisoners().getAliveOrDeadMap().get(j).equals("waiting")) { //if all drawers checked and not marked alive, mark dead
					trials.getTrialList().get(i).getPrisoners().setOnePrisoner(j, "dead");
				}
			}
		}
	}

}
