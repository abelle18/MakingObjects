public class Main 
{
    public static void main(String[] args) 
    {
        // Creates Car object tests methods
        Car Car = new Car(120, 45.5, 4);
        Car.start();
        Car.displayFuel();
        Car.honk();
        Car.getNumberOfDoors();
        Car.stop();
        System.out.println();

        // Creates Bicycle object tests methods
        Bicycle Bike = new Bicycle(25, 0.0, true);
        Bike.start();
        Bike.displayFuel();
        Bike.ringBell();
        Bike.getHasBell();
        Bike.stop();
    }
}
