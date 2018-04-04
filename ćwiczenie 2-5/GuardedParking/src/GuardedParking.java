

import Interface.Printf;
import java.util.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class GuardedParking implements Printf {
    List<ParkingSpace> listParkingSpaces;
    List<Client> listClient;
    Map<String, Double> pricePerHour;
    Map<String, Double> pricePerType;

    public GuardedParking()throws FileNotFoundException {
        this.listClient = new ArrayList();
        this.listParkingSpaces = new LinkedList();
        this.pricePerHour = new HashMap();
        this.pricePerType = new HashMap();
//        pricePerHour.put("1h", 5.0);
//        pricePerHour.put("2h", 3.5);
//        pricePerHour.put("3h", 2.5);
//        pricePerHour.put("next", 2.0);
        pricePerType.put("PersonalCar",1.0);
        pricePerType.put("Bus",3.5);
        pricePerType.put("Truck",4.0);

        Scanner load = new Scanner(new File("MapLoad.txt"));
        String  rekord1;//=load.nextLine();
        double rekordDouble;
        while (load.hasNext()){
            rekord1=load.nextLine();
            rekordDouble=Double.parseDouble(load.nextLine());
            pricePerHour.put(rekord1, rekordDouble);
        }
        System.out.println("The map has been loaded");
        System.out.println("1h-"+pricePerHour.get("1h"));
        System.out.println("2h-"+pricePerHour.get("2h"));
        System.out.println("3h-"+pricePerHour.get("3h"));
        System.out.println("next-"+pricePerHour.get("next"));

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
        System.out.println("     *              PARKING                 *");
        System.out.println("     ****************************************");
    }
}
