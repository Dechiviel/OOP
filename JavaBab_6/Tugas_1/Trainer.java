public class Trainer
{
	public String name;
	public Horse horse;
	private int intimatePercentage;

	public Trainer(String name, Horse horse, int intimatePercentage)
	{
		this.name = name;
		this.horse = horse;
		this.intimatePercentage = intimatePercentage;
	}

	public boolean motivating()
	{
		if(Math.random() * 100 < this.intimatePercentage)
		{
			this.horse.motivated(this.horse.favoriteWord);
			return true;
		}
		else
			return false;
	}

	public void printInfo()
	{
		System.out.println("Horse\t\t: " + this.horse.name);
		System.out.println("Speed\t\t: " + this.horse.speed);
		System.out.println("Power\t\t: " + this.horse.power);
		System.out.println("Stamina\t\t: " + this.horse.stamina);
		System.out.println("Guts\t\t: " + this.horse.guts);
		System.out.println("Intimate\t: " + this.intimatePercentage);

		System.out.println("Trainer\t: " + this.name);
		System.out.println("");
	}
}