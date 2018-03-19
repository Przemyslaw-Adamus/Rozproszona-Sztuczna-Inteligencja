import java.util.*;

public class GuardedParking implements Printf{
    List<ParkingSpace> listParkingSpaces;
    List<Client> listClient;
    Map<String, Double> pricePerHour;
    Map<String, Double> pricePerType;

    public GuardedParking() {
        this.listClient = new ArrayList();
        this.listParkingSpaces = new LinkedList();
        this.pricePerHour = new HashMap();
        this.pricePerType = new HashMap();
        pricePerHour.put("1h", 5.0);
        pricePerHour.put("2h", 3.5);
        pricePerHour.put("3h", 2.5);
        pricePerHour.put("next", 2.0);
        pricePerType.put("PersonalCar",1.0);
        pricePerType.put("Bus",3.5);
        pricePerType.put("Truck",4.0);
    }
    public GuardedParking(Map<String, Double> pricePerHour, Map<String, Double> pricePerType) {
        this.listClient = new LinkedList();
        this.listParkingSpaces = new LinkedList();
        this.pricePerHour = new HashMap();
        this.pricePerHour = pricePerHour;
        this.pricePerType = pricePerType;
    }
    @Override
    public void print() {
        System.out.println();
        System.out.println("     ****************************************");
        System.out.println("     *              MENU CLIENT             *");
        System.out.println("     ****************************************");
    }
}
