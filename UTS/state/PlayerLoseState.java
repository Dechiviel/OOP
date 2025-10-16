package state;
import javax.swing.JOptionPane;
import pacuKuda.*;

public class PlayerLoseState extends PlayerBaseState
{
	public void EnterState(PlayerStateManager player)
	{
		JOptionPane.showMessageDialog(null,
			"The roar of the crowd fades into the background...\n" +
            player.trainer.getHorse().getName() + " gives everything, but it’s not enough.\n\n",
            "Grand Arena",
            JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null,
            "Other horses thunder past, one after another. The finish line grows distant.\n" +
            "The announcer’s voice trembles with excitement for someone else’s victory.\n\n",
            "Grand Arena",
            JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null,
            "You look at " + player.trainer.getHorse().getName() + ". Tired, but proud.\n" +
            "Even in defeat, your bond hasn’t wavered.\n\n",
            "Grand Arena",
            JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null,
			"+++++ G A M E  O V E R ++++++\n\n",
            "ENDING",
            JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
	}
}