import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner scanner;
    private GuardedParking guardedParking;

    public Menu() {
        scanner = new Scanner(System.in);
        guardedParking = new GuardedParking();
    }

    public void show() {
        while (true) {
            int choice = -1;
            Scanner s = new Scanner(System.in);
            System.out.println();
            System.out.println("     ****************************************");
            System.out.println("     *                 MENU                 *");
            System.out.println("     ****************************************");
            System.out.println("     1. MENAGE CLIENT");
            System.out.println("     2. MENAGE PARKING");
            System.out.println("     3. SHOW LIST CARS");
            System.out.println("     0. EXIT");
            System.out.print("     Choose one of options > ");
            try {
                choice = s.nextInt();
            } catch (InputMismatchException err) {
                System.out.println("It's not a number! Press ENTER to continue.");
                try {
                    System.in.read();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (!makeChoice(choice))
                break;
        }
    }

    public boolean makeChoice(int choice) {
        try {
            switch (choice) {
                case 1:
                    while (true) {
                        int choiceMenageClient = -1;
                        Scanner s2 = new Scanner(System.in);
                        System.out.println();
                        System.out.println("     ****************************************");
                        System.out.println("     *              MENU CLIENT             *");
                        System.out.println("     ****************************************");
                        System.out.println("     1. ADD NEW CLIENT");
                        System.out.println("     2. DELETE CLIENT");
                        System.out.println("     3. SHOW LIST CLIENTS");
                        System.out.println("     4. ADD CLIENT's CARS");
                        System.out.println("     5. DELETE CLIENT's CARS");
                        System.out.println("     6. SHOW CLIENT's CARS");
                        System.out.println("     0. BACK");
                        System.out.print("     Choose one of options > ");
                        try {
                            choiceMenageClient = s2.nextInt();
                        } catch (InputMismatchException err) {
                            System.out.println("It's not a number! Press ENTER to continue.");
                            try {
                                System.in.read();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        if (!makeChoiceMenageClient(choiceMenageClient))
                            break;
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("     ****************************************");
                    System.out.println("     *              MENU PARKING             *");
                    System.out.println("     ****************************************");
                    guardedParking.print();
                    break;
                case 3:
                    showListCars();
                    break;
                case 0:
                    return false;
                default:
                    return true;
            }
            return true;
        } catch (InputMismatchException e) {
            System.out.println("You have to put a number!");
            return false;
        }
    }

    public boolean makeChoiceMenageClient(int choice) {
        Scanner scaner = new Scanner(System.in);
        int clientIndex=0;
        int carIndex=0;
        try {
            switch (choice) {
                case 1:
                    Client client = new Client(-1);
                    guardedParking.listClient.add(client);
                    client.id = guardedParking.listClient.lastIndexOf(client);
                    System.out.println(client.id);
                    guardedParking.listClient.set(client.id,client);
                    break;
                case 2:
                    System.out.print("Give the index of the object to be deleted >");
                    clientIndex = scaner.nextInt();
                    if(clientIndex>=0 && clientIndex<guardedParking.listClient.size()){
                        guardedParking.listClient.remove(clientIndex);
                        System.out.println("You deleted the client with the index "+clientIndex);
                    }
                    else System.out.println("You gave the wrong index");
                    break;
                case 3:
                    for(int i=0;i<guardedParking.listClient.size();i++)
                    {
                        guardedParking.listClient.get(i).print();
                    }
                    break;
                case 4:
                    System.out.print("Give the index of the client >");
                    clientIndex = scaner.nextInt();
                    if(clientIndex>=0 && clientIndex<guardedParking.listClient.size()) {
                        Car car=new PersonalCar(-1,clientIndex);
                        guardedParking.listClient.get(clientIndex).listCars.add(car);
                        car.id = guardedParking.listClient.get(clientIndex).listCars.lastIndexOf(car);
                        guardedParking.listClient.get(clientIndex).listCars.set(car.id,car);
                        System.out.println("You add new car for client "+clientIndex);
                    }
                    else{
                        System.out.println("You give the wrong index");
                    }

                    break;
                case 5:
                    System.out.println("Give the index of the client");
                    clientIndex = scaner.nextInt();
                    System.out.print("Give the index of the object to be deleted >");
                    carIndex = scaner.nextInt();
                    if(carIndex>=0 && carIndex<guardedParking.listClient.get(clientIndex).listCars.size()){
                        guardedParking.listClient.get(clientIndex).listCars.remove(carIndex);
                        System.out.println("You deleted the client with the index "+carIndex);
                    }
                    else System.out.println("You gave the wrong index");
                    break;
                case 6:
                    System.out.print("Give the index of the object to be showed >");
                    int indexxx = scaner.nextInt();
                    for(int i=0;i<guardedParking.listClient.get(indexxx).listCars.size();i++) {
                        guardedParking.listClient.get(indexxx).listCars.get(i).print();
                    }
                    break;
                case 0:
                    return false;
                default:
                    return true;
            }
            return true;
        } catch (InputMismatchException e) {
            System.out.println("You have to put a number!");
            return false;
        }
    }

    private void showListCars() {
        for (int i = 0; i < guardedParking.listClient.size(); i++) {
            guardedParking.listClient.get(i).print();
        }
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public GuardedParking getGuardedParking() {
        return guardedParking;
    }

    public void setGuardedParking(GuardedParking guardedParking) {
        this.guardedParking = guardedParking;
    }
}
