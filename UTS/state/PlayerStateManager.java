package state;
import pacuKuda.*;

public class PlayerStateManager
{
	public Trainer trainer;
	public Horse horse;
	public Terrain terrain;
	public int week;

	private PlayerBaseState currentState;
	public PlayerPrologueState prologueState = new PlayerPrologueState();
	public PlayerTrainingInstructionState trainingInstructionState = new PlayerTrainingInstructionState();
	public PlayerWeeklyChoiceState weeklyChoiceState = new PlayerWeeklyChoiceState();
	public PlayerChooseTrainStatState chooseTrainStatState = new PlayerChooseTrainStatState();
	public PlayerChooseTrainStatSpeedState chooseTrainStatSpeedState = new PlayerChooseTrainStatSpeedState();
	public PlayerChooseTrainSkillState chooseTrainSkillState = new PlayerChooseTrainSkillState();
	public PlayerChooseCheckStatState chooseCheckStatState = new PlayerChooseCheckStatState();

	public PlayerRacingState racingState = new PlayerRacingState();
	public PlayerRacingChoiceState racingChoiceState = new PlayerRacingChoiceState();

	public PlayerWinState winState = new PlayerWinState();
	public PlayerLoseState loseState = new PlayerLoseState();

	public void play()
	{
		this.week = 1;
		currentState = prologueState;
		currentState.EnterState(this);
	}

	public void SwitchState(PlayerBaseState state)
	{
		currentState = state;
		currentState.EnterState(this);
	}
}