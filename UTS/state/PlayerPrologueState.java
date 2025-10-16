package state;
import pacuKuda.*;
import javax.swing.JOptionPane;

public class PlayerPrologueState extends PlayerBaseState
{
	public void EnterState(PlayerStateManager player)
	{
		JOptionPane.showMessageDialog(null, 
			"The morning wind drifts softly across the wide green fields at the edge of town.", 
			"Prologue", 
			JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null, 
			"The chirping of birds mixes with the distant rhythm of galloping hooves.", 
			"Prologue", 
			JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null, 
			"Before you stands a young horse. Her hooves paw at the ground, eager to run.", 
			"Prologue", 
			JOptionPane.PLAIN_MESSAGE);
		
		JOptionPane.showMessageDialog(null, 
			"It’s been a day since you spent all your savings to buy this racehorse.\n" +
			"Not a famous breed. Not the offspring of champions.\n" +
			"Just an ordinary horse from a small-town market.",
			"Prologue", 
			JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null, 
			"But somehow, deep down, you knew there’s something special about her.", 
			"Prologue", 
			JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null, 
			"\"Starting today, it’s you and me...\", you say while petting your horse.", 
			"Prologue", 
			JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
			"While bathing your horse, you accidentally find a pamphlet in your pocket drops. \n" +
			"You had completely forgotten about it. It was given by the horse seller a few days ago.",
			"Prologue",
			JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
			"You open the pamphlet and see a poster about a horse race.\n" +
			"The race will happen in 15 weeks, and the prize money is big.\n" +
			"With that much money, you can buy your horse and yourself a nice meal everyday.",
			"Prologue",
			JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
			"\"15 weeks... 15 weeks to become the greatest and fastest duo in here\"!",
			"Prologue",
			JOptionPane.PLAIN_MESSAGE);

		String playerName = JOptionPane.showInputDialog(null,
			"\"Everyone will see my name as, ....\"\n\n" + 
			"Please input your name", 
			"Prologue",
			JOptionPane.PLAIN_MESSAGE);

		String horseName = JOptionPane.showInputDialog(null,
			"\"And my beloved name, ....\"\n\n" + 
			"Please input your horse name",
			"Prologue",
			JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
			"\"Both " + playerName + " and "+ horseName + " will conquer this race\"!",
			"Prologue",
			JOptionPane.PLAIN_MESSAGE);

		
		player.trainer = new Trainer(playerName, new Horse(horseName, null, null));

		player.SwitchState(player.trainingInstructionState);
	}
}