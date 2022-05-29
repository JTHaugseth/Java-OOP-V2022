package Exam2021;

public class Basketball extends Equipment {

    private boolean airPressure;
    private Type type;

    public Basketball(String equipment, int id, Locker locker, boolean needsReplacement, Type type, boolean airPressure) {
        super(equipment, id, locker, needsReplacement);
        this.type = type;
        this.airPressure = airPressure;
    }

    public boolean isAirPressure() {return airPressure;}

    public void setAirPressure(boolean airPressure) {this.airPressure = airPressure;}

    public Type getType() {return type;}

    public void setType(Type type) {this.type = type;}

    @Override
    public String toString() {
        return  "A " + getType() + " of type " + getEquipment() + " with ID = " + getId() +
                ", stored in " + getLocker() +
                ", needs to get replaced?: " + isNeedsReplacement() +
                ", needs air pressure?: " + isAirPressure();
    }
}
