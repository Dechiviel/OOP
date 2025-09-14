public class Horse
{
	public String name;
	public int totalScore = 0;

	public int speed;
	public int power;

	public int stamina;
	public int guts;
	
	public String favoriteWord;

	public Horse(String name, int speed, int power, int stamina, int guts, String favoriteWord)
	{	
		this.name = name;
		this.speed = speed;
		this.power = power;
		this.stamina = stamina;
		this.guts = guts;
		this.favoriteWord = favoriteWord;
	}

	public void motivated(String word)
	{
		if(word.equals(this.favoriteWord))
		{
			this.speed = (int)(this.speed * (1 + 100/100));
		}
	}

	public int run()
	{
		int statA = (int)((Math.random() * (100 - this.power)) + this.power) * this.speed;
		int statB = (int)((Math.random() * (100 - this.guts)) + this.guts) * this.stamina;

		return (statA*statB);
	}
}