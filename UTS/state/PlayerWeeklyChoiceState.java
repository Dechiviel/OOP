package state;
import pacuKuda.*;
import javax.swing.JOptionPane;

public class PlayerWeeklyChoiceState extends PlayerBaseState
{
	public void EnterState(PlayerStateManager player)
	{
		if(player.week == 16) 
			player.SwitchState(player.racingState);		

		String input;
		
		if(player.week == 15)
			JOptionPane.showMessageDialog(null,
				"Tomorrow is the big day. Give it everything you've got.",
				"Final Week: 15",
				JOptionPane.PLAIN_MESSAGE);		

		do {
			input = JOptionPane.showInputDialog(null,
					"1. Train " + player.trainer.getHorse().getName() + "'s stat.\n\n" +
					"2. Train " + player.trainer.getHorse().getName() + "'s skill.\n\n" +
					"3. Increase bond with " + player.trainer.getHorse().getName() + "\n\n" +
					"4. Check our stats \n\n\n" +
					"Please choose what to do",
					(player.week == 15 ? "Final Week: 15": ("Week: " + player.week)),
					JOptionPane.PLAIN_MESSAGE);

			if (input == null) 
			{
				break;
			}

		} while (!input.equals("1") && !input.equals("2") && !input.equals("3") && !input.equals("4"));
		
		if(input.equals("1"))
		{
			player.SwitchState(player.chooseTrainStatState);
		}
		else if(input.equals("2"))
		{
			player.SwitchState(player.chooseTrainSkillState);
		}
		else if(input.equals("3"))
		{
			if(player.trainer.increaseBond())
				player.week+=1;
			
			player.SwitchState(player.weeklyChoiceState);
		}

		else if(input.equals("4"))
		{
			player.SwitchState(player.chooseCheckStatState);
		}
	}
}