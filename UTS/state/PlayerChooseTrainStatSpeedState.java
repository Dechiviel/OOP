package state;
import pacuKuda.*;
import javax.swing.JOptionPane;

public class PlayerChooseTrainStatSpeedState extends PlayerBaseState
{
	public void EnterState(PlayerStateManager player)
	{
		String input;
		do {
			input = JOptionPane.showInputDialog(null,
					"1. Fast Run\nPush your horse to run at full speed. Great for speed, but consumes more stamina.\n\n" +
					"2. Slow Run\nLet your horse run steadily. Builds stamina efficiently without overexertion.\n\n" +
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
				"Your horse is running at full speed while carrying " + player.trainer.getTrainedHorse().getWeight() + " kg of extra weight!",
				(player.week == 15 ? "Final Week: 15": ("Week: " + player.week)),
				JOptionPane.PLAIN_MESSAGE);

			player.trainer.getTrainedHorse().train(true);
			player.week += 1;
			player.SwitchState(player.weeklyChoiceState);
		}
		else if(input.equals("2"))
		{
			JOptionPane.showMessageDialog(null,
				"Taking a steady pace, your horse carries " + player.trainer.getTrainedHorse().getWeight() + " kg of extra weight!",
				(player.week == 15 ? "Final Week: 15": ("Week: " + player.week)),
				JOptionPane.PLAIN_MESSAGE);

			player.trainer.getTrainedHorse().train(false);
			player.week += 1;
			player.SwitchState(player.weeklyChoiceState);
		}
		else if(input.equals("3"))
		{
			player.trainer.setTrainedHorse(null);
			
			player.SwitchState(player.weeklyChoiceState);
		}
	}

}