package Step7;

public class light_bulb {

    boolean state = false;

    void turnOn() {
        this.state = true;
    }
    void turnOff() {
        this.state = false;
    }
    boolean stateCheck() {
        return state;
    }
}


