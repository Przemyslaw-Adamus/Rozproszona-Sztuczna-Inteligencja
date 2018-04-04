import java.io.*;
public class Serialize implements Serializable {
    public Serialize(){};
    public void serialize(Client k) throws NotSerializableException{

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("object.ser"))) {
            outputStream.writeObject(k);
            outputStream.close();
            System.out.println("Pomyslna serializacja danych");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        try  {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("object.ser"));
            Client client= (Client)inputStream.readObject();
            inputStream.close();
            System.out.println("Pomyslna deserializacja danych");
            System.out.println(client);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
