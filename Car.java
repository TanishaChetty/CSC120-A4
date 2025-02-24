import java.util.ArrayList;
import java.util.Scanner;

public class Car implements CarRequirements {

    //Attributes
    ArrayList <Passenger> passengersOnboard;
    private int maxCapacity;
    //private int availSeats;

    /**
     * Constructor for Car
     * @param maxCapacity Car's maximum capacity
     * @param passengersOnboard list of passengers onboard
     */
    public Car(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.passengersOnboard = new ArrayList<>();

    }

    public int getCapacity(){
        return this.maxCapacity;
    }

    public int seatsRemaining(){
        return this.maxCapacity - this.passengersOnboard.size();
    }

    public boolean addPassenger(){
        if (this.maxCapacity > this.passengersOnboard.size()){
       //     passengersOnboard.addAll(name);

        }
        return true;
    }

    public boolean removePassenger(){
        if (passengersOnboard.contains(Passenger)){
            return false;
        } else{
            return true;
        }
    }

    public String toString(){
        return 
    }

    public static void main(String[] args){
        Car myCar = new Car()
    }


    




}