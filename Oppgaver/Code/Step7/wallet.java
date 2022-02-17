package Step7;

public class wallet {

    double amountOfCash;
    int amountOfCreditCards;
    String size;
    String color;
    double weight;
    boolean hasID;

    private int coins = 0;

    private boolean zipper = false;

    public void zipperOpen () {
        zipper = true;
    }

    public void zipperClosed (){
        zipper = false;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        if (zipper) {
            this.coins = coins;
        }
    }

    public void printCoins() {
        System.out.println("You have " + this.coins + " coins.");
    }

}
