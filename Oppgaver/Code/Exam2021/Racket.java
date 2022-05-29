package Exam2021;

public class Racket extends Equipment{

    private boolean needsNewPad;

    public Racket(String equipment, int id, Locker locker, boolean needsReplacement, boolean needsNewPad) {
        super(equipment, id, locker, needsReplacement);
        this.needsNewPad = needsNewPad;
    }

    public boolean isNeedsNewPad() {return needsNewPad;}

    public void setNeedsNewPad(boolean needsNewPad) {this.needsNewPad = needsNewPad;}

    @Override
    public String toString() {
        return "A " + getEquipment() + " with ID = " + getId() +
                ", stored in " + getLocker() +
                ", needs to get replaced?: " + isNeedsReplacement() +
                ", needs new pad?: " + isNeedsNewPad();
    }
}
