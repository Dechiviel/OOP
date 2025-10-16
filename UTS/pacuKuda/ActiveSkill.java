package pacuKuda;

public class ActiveSkill extends Skill
{
	private boolean isOn;
	private int cooldown;

	public ActiveSkill(String name, String description, int effectiveness, boolean isOn, int cooldown, int cost)
	{
		super(name, description, effectiveness);
		this.isOn = isOn;
		this.cooldown = cooldown;
	}

	public boolean useSkill()
	{
		return true;
	}

	public boolean deactivateSkill()
	{
		return true;
	}

	public boolean getIsOn()
	{
		return this.isOn;
	}

	public void setIsOn(boolean isOn)
	{
		this.isOn = isOn;
	}

	public int getCooldown() {
		return cooldown;
	}

	public void setCooldown(int cooldown) {
		this.cooldown = cooldown;
	}

	//ini wrapper parent aj
	public String getName()
	{
		return super.getName();
	}

	public String getDescription()
	{
		return super.getDescription();
	}

	public int getEffectiveness()
	{
		return super.getEffectiveness();
	}

	public void addEffectiveness(int effectiveness)
	{
		super.addEffectiveness(effectiveness);
	}

	public void setHorse(Horse horse)
	{
		super.setHorse(horse);
	}

	public Horse getHorse() 
	{
		return super.getHorse();
	}
}