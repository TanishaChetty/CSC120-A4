public class Engine implements EngineRequirements {

    //Attributes
    private FuelType f;
    private double currentFuelLevel;
    private double maxFuelLevel;


    /**
     * Constructuor for Engine
     * @param f Engine's fuel type
     * @param currentFuelLevel Engine's current fuel level
     * @param maxFuelLevel Engine's max fuel level
     */
    public Engine(FuelType f, double currentFuelLevel, double maxFuelLevel){
        this.f = f;
        this.currentFuelLevel = currentFuelLevel;
        this.maxFuelLevel = maxFuelLevel;

    }

    /**
     * Accessor for fuel type
     * @return fuel type of engine
     */
    public FuelType getFuelType() {
        return this.f;
    }

    /**
     * Accessor for max amount of fuel
     * @return max fuel for engine
     */
    public double getMaxFuel(){
        return this.maxFuelLevel;
    }

    /**
     * Accessor for current fuel level
     * @return current fuel level of engine
     */
    public double getCurrentFuel(){
        return this.currentFuelLevel;
    }

    /**
     * Refuels the engine to the max level
     */
    public void refuel(){
        this.currentFuelLevel = this.maxFuelLevel;

    }

    /**
     * Testing if the train has enough fuel to go
     * @return true if the engine has enough fuel to go, false otherwise
     */
    public Boolean go(){
        if (this.currentFuelLevel >= 5){
            this.currentFuelLevel = this.currentFuelLevel - 5;
            System.out.println("Current Fuel Level: " + this.currentFuelLevel);
            if (this.currentFuelLevel > 0){
                return true;
            } else{
                return false;
            }
        } else{
            return false;
        }
    }

    /**
     * Summary statement of engine
     * @return type of fuel, current fuel level, and max fuel level in a string format
     */
    public String toString(){
        return ("Engine has fuel type " + this.f + ", current fuel level " + this.currentFuelLevel + ", and max fuel level: " + this.maxFuelLevel);
    }

    public static void main(String[] args){
        Engine myEngine = new Engine(FuelType.ELECTRIC, 0., 100.);
        System.out.println(myEngine);
        myEngine.refuel();
        System.out.println(myEngine);
        //while (myEngine.go()) {
        //    System.out.println("Choo choo!");
        //}
        //System.out.println("Out of fuel.");

        //Engine myOtherEngine = new Engine(FuelType.STEAM, 50., 100.);
        //System.out.println(myOtherEngine);
    }


}