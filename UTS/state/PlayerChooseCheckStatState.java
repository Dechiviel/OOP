package state;
import javax.swing.JOptionPane;

public class PlayerChooseCheckStatState extends PlayerBaseState
{
	public void EnterState(PlayerStateManager player)
	{
		String input;
		do {
			input = JOptionPane.showInputDialog(null,
				"1. Check Trainer "+ player.trainer.getName() + "'s stats.\n\n" +
				"2. Check "+ player.trainer.getHorse().getName() + "'s stats.\n\n" +
				"3. Check "+ player.trainer.getHorse().getName() + "'s skills.\n\n" +
				"4. Back.\n\n\n" +
				"Please choose what to check",
				(player.week == 15 ? "Final Week: 15": ("Week: " + player.week)),
				JOptionPane.PLAIN_MESSAGE);

			if (input == null) 
			{
				break;
			}

		} while (!input.equals("1") && !input.equals("2") && !input.equals("3") && !input.equals("4"));

		if(input.equals("1"))
		{
			JOptionPane.showMessageDialog(null,
				"Trainer Name: " + player.trainer.getName() + "\n" +
				"\n" + 
				"Training: " + player.trainer.getHorse().getName() + "\n" +
				"Bond: " + player.trainer.getBond(),
				(player.week == 15 ? "Final Week: 15": ("Week: " + player.week)),
				JOptionPane.PLAIN_MESSAGE);

			player.SwitchState(player.chooseCheckStatState);
		}
		else if(input.equals("2"))
		{
			JOptionPane.showMessageDialog(null,
				"Horse Name\t: " + player.trainer.getHorse().getName() + "\n" +
				"\n" + 
				"Speed: " + player.trainer.getHorse().getSpeed() + "\n" +
				"Stamina: " + player.trainer.getHorse().getStamina() + "\n" +
				"Power: " + player.trainer.getHorse().getPower(),
				(player.week == 15 ? "Final Week: 15": ("Week: " + player.week)),
				JOptionPane.PLAIN_MESSAGE);

			player.SwitchState(player.chooseCheckStatState);
		}
		else if(input.equals("3"))
		{
			JOptionPane.showMessageDialog(null,
				"Horse Name\t: " + player.trainer.getHorse().getName() + "\n" +
				"\n" + 
				"Active Skill: " + player.trainer.getHorse().getActiveSkill().getName() + "\n" + player.trainer.getHorse().getActiveSkill().getDescription() + "\n" +
				"Effectiveness: " + player.trainer.getHorse().getActiveSkill().getEffectiveness() + "\n\n" +
				"Passive Skill: " + player.trainer.getHorse().getPassiveSkill().getName() + "\n" + player.trainer.getHorse().getPassiveSkill().getDescription() + "\n" +
				"Effectiveness: " + player.trainer.getHorse().getPassiveSkill().getEffectiveness(),
				(player.week == 15 ? "Final Week: 15": ("Week: " + player.week)),
				JOptionPane.PLAIN_MESSAGE);

			player.SwitchState(player.chooseCheckStatState);
		}
		else if(input.equals("4"))
		{
			player.SwitchState(player.weeklyChoiceState);
		}
	}
}