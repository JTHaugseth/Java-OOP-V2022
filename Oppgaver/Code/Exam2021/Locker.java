package Exam2021;

public class Locker {

    private String lockerName;

    public Locker(String lockerName) {
        this.lockerName = lockerName;
    }

    public String getLockerNumber() {return lockerName;}

    public void setLockerNumber(String lockerNumber) {this.lockerName = lockerNumber;}

    public String toString() {
        return getLockerNumber();
    }
}
