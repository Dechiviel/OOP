package state;
import javax.swing.JOptionPane;
import pacuKuda.*;

public class PlayerRacingState extends PlayerBaseState
{
	public void EnterState(PlayerStateManager player)
	{
		JOptionPane.showMessageDialog(null,
			"++++++++ R A C E  D A Y ++++++++\n\n",
			"Grand Arena",
			JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
			"The morning sun glows over the grand arena.\n" +
			"A gentle breeze carries the scent of freshly cut grass across the open field.\n" +
			"Thousands of spectators cheer as banners flutter in the wind.\n\n" ,
			"Grand Arena",
			JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
			"The racing track stretches before you, a perfect 2000 meters of packed dirt.\n" +
			"Slightly uneven in places, demanding both balance and precision from every rider.\n",
			"Grand Arena",
			JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
			"\"Welcome to the Grand Arena, where champions are made\".\n" +
			"The day you’ve waiting for has finally arrived!\"\n" +
			"You heard crier voice from afar through the noise of the crowd.\n\n",
			"Grand Arena",
			JOptionPane.PLAIN_MESSAGE);

			
		JOptionPane.showMessageDialog(null,
			"You lead your horse to the starting gate.\n" +
			"Beside you, twenty other riders take their positions, each ready to chase glory.\n\n",
			"Grand Arena",
			JOptionPane.PLAIN_MESSAGE);


		JOptionPane.showMessageDialog(null,
			"You gently pat your horse's neck and whisper.\n" +
			"\"Easy now... Just like we practiced. You know what to do.\"\n\n",
			"Grand Arena",
			JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
			"\"Riders... prepare yourselves!\"\n",
			"Grand Arena",
			JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
			"The world seems to narrow, the cheering fades.\n" +
			player.trainer.getHorse().getName() + "'s muscles tighten. Not from fear, but from focus.\n",
			"Grand Arena",
			JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
			"The referee raises his hand high...\n",
			"Grand Arena",
			JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
			"BANG! the starting gun fires!\n",
			"Grand Arena",
			JOptionPane.PLAIN_MESSAGE);

		this.initializeTerrain(player);
		player.SwitchState(player.racingChoiceState);
	}

	public void initializeTerrain(PlayerStateManager player) {
        player.terrain = new Terrain("Grand Arena", 2000);

        //dummy data
        player.terrain.addTrainer(new Trainer("Takumi", new Horse("Special Week", 85, 70, 80, null, null)));
        player.terrain.addTrainer(new Trainer("Ayaka", new Horse("Silence Suzuka", 95, 60, 90, null, null)));
        player.terrain.addTrainer(new Trainer("Ryo", new Horse("Tokai Teio", 88, 78, 85, null, null)));
        player.terrain.addTrainer(new Trainer("Mei", new Horse("Mejiro McQueen", 80, 85, 75, null, null)));
        player.terrain.addTrainer(new Trainer("Daichi", new Horse("Gold Ship", 92, 68, 82, null, null)));
        player.terrain.addTrainer(new Trainer("Haruto", new Horse("Daiwa Scarlet", 89, 75, 88, null, null)));
        player.terrain.addTrainer(new Trainer("Sora", new Horse("Vodka", 87, 74, 84, null, null)));
        player.terrain.addTrainer(new Trainer("Minato", new Horse("Grass Wonder", 83, 82, 80, null, null)));
        player.terrain.addTrainer(new Trainer("Reina", new Horse("Hishi Amazon", 90, 76, 85, null, null)));
        player.terrain.addTrainer(new Trainer("Tatsuya", new Horse("Winning Ticket", 84, 79, 83, null, null)));
        player.terrain.addTrainer(new Trainer("Arisa", new Horse("El Condor Pasa", 91, 77, 86, null, null)));
        player.terrain.addTrainer(new Trainer("Shun", new Horse("Narita Brian", 93, 80, 88, null, null)));
        player.terrain.addTrainer(new Trainer("Kaito", new Horse("Rice Shower", 88, 83, 82, null, null)));
        player.terrain.addTrainer(player.trainer);

        for (Trainer t : player.terrain.getTrainers()) {
            Horse h = t.getHorse();
            if (h != null) {
                h.setStaminaOnRace(h.getStamina());
            }
        }     
    } 
}