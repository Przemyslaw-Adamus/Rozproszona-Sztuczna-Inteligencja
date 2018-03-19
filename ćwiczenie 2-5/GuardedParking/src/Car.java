public abstract class Car implements Printf {
    int id;
    int owner;
    ParkingSpace parkingSpace;
    public abstract void park();
    public abstract void driveOut();
    @Override
    public void print() {
        System.out.println("Car ID: "+id);
    }
}