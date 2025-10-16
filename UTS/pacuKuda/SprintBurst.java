package pacuKuda;

import javax.swing.JOptionPane;

public class SprintBurst extends ActiveSkill
{
	public SprintBurst(String name, String description, int effectiveness, boolean isOn, int cooldown, int cost)
	{
		super(name, description, effectiveness, isOn, cooldown, cost);
	}

	public boolean useSkill()
	{
		if(getIsOn()) return false;
		if(getCooldown() > 0) 
		{
			JOptionPane.showMessageDialog(null,
				"Skill is on cooldown!\n\n",
				"Grand Arena",
				JOptionPane.PLAIN_MESSAGE);
			return false;
		}

		Horse horse = getHorse();

		horse.setSpeed(horse.getSpeed() + getEffectiveness());

		JOptionPane.showMessageDialog(null,
			"Using " + getName() + ".\n\n" +
			"Speed stat increased by " + getEffectiveness() + "!\n\n",
			"Grand Arena",
			JOptionPane.PLAIN_MESSAGE);

		setIsOn(true);
		return true;
	}

	public boolean deactivateSkill()
	{
		if(!getIsOn()) return false;

		Horse horse = getHorse();

		horse.setSpeed(horse.getSpeed() - getEffectiveness());
		setIsOn(false);
		setCooldown(2);
		return true;
	}
}