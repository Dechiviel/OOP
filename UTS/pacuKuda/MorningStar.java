package pacuKuda;

import javax.swing.JOptionPane;

public class MorningStar extends PassiveSkill
{
	public MorningStar(String name, String description, int effectiveness, boolean isUnlocked)
	{
		super(name, description, effectiveness, isUnlocked);
	}

	public boolean useSkill()
	{
		if(!getIsUnlocked()) return false;
		if(getAlreadyUsed()) return false;

		Horse horse = getHorse();
	
		horse.setSpeed(horse.getSpeed() + 20 * getEffectiveness()/100);
		JOptionPane.showMessageDialog(null,
            "Passive skill: Morning Star Activated!\n\nIncreased " + horse.getName() + "'s speed by " + (20 * getEffectiveness()/100) + " km/h.\n\n",
            "Grand Arena",
			JOptionPane.PLAIN_MESSAGE);

		setIsUnlocked(false);
		setAlreadyUsed(true);

		return true;
	}

	public boolean checkUnlock()
	{
		setIsUnlocked(true);
		return getIsUnlocked();
	}
}