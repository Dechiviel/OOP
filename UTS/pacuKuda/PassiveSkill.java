package pacuKuda;

public class PassiveSkill extends Skill
{
	private boolean isUnlocked;
	private boolean alreadyUsed;

	public PassiveSkill(String name, String description, int effectiveness, boolean isUnlocked)
	{
		super(name, description, effectiveness);
		this.isUnlocked = isUnlocked;
		this.alreadyUsed = false;
	}

	public boolean useSkill()
	{
		return false; 
	}

	public boolean checkUnlock()
	{
		return false;
	}

	public boolean getIsUnlocked()
	{
		return this.isUnlocked;
	}

	public void setIsUnlocked(boolean isUnlocked) {
		this.isUnlocked = isUnlocked;
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

	public boolean getAlreadyUsed()
	{
		return this.alreadyUsed;
	}

	public void setAlreadyUsed(boolean alreadyUsed)
	{
		this.alreadyUsed = alreadyUsed;
	}
}