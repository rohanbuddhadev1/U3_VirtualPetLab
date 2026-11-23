// Part B

public class Game {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHappinessIncr() {
        return happinessIncr;
    }

    public void setHappinessIncr(int happinessIncr) {
        this.happinessIncr = happinessIncr;
    }

    public int getWeightDcr() {
        return weightDcr;
    }

    public void setWeightDcr(int weightDcr) {
        this.weightDcr = weightDcr;
    }

    private int happinessIncr;
    private int weightDcr;
    public Game(String name, int happinessIncr, int weightDcr){
        this.name = name;
        this.happinessIncr = happinessIncr;
        this.weightDcr = weightDcr;
    }
    public boolean isWinner(){
       int num =(int) (Math.random() * 2) + 1;
       if (num > 1){
           return true;
       }
        return false;
    }
}
