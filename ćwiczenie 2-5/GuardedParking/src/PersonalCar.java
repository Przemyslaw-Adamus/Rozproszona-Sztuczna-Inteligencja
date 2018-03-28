import Interface.Printf;

public class PersonalCar extends Car implements Printf {
    @Override
    public void park() {

    }
    @Override
    public void driveOut() {

    }

    public PersonalCar(int id, int owner) {
        this.owner=owner;
        this.id=id;
    }

    @Override
    public void print() {

        super.print();
    }
}
