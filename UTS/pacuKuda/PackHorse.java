package pacuKuda;
import javax.swing.JOptionPane;

public class PackHorse extends Horse
{
	private Horse formerHorse;
	private int weight;
	private int bondWithTrainer;

	public PackHorse(Horse horse, int weight, int bondWithTrainer)
	{
		super(horse.getName(), horse.getSpeed(), horse.getStamina(), horse.getPower(), horse.getActiveSkill(), horse.getPassiveSkill());

		this.formerHorse = horse;
		this.weight = weight;
		this.bondWithTrainer = bondWithTrainer;
	}

	public void train(boolean runFast) {
        // validasi agar weight tidak aneh
        if (weight < 0) {
            weight = 0;
        }
        if (weight > 200) {
            weight = 200;
        }

        int speedIncrease;
        int staminaIncrease;
        int powerIncrease;

        double bondBonus = 1.0 + (bondWithTrainer / 100.0);

        if (runFast) {
            speedIncrease = (int) (((200.0 - weight) / 200.0) * 20 * bondBonus);
            powerIncrease = (int) ((weight / 200.0) * 15 * bondBonus);
            staminaIncrease = (int) ((weight / 200.0) * 5 * bondBonus);
        } else {
            speedIncrease = (int) (((200.0 - weight) / 200.0) * 5 * bondBonus);
            powerIncrease = (int) ((weight / 200.0) * 5 * bondBonus);
            staminaIncrease = (int) ((weight / 200.0) * 15 * bondBonus);
        }

        // update nilai stat kuda
        formerHorse.setSpeed(formerHorse.getSpeed() + speedIncrease);
        formerHorse.setStamina(formerHorse.getStamina() + staminaIncrease);
        formerHorse.setPower(formerHorse.getPower() + powerIncrease);

        // tampilkan hasil
        JOptionPane.showMessageDialog(null,
                "Training Results:\n"
                + "Speed increased by: " + speedIncrease + "\n"
                + "Stamina increased by: " + staminaIncrease + "\n"
                + "Power increased by: " + powerIncrease,
                "Training Complete",
                JOptionPane.PLAIN_MESSAGE);
    }


	public Horse getFormerHorse() {
		return formerHorse;
	}

	public void setFormerHorse(Horse formerHorse) {
		this.formerHorse = formerHorse;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getBondWithTrainer() {
		return bondWithTrainer;
	}

	public void setBondWithTrainer(int bondWithTrainer) {
		this.bondWithTrainer = bondWithTrainer;
	}
}
