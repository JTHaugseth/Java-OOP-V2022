package Step7;

public class Wallet {

    private boolean walletState = false;
    int coins = 0;

    void walletOpen() {
        this.walletState = true;
    }
    void walletClose() {
        this.walletState = false;
    }
    boolean stateCheck() {
        return walletState;
    }

    public Wallet(int coins) {
        this.coins = coins;
    }
    public int getCoins() {
        return coins;
    }
    public void setCoins(int coins) {
        if (walletState){
          this.coins = coins;
        }

    }
}
