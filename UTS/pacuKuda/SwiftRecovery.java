package pacuKuda;

import javax.swing.JOptionPane;

public class SwiftRecovery extends PassiveSkill
{
	public SwiftRecovery(String name, String description, int effectiveness, boolean isUnlocked)
	{
		super(name, description, effectiveness, isUnlocked);
	}

	public boolean useSkill()
	{
		if(!getIsUnlocked()) return false;
		if(getAlreadyUsed()) return false;

		Horse horse = getHorse();

		horse.setStaminaOnRace(horse.getStaminaOnRace() + (3 * getEffectiveness() / 100 == 0 ? 1 : 3 * getEffectiveness() / 100));
		JOptionPane.showMessageDialog(null,
			"Passive Skill: " + getName() + "\n\n" +
			horse.getName() + " restored " + (3 * getEffectiveness() / 100 == 0 ? 1 : 3 * getEffectiveness() / 100) + " stamina!\n\n",
			"Grand Arena",
			JOptionPane.PLAIN_MESSAGE);

		return true;
	}

	public boolean checkUnlock()
	{
		setIsUnlocked(true);
		return getIsUnlocked();
	}
}