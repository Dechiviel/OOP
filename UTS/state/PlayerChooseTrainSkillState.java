package state;
import javax.swing.JOptionPane;

public class PlayerChooseTrainSkillState extends PlayerBaseState
{
	public void EnterState(PlayerStateManager player)
	{
		String input;
		do {
			input = JOptionPane.showInputDialog(null,
					"1. Train active skill.\n\n" +
					"2. Train passive skill.\n\n" +
					"3. Let's reconsider.\n\n\n" +
					"Please choose what to do",
					(player.week == 15 ? "Final Week: 15": ("Week: " + player.week)),
					JOptionPane.PLAIN_MESSAGE);

			if (input == null) 
			{
				break;
			}

		} while (!input.equals("1") && !input.equals("2") && !input.equals("3"));

		if(input.equals("1"))
		{
			JOptionPane.showMessageDialog(null,
				"You’ve chosen training active skill! Your horse will get better at it over time, helping it perform better during races.",
				(player.week == 15 ? "Final Week: 15": ("Week: " + player.week)),
				JOptionPane.PLAIN_MESSAGE);

			if(player.trainer.trainActiveSkill())
				player.week += 1;

			player.SwitchState(player.weeklyChoiceState);
		}
		else if(input.equals("2"))
		{
			JOptionPane.showMessageDialog(null,
				"You’ve chosen training passive skill! Your horse will get better at it over time, helping it perform better during races.",
				(player.week == 15 ? "Final Week: 15": ("Week: " + player.week)),
				JOptionPane.PLAIN_MESSAGE);

			if(player.trainer.trainPassiveSkill())
				player.week += 1;

			player.SwitchState(player.weeklyChoiceState);
		}
		else if(input.equals("3"))
		{			
			player.SwitchState(player.weeklyChoiceState);
		}
	}

}