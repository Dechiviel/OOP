package state;
import javax.swing.JOptionPane;
import pacuKuda.*;

public class PlayerTrainingInstructionState extends PlayerBaseState
{
	public void EnterState(PlayerStateManager player)
	{
		JOptionPane.showMessageDialog(null,
			"++++++ Welcome, Trainer " + player.trainer.getName() + "! ++++++\n",
			"Training Instruction",
			JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
			"Your goal here is to win the horse race competition that will be held in 15 weeks.",
			"Training Instruction",
			JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
			"Each week, you can train your horse, deepen your bond, or even train its skill.\nPlease use your time wisely",
			"Training Instruction",
			JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
			"Every horse has 3 main stats. That's speed, stamina, and power.\n\n" +
			"Speed\t: determines top speed.\n\n" +
			"Stamina\t: the duration horse can stay in top speed.\n\n" +
			"Power\t: determines how fast one can reach their top speed.",
			"Training Instruction",
			JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
			"You can increase your horse stats by training.",
			"Training Instruction",
			JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
			"During training, you can choose how to adjust your horse:\n" +
			"- The weight the horse carries.\n" +
			"- Whether the horse runs fast or slow.\n\n" +
			"Each choice affects different stats. Some increase more on stamina, others speed or power.\n" +
			"Plan carefully to make horse stronger before the race!",
			"Training Instruction",
			JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
			"You can also increase your bond with your horse.\n" +
			"A stronger bond will boost the stats and skills your horse gains during training.\n",
			"Training Instruction",
			JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
			"Of course, you won't enter this tournament without knowing anything.\n" +
			"You have a way to train special skills for your horse.",
			"Training Instruction",
			JOptionPane.PLAIN_MESSAGE);
		
		String activeSkillInput;

		do {
			activeSkillInput = JOptionPane.showInputDialog(null,
					"Please choose the active skill you want to focus on:\n\n" +
					"1. Sprint Burst\nMassively increase your speed, but it will also use more stamina the faster it goes.\n\n" +
					"2. Endurance Boost\nIncrease your stamina during race. Won't exceed the maximum stamina limit.\n\n" +
					"3. Steady Pacer\nSacrifices all power during the race, but grants a large boost to stamina.\n\n" +
					"Active skills have an effectiveness percentage, which can be improved through skill training.",
					"Training Instruction",
					JOptionPane.PLAIN_MESSAGE);

			if (activeSkillInput == null) 
			{
				break;
			}

		} while (!activeSkillInput.equals("1") && !activeSkillInput.equals("2") && !activeSkillInput.equals("3"));

		String passiveSkillInput;

		do {
			passiveSkillInput = JOptionPane.showInputDialog(null,
					"Please choose the passive skill you want to focus on:\n\n" +
					"1. Swift Recovery\nRestores stamina each round during race. Helps your horse maintain speed for longer periods.\n\n" +
					"2. Morning Star\nPermanently boosts your horse's speed from the very start of each race, giving an early advantage over competitors.\n\n" +
					"3. Unyielding Will\nIncreasing speed when stamina is low.\n\n" +
					"Passive skills have an effectiveness percentage, which can be improved through skill training.",
					"Training Instruction",
					JOptionPane.PLAIN_MESSAGE);

			if (activeSkillInput == null) 
			{
				break;
			}

		} while (!passiveSkillInput.equals("1") && !passiveSkillInput.equals("2") && !passiveSkillInput.equals("3"));




		if (activeSkillInput.equals("1"))
			player.trainer.getHorse().setActiveSkill(new SprintBurst("Sprint Burst", "Massively increase your speed, but it will also use more stamina the faster it goes.", 0, false, 0, 0));
		else if (activeSkillInput.equals("2"))
			player.trainer.getHorse().setActiveSkill(new EnduranceBoost("Endurance Boost", "Increase your stamina during race. Won't exceed the maximum stamina limit.", 0, false, 3, 0));
		else if (activeSkillInput.equals("3"))
			player.trainer.getHorse().setActiveSkill(new SteadyPacer("Steady Pacer", "Sacrifices all power during the race, but grants a large boost to stamina.", 0, false, 0, 0));

		PassiveSkill passiveSkill = null;
		if (activeSkillInput.equals("1"))
			player.trainer.getHorse().setPassiveSkill(new SwiftRecovery("Swift Recovery", "Restores stamina each round during race. Helps your horse maintain speed for longer periods.", 0, false));
		else if (activeSkillInput.equals("2"))
			player.trainer.getHorse().setPassiveSkill(new MorningStar("Morning Star", "Permanently boosts your horse's speed from the very start of each race, giving an early advantage over competitors.", 0, false));
		else if (activeSkillInput.equals("3"))
			player.trainer.getHorse().setPassiveSkill(new UnyieldingWill("Unyielding Will", "Increasing speed when stamina is low.", 0, false));

		JOptionPane.showMessageDialog(null,
			"Now. let's start your journey!",
			"Training Instruction",
			JOptionPane.PLAIN_MESSAGE);

		player.SwitchState(player.weeklyChoiceState);
	}
}