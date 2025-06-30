public class Vehicle 
{
    protected int speed;        
    private double fuel;        

    //constructor
    public Vehicle(int speed, double fuel) 
    {
        this.speed = speed;
        this.fuel = fuel;
    }

    public void start() 
    {
        System.out.println("The vehicle has turned on.");
    }

    public void stop() 
    {
        System.out.println("The vehicle has stopped.");
    }

    public final void displayFuel() 
    {
        System.out.println("Fuel lvl: " + fuel + " liters");
    }

    // add ons
    public int getSpeed() 
    {
        return speed;
    }

    public void setSpeed(int speed) 
    {
        this.speed = speed;
    }

    public double getFuel() 
    {
        return fuel;
    }

    public void setFuel(double fuel) 
    {
        this.fuel = fuel;
    }
}