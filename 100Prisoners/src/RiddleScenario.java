
public class RiddleScenario {
	//fields
	private int numberOfDrawers;
	private int numberOfPrisoners;
	private int maxGuesses;
	private Drawers drawers;
	private Prisoners prisoners;
	
	RiddleScenario(int numberOfDrawers, int numberOfPrisoners, int maxGuesses) {
		setNumberOfDrawers(numberOfDrawers);
		setNumberOfPrisoners(numberOfPrisoners);
		setMaxGuesses(maxGuesses);
		drawers = new Drawers(numberOfDrawers);
		prisoners = new Prisoners(numberOfPrisoners);
	}
	
	//getters/setters
	public int getNumberOfDrawers() {
		return numberOfDrawers;
	}
	public void setNumberOfDrawers(int numberOfDrawers) {
		this.numberOfDrawers = numberOfDrawers;
	}
	public int getNumberOfPrisoners() {
		return numberOfPrisoners;
	}
	public void setNumberOfPrisoners(int numberOfPrisoners) {
		this.numberOfPrisoners = numberOfPrisoners;
	}
	public int getMaxGuesses() {
		return maxGuesses;
	}
	public void setMaxGuesses(int maxGuesses) {
		this.maxGuesses = maxGuesses;
	}
	public Drawers getDrawers() {
		return drawers;
	}
	public void setDrawers(Drawers drawers) {
		this.drawers = drawers;
	}
	public Prisoners getPrisoners() {
		return prisoners;
	}
	public void setPrisoners(Prisoners prisoners) {
		this.prisoners = prisoners;
	}
}
