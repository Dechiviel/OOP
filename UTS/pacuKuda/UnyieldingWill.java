package pacuKuda;

import javax.swing.JOptionPane;

public class UnyieldingWill extends PassiveSkill
{
	public UnyieldingWill(String name, String description, int effectiveness, boolean isUnlocked)
	{
		super(name, description, effectiveness, isUnlocked);
	}

	public boolean useSkill()
	{
		if(!getIsUnlocked()) return false;
		if(getAlreadyUsed()) return false;

		Horse horse = getHorse();

		horse.setSpeed(horse.getSpeed() + 40 * getEffectiveness()/100);
		JOptionPane.showMessageDialog(null,
			"Stamina has become low\nUnyielding Will activated!\n\nSpeed increased by " + 40 * getEffectiveness()/100 + ".",
			"Grand Arena",
			JOptionPane.PLAIN_MESSAGE);
		setIsUnlocked(false);
		setAlreadyUsed(true);

		return true;
	}

	public boolean checkUnlock()
	{
		Horse horse = getHorse();

		if(horse.getStaminaOnRace() < 50)
			setIsUnlocked(true);

		return getIsUnlocked();
	}
}