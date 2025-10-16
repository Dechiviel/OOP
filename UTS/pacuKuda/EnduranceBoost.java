package pacuKuda;
import javax.swing.JOptionPane;

public class EnduranceBoost extends ActiveSkill
{
	public EnduranceBoost(String name, String description, int effectiveness, boolean isOn, int cooldown, int cost)
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

		horse.setStaminaOnRace(horse.getStaminaOnRace() + getEffectiveness()/8 > horse.getStamina() ? horse.getStamina() : horse.getStaminaOnRace() + getEffectiveness()/8);
		setIsOn(true);

		JOptionPane.showMessageDialog(null,
			"Endurance Boost activated!\n\nStamina recovered by " + getEffectiveness()/8 + ".",
			"Grand Arena",
			JOptionPane.PLAIN_MESSAGE);

		deactivateSkill();

		return true;
	}

	public boolean deactivateSkill()
	{
		if(!getIsOn()) return false;

		setIsOn(false);

		setCooldown(3);
		return true;
	}
}