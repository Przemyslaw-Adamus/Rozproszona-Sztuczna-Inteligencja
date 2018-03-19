public class ParkingSpace {
    char lane;
    int number;
    int type;
    boolean isBusy;
    boolean isDisabled;

    public ParkingSpace(char lane, int number, int type, boolean isBusy, boolean isDisabled) {
        this.lane = lane;
        this.number = number;
        this.type = type;
        if (isBusy) this.isBusy = true;
        else this.isBusy = false;
        if (isDisabled) this.isDisabled = true;
        else this.isDisabled = false;
    }
    public ParkingSpace() {
        this.lane = ' ';
        this.number = 99;
        this.type = 99;
        this.isBusy = false;
        this.isDisabled = false;
    }
    public boolean isBusy() {
        return isBusy;
    }
}
