public class Car extends Vehicle 
{
    private int numberOfDoors;

    //constructor
    public Car(int speed, double fuel, int numberOfDoors) 
    {
        super(speed, fuel);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void start() 
    {
        super.start();
    }

    // honks car
    public void honk() 
    {
        System.out.println("BEEEEEEEEEEEEEEEEEEEEEEEEEEEP!");
    }

    //retruns door num.
    public int getNumberOfDoors() 
    {
        System.out.println("Number of Doors: " + numberOfDoors);
        return numberOfDoors;
    }

    // sets door num.
    public void setNumberOfDoors(int numberOfDoors) 
    {
        this.numberOfDoors = numberOfDoors;
    }
}
