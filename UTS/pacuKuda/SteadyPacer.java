package pacuKuda;
import javax.swing.JOptionPane;

public class SteadyPacer extends ActiveSkill
{
	public SteadyPacer(String name, String description, int effectiveness, boolean isOn, int cooldown, int cost)
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

		horse.setPower(0);
		horse.setStaminaOnRace(horse.getStaminaOnRace() + getEffectiveness()/2 > horse.getStamina() ? horse.getStamina() : horse.getStaminaOnRace() + getEffectiveness()/2);

		JOptionPane.showMessageDialog(null,
			"Steady Pacer activated!\n\n" +
			"Power becomes 0 and stamina restored by " + getEffectiveness()/2 + ".",
			"Grand Arena",
			JOptionPane.PLAIN_MESSAGE);

		setIsOn(true);
		return true;
	}

	public boolean deactivateSkill()
	{
		if(!getIsOn()) return false;
		JOptionPane.showMessageDialog(null,
			"Steady Pacer cannot be deactivated once activated!\n\n",
			"Grand Arena",
			JOptionPane.PLAIN_MESSAGE);

		return true;
	}	
}