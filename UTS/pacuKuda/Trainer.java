package pacuKuda;
import javax.swing.JOptionPane;

public class Trainer
{
	private String name;
	private Horse horse;
	private int bond;
	private PackHorse trainedHorse;

	public Trainer(String name, Horse horse)
	{
		this(name, horse, 0);
	}

	public Trainer(String name, Horse horse, int bond)
	{
		this.name = name;
		this.horse = horse;
		this.bond = bond;
	}

	public boolean trainPassiveSkill()
	{
    		if(this.horse.getPassiveSkill() != null)
    		{
        		int oldEffectiveness = this.horse.getPassiveSkill().getEffectiveness();

        		if(oldEffectiveness < 100)
        		{
            			int increase = (int)((bond / 100.0) * 40);
            			this.horse.getPassiveSkill().addEffectiveness(increase);

            			int newEffectiveness = this.horse.getPassiveSkill().getEffectiveness();
            			JOptionPane.showMessageDialog(null,
                			"Passive Skill Training Complete!\n" +
                			"Skill: " + this.horse.getPassiveSkill().getName() + "\n" +
                			"Effectiveness increased from " + oldEffectiveness + "% to " + newEffectiveness + "%",
                			"Training Result",
                			JOptionPane.PLAIN_MESSAGE);

            			return true;
        		}
        		else
        		{
            			JOptionPane.showMessageDialog(null,
                			"Passive Skill is already at maximum effectiveness!",
                			"Training Result",
                			JOptionPane.PLAIN_MESSAGE);
            			return false;
        		}
    		}
    		else
    		{
        		JOptionPane.showMessageDialog(null,
            			"No passive skill assigned to this horse.",
            			"Training Result",
            			JOptionPane.PLAIN_MESSAGE);
        		return false;
    		}
	}

	public boolean trainActiveSkill()
	{
    		if(this.horse.getActiveSkill() != null)
    		{
        		int oldEffectiveness = this.horse.getActiveSkill().getEffectiveness();

        		if(oldEffectiveness < 100)
        		{
            			int increase = (int)((bond / 100.0) * 40);
            			this.horse.getActiveSkill().addEffectiveness(increase);

            			int newEffectiveness = this.horse.getActiveSkill().getEffectiveness();
            			JOptionPane.showMessageDialog(null,
                			"Active Skill Training Complete!\n" +
                			"Skill: " + this.horse.getActiveSkill().getName() + "\n" +
                			"Effectiveness increased from " + oldEffectiveness + "% to " + newEffectiveness + "%",
                			"Training Result",
                			JOptionPane.PLAIN_MESSAGE);

            			return true;
        		}
        		else
        		{
            			JOptionPane.showMessageDialog(null,
                			"Active Skill is already at maximum effectiveness!",
                			"Training Result",
                			JOptionPane.PLAIN_MESSAGE);
            			return false;
        		}
    		}
    		else
    		{
        		JOptionPane.showMessageDialog(null,
            			"No active skill assigned to this horse.",
            			"Training Result",
            			JOptionPane.PLAIN_MESSAGE);
        		return false;
    		}
	}


	public boolean trainStats(int weight)
	{
		this.trainedHorse = new PackHorse(this.horse, weight, this.bond);
		return true;
	}

	public boolean increaseBond() 
	{
        	if (this.bond < 100) 
		{
        	    	int increase = (this.bond + 20 <= 100) ? 20 : (100 - this.bond); // how much it increases
            		this.bond += increase;

            		JOptionPane.showMessageDialog(null, 
                		"Bond increased by " + increase + "!\nCurrent bond value: " + this.bond,
                		"Info", JOptionPane.INFORMATION_MESSAGE);

            		return true;
        	} 
		else 
		{
            		JOptionPane.showMessageDialog(null, 
                		"Bond is already at maximum!\nCurrent bond value: " + this.bond,
                		"Info", JOptionPane.WARNING_MESSAGE);
            		return false;
        	}
    	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Horse getHorse() {
		return horse;
	}

	public void setHorse(Horse horse) {
		this.horse = horse;
	}

	public int getBond() {
		return bond;
	}

	public void setBond(int bond) {
		this.bond = bond;
	}

	public PackHorse getTrainedHorse() {
		return trainedHorse;
	}

	public void setTrainedHorse(PackHorse trainedHorse) {
		this.trainedHorse = trainedHorse;
	}

}