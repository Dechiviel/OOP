package pacuKuda;

public class Horse {

    private String name;
    private int speed;
    private int stamina;
    private int power;

    private ActiveSkill activeSkill;
    private PassiveSkill passiveSkill;

    private int kmh; // kilometer/h
    private int distanceTraveled;
    private int staminaOnRace;

    public Horse(String name, ActiveSkill activeSkill, PassiveSkill passiveSkill) {
        this(name, 10, 10, 10, activeSkill, passiveSkill);
    }

    public Horse(String name, int speed, int stamina, int power, ActiveSkill activeSkill, PassiveSkill passiveSkill) {
        this.name = name;
        this.speed = speed;
        this.stamina = stamina;
        this.power = power;
        this.activeSkill = activeSkill;
        this.passiveSkill = passiveSkill;
        this.kmh = 0;
        this.distanceTraveled = 0;
    }

    public boolean increaseSpeed() {
        double maxSpeed = (this.speed / 100.0) * 40 + 30; // max 70 km/h saat speed = 100

        if (this.kmh < maxSpeed) {
            int kmhIncrease = (int) ((this.power / 100.0) * 35);

            if (this.kmh + kmhIncrease > maxSpeed) {
                kmhIncrease = (int) (maxSpeed - this.kmh);
            }

            int staminaNeeded = (int) ((((this.kmh + kmhIncrease / 2.0) / 70.0) * 8));

            if (staminaNeeded < this.staminaOnRace) {
                this.distanceTraveled += (int) (((this.kmh + kmhIncrease / 2.0) * 10) / 3.6);
                this.staminaOnRace -= staminaNeeded;
                this.kmh += kmhIncrease;
                return true;
            } else {
                this.kmh = 0;
                this.staminaOnRace = 0;
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean maintainSpeed() 
	{
    	int staminaNeeded = (int) ((kmh / 70.0) * 8);

    	if (staminaNeeded < this.stamina) {
    	    distanceTraveled += kmh * 10.0 / 3.6;
    	    staminaOnRace -= staminaNeeded;
    	    return true;
    	} else {
    	    distanceTraveled += (kmh * 10.0 / 3.6) * ((double) this.stamina / staminaNeeded);
    	    staminaOnRace = 0;
    	    kmh = 0;
    	    return false;
    	}
	}

    public boolean decreaseSpeed() 
	{
		if (kmh > 0) {
			int kmhDecrease = (int) ((power / 100.0) * 20);
			if (kmh - kmhDecrease < 0) {
				kmhDecrease = kmh;
			}

			int staminaNeeded = (int) (((kmh - (kmhDecrease / 2.0)) / 70.0) * 8);

			if (staminaNeeded < this.stamina) {
				distanceTraveled += ((kmh - (kmhDecrease / 2.0)) * 10.0 / 3.6);
				staminaOnRace -= staminaNeeded;
				kmh -= kmhDecrease;
				return true;
			} else {
				distanceTraveled += ((kmh - (kmhDecrease / 2.0)) * 10.0 / 3.6) * ((double) this.stamina / staminaNeeded);
				staminaOnRace = 0;
				kmh = 0;
				return false;
			}
		} else {
			return false;
		}
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getKmh() {
        return kmh;
    }

    public void setKmh(int kmh) {
        this.kmh = kmh;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public int getStaminaOnRace() {
        return staminaOnRace;
    }

    public void setStaminaOnRace(int staminaOnRace) {
        this.staminaOnRace = staminaOnRace;
    }

    public ActiveSkill getActiveSkill() {
        return activeSkill;
    }

    public void setActiveSkill(ActiveSkill activeSkill) {
        this.activeSkill = activeSkill;
    }

    public PassiveSkill getPassiveSkill() {
        return passiveSkill;
    }

    public void setPassiveSkill(PassiveSkill passiveSkill) {
        this.passiveSkill = passiveSkill;
    }
}
