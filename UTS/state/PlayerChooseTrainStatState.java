package state;
import pacuKuda.*;
import javax.swing.JOptionPane;

public class PlayerChooseTrainStatState extends PlayerBaseState
{
	public void EnterState(PlayerStateManager player)
	{
		String input;
		int value = -1;

		do {
			input = JOptionPane.showInputDialog(null,
					"How much extra weight (in kg) would you like your horse to carry during training?\n\n" +
					"Keep in mind: heavier weights will challenge your horse more but too much can tire it quickly.\n\n" +
					"Enter a value between 0 and 200.",
					(player.week == 15 ? "Final Week: 15": ("Week: " + player.week)),
					JOptionPane.PLAIN_MESSAGE);

			if (input == null) 
			{
				break;
			}

			try {
				value = Integer.parseInt(input);
			} 
			catch (NumberFormatException e) {
				value = -1;
			}

		} while (value < 0 || value > 200);

		player.trainer.setTrainedHorse(new PackHorse(player.trainer.getHorse(), value, player.trainer.getBond()));

		player.SwitchState(player.chooseTrainStatSpeedState);
	}

}