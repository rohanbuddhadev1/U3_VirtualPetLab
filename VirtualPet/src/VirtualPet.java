// Part A

public class VirtualPet {
    private String name;
    private int energyLevel;
    private int happinesslevel;
    private int weight;
    private int ageYears;
    private int ageMonths;
    public VirtualPet(String name){
        this.name = name;
        weight = 5;
    }
    public String getName(){
        return name;
    }
    public void feed(){
        if (energyLevel < 10){
            energyLevel ++;
        }
        weight ++;
    }
    public int getEnergyLevel(){
        return energyLevel;
    }
    public int getHappinessLevel(){
        return happinesslevel;
    }
    public void play(){
        if (happinesslevel < 10){
            happinesslevel ++;
        }
        if (weight > 5){
            weight --;
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
