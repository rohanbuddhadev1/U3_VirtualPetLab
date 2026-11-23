// Part B

public class Food {
    private String name;

    public int getEnergyIncrease() {
        return energyIncrease;
    }

    public void setEnergyIncrease(int energyIncrease) {
        this.energyIncrease = energyIncrease;
    }

    public int getHappinessIncrease() {
        return happinessIncrease;
    }

    public void setHappinessIncrease(int happinessIncrease) {
        this.happinessIncrease = happinessIncrease;
    }

    public int getWeightGain() {
        return weightGain;
    }

    public void setWeightGain(int weightGain) {
        this.weightGain = weightGain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int energyIncrease;
    private int weightGain;
    private int happinessIncrease;
    public Food(String name, int energyIncrease, int happinessIncrease, int weightGain){
        this.name = name;
        this.energyIncrease = energyIncrease;
        this.happinessIncrease = happinessIncrease;
        this.weightGain = weightGain;
    }

}
