import Interface.Printf;
import java.util.LinkedList;
import java.util.List;

public class Client implements Printf {
    int id;
    List<Car> listCars;

    public Client(int id) {
        this.id = id;
        this.listCars = new LinkedList();
    }

    @Override
    public void print() {
        System.out.println("________________");
        System.out.println("Client ID: "+id);
        for(int i=0;i<listCars.size();i++)
        {
           listCars.get(i).print();
        }
    }
}
