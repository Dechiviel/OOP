package pacuKuda;
import java.util.ArrayList;

public class Terrain
{
	private String name;
	private int distance;
	private ArrayList<Trainer> trainers;

	public Terrain(String name, int distance)
	{
		this.name = name;
		this.distance = distance;
		this.trainers = new ArrayList<>();
	}

	public void addTrainer(Trainer trainer)
	{
		if (trainer != null)
		{
			trainers.add(trainer);
 
		}
		else
		{
			System.out.println("Trainer tidak valid!");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public ArrayList<Trainer> getTrainers() {
		return trainers;
	}

	public void setTrainers(ArrayList<Trainer> trainers) {
		this.trainers = trainers;
	}
}
