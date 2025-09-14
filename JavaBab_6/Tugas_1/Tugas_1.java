class Tugas_1
{
	public static void main(String args[])
	{
		Horse oguri = new Horse("Oguri Cap", 60, 50, 70, 40, "Run Oguri, I'll treat you anything you want.");
		Horse daiwa = new Horse("Daiwa Scarlet", 30, 40, 100, 100, "Get Faster! Get Bigger! Get Stronger! Get the win, Daiwa!");
		Horse goldshi = new Horse("Gold Ship", 80, 80, 40, 60, "Please dont kick me, Gold Ship. I beg.");

		Horse[] horses = {oguri, daiwa, goldshi};


		Trainer aiz = new Trainer("Aiz", oguri, 15);
		Trainer dechiviel = new Trainer("Dechiviel", daiwa, 25);
		Trainer faris = new Trainer("Faris", goldshi, 15);

		Trainer[] trainers = {aiz, dechiviel, faris};

		Field lapmer = new Field(20, 2000);
		
		System.out.println("HORSE LIST");
		for(Trainer trainer : trainers)
		{
			trainer.printInfo();
		}

		System.out.println("Here we are on the field race with " + lapmer.numberOfSpectators + " people!");
		System.out.println("All the horses already in position. Ready... Set... Go!");
		System.out.println("The horses came out of the gates, their steps shocked the land!\n");

		for(int i = 0; i < lapmer.lap; i++)
		{
			System.out.println("Lap: " + (i+1));

			for(Trainer trainer : trainers)
			{
				if(trainer.motivating())
				{
					System.out.println("Trainer " + trainer.name + " said \"" + trainer.horse.favoriteWord + "\" Seems like it touched " + trainer.horse.name + "'s heart.");
					lapmer.increaseSpectators(200);
				}
				trainer.horse.totalScore += trainer.horse.run();
			}
			for (int j = 0; j < trainers.length - 1; j++) {
				for (int k = 0; k < trainers.length - 1 - j; k++) {
                			if (trainers[j].horse.totalScore < trainers[j + 1].horse.totalScore) {
						Trainer temp = trainers[j];
                			    	trainers[j] = trainers[j + 1];
                    				trainers[j + 1] = temp;
                			}
            			}
       			}

        		for (int j = 0; j < trainers.length; j++) {
            			System.out.println("#" + (j+1) + " " + trainers[j].horse.name);
        		}
			System.out.println("");
		}

		System.out.println(trainers[0].horse.name + " is the winner of this race, omedetou!>_<");
		
	}
}