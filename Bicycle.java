public class Bicycle extends Vehicle 
{
    private boolean hasBell;

    //constructor
    public Bicycle(int speed, double fuel, boolean hasBell) 
    {
        super(speed, fuel);
        this.hasBell = hasBell;
    }

    @Override
    public void start() 
    {
        System.out.println("Start pedaling.");
    }

    // checks for bell
    public void ringBell() 
    {
        if (hasBell) {
            System.out.println("Ding Ding!");
        } else {
            System.out.println("Too poor for bell.");
        }
    }

    // Add ons
    public boolean getHasBell() 
    {
        System.out.println("Has Bell: " + hasBell);
        return hasBell;
    }

    public void setHasBell(boolean hasBell) 
    {
        this.hasBell = hasBell;
    }
}
