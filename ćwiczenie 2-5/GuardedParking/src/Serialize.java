import java.io.*;
public class Serialize implements Serializable {
    public Serialize(){};
    public void serialize(Client k){

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("object2.ser"))) {
            outputStream.writeObject(k);
            outputStream.close();
        }
        catch (Exception e) {
            //e.printStackTrace();
        }
        System.out.println("Serialize!");
        try  {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("object2.ser"));
            Client client= (Client)inputStream.readObject();
            //inputStream.close();
            client.print();
        } catch (Exception e) {
           // e.printStackTrace();
        }
        System.out.println("Deserialize!");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("objects.ser"))) {
            outputStream.writeObject(Integer.valueOf(1));
            outputStream.writeObject(Integer.valueOf(2));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("objects.ser"))) {
//            Integer number = (Integer) inputStream.readObject();
//            System.out.println(number);
//            number = (Integer) inputStream.readObject();
//            System.out.println(number);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("object-graph.bin"))) {
//            outputStream.writeObject(k);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Car deserializedCar = null;
//        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("object-graph.bin"))) {
//            deserializedCar = (Car) inputStream.readObject();
//            deserializedCar.print();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
