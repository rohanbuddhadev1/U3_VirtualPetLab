// Part B

public class VirtualPetB {
    private String name;
    private int energyLevel;
    private int happinesslevel;
    private int weight;
    private int ageYears;
    private int ageMonths;
    public VirtualPetB(String name){
        this.name = name;
        weight = 5;
    }
    public String getName(){
        return name;
    }
    public void feed(Food f){
        weight += f.getWeightGain();
        energyLevel += f.getEnergyIncrease();
        happinesslevel = f.getHappinessIncrease();
        if (energyLevel > 10){
            energyLevel = 10;
        }
        if (happinesslevel > 10){
            happinesslevel = 10;
        }
    }
    public int getEnergyLevel(){
        return energyLevel;
    }
    public int getHappinessLevel(){
        return happinesslevel;
    }
    public boolean play(Game g){
        weight -= g.getWeightDcr();
        if (weight < 5){
            weight = 5 ;
        }
        if (g.isWinner()){
            happinesslevel ++;
            if (happinesslevel > 10){
                happinesslevel = 10;
            }
            return true;
        }
        else{
            happinesslevel --;
            if (happinesslevel < 0){
                happinesslevel = 0;
            }
            return false;
        }
    }
    public void updateStatus(){
        if (happinesslevel > 0){
            happinesslevel --;
        }
        if (energyLevel > 0){
            energyLevel --;
        }
        ageMonths ++;
        if (ageMonths > 12){
            ageYears ++;
            ageMonths -= 12;
        }

    }
    public String toString(){
        String output = name + "'s information: \n Energy: " + energyLevel + " \n Happiness: " + happinesslevel + " \n Weight: " + weight ;
        output += " \n Age: " + ageMonths + " months and " + ageYears + " years ";
        return output;
    }
}