package Exam2021;

public abstract class Equipment {

    private String equipment;
    private int id;
    private Locker locker;
    private boolean needsReplacement;


    public Equipment(String equipment, int id, Locker locker, boolean needsReplacement) {
        this.equipment = equipment;
        this.id = id;
        this.locker = locker;
        this.needsReplacement = needsReplacement;
    }

    public String getEquipment() {return equipment;}

    public void setType(String type) {this.equipment = type;}

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public Locker getLocker() {return locker;}

    public void setLocker(Locker locker) {this.locker = locker;}

    public boolean isNeedsReplacement() {return needsReplacement;}

    public void setNeedsReplacement(boolean needsReplacement) {this.needsReplacement = needsReplacement;}



    public abstract String toString();

}
