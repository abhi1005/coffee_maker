public class CoffeeMaker
{
    private int cupsWater;
    private int scoopsCoffee;
    private int cupsCoffee;

    private boolean isOn;

    public void setCupsCoffee(int cupsCoffee) {
        this.cupsCoffee = cupsCoffee;
    }

    public int getCupsWater() {
        return cupsWater;
    }

    public int getScoopsCoffee() {
        return scoopsCoffee;
    }

    public int getCupsCoffee() {
        return cupsCoffee;
    }

    public boolean isOn() {
        return isOn;
    }

    public CoffeeMaker() { }

    public void addCoffee(int amount){
        this.scoopsCoffee += amount;
    }

    public void addWater(int amount){
        this.cupsWater += amount;
    }

    public void turnOn(){
        this.isOn = true;
    }

    public void brewCoffee(){
        this.cupsCoffee = this.cupsWater;
        this.cupsWater = 0;
        this.isOn = false;
    }

    public void pour(int numCups){
        if(this.cupsCoffee > 0){
            if(numCups > this.cupsCoffee){
                System.err.println("not enough coffee");
            }
            this.cupsCoffee -= numCups;
        }
    }
}
