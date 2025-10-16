package pacuKuda;

public class Skill
{
	private String name;
	private String description;
	private int effectiveness;
	private Horse horse;
	
	public Skill(String name)
	{
		this(name, "", 0);
	}

	public Skill(String name, String description, int effectiveness)
	{
		this.name = name;
		this.description = description;
		this.effectiveness = effectiveness;
	}

	public String getName()
	{
		return this.name;
	}

	public String getDescription()
	{
		return this.description;
	}

	public int getEffectiveness()
	{
		return this.effectiveness;
	}

	public void addEffectiveness(int effectiveness)
	{
		this.effectiveness = (this.effectiveness + effectiveness > 100 ? 100 : this.effectiveness + effectiveness);
	}

	public void setHorse(Horse horse)
	{
		this.horse = horse;
	}

	public Horse getHorse() 
	{
		return this.horse;
	}
}