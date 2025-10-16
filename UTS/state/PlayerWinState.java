package state;
import javax.swing.JOptionPane;

public class PlayerWinState extends PlayerBaseState
{
	public void EnterState(PlayerStateManager player)
	{
		JOptionPane.showMessageDialog(null,
            "The crowd erupts into thunderous cheers!\n" +
            player.trainer.getHorse().getName() + " bursts across the finish line first!\n\n" +
            "\"An incredible victory! " + player.trainer.getName() + " and " + player.trainer.getHorse().getName() + " have done it!\"\n\n" +
            "The banners wave wildly, the Grand Arena trembles with applause.\n\n",
            "Grand Arena",
            JOptionPane.PLAIN_MESSAGE);

            JOptionPane.showMessageDialog(null,
            "\"We did it, " + player.trainer.getHorse().getName() + "! WE DID IT!\n\n",
            "Grand Arena",
            JOptionPane.PLAIN_MESSAGE);

            JOptionPane.showMessageDialog(null,
            "Every sweat, every early morning, every sacrifice has led to this moment.\n" +
            "Your legacy will be remembered among the champions of the Grand Arena.\n",
            "Grand Arena",
            JOptionPane.PLAIN_MESSAGE);

            JOptionPane.showMessageDialog(null,
            "No matter what comes next, this moment will never fade.\n",
            "Grand Arena",
            JOptionPane.PLAIN_MESSAGE);

            JOptionPane.showMessageDialog(null,
		"+++++ H A P P Y  E N D I N G ++++++\n\n",
            "ENDING",
            JOptionPane.PLAIN_MESSAGE);

            System.exit(0);
	}
}