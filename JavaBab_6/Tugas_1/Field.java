public class Field
{
	public int lap;
	public int numberOfSpectators;

	public Field(int lap, int numberOfSpectators)
	{
		this.lap = lap;
		this.numberOfSpectators = numberOfSpectators;
	}

	public void increaseSpectators(int num)
	{
		this.numberOfSpectators = (int)(this.numberOfSpectators + (Math.random() * num));
		this.printSpectators();
	}
	

	public void printSpectators()
	{
		System.out.println("Current spectators reach " + numberOfSpectators + " people!");
	}
}