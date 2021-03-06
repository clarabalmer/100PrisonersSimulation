
//Riddle: 100 numbered prisoners must find their own numbers in one of 100 drawers in order to survive.
//Each prisoner may open only 50 drawers and cannot communicate with other prisoners.
//This program is for exploring variations on the riddle and various guessing strategies.

public class RiddleApp {

	public static void main(String[] args) {
		
		FirstHalf fh = new FirstHalf(new RiddleTrials(new RiddleScenario(100, 100, 50), 100));
		fh.runTrials();
		fh.printStrategyStats();
		
		NumberFollow test = new NumberFollow(new RiddleTrials(new RiddleScenario(100, 100, 50), 100));
		test.runTrials();
		test.printStrategyStats();
		
		//To Do:
		//add strategy where prisoners choose (unique) drawers at random
		//add strategy where one prisoner is allowed to open all drawers, and switch exactly two cards, before everyone goes in
		//finalize explanation of riddle, different solutions, how to use the program
		//add some example runs in main, commented out, but with notes
	}
}
