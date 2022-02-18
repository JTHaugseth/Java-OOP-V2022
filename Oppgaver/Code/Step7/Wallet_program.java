package Step7;

import java.util.Scanner;

public class Wallet_program {

    Wallet wallet = new Wallet(100);
    Scanner input = new Scanner(System.in);
    
    void openWallet() {
        if (wallet.stateCheck()) {
            System.out.println("Lommeboken er åpen");
        } else {
            System.out.println("Lommeboken er lukket\n");
            System.out.println("1: Opne lommeboken!");
            System.out.println("2: Avslutt!");

            boolean repeater = true;

            while (repeater) {
            int inputValue = input.nextInt();

                switch (inputValue) {
                    case 1:
                        System.out.println("Du åpnet lommeboken: \n");
                        wallet.walletOpen();
                        wallet();
                        repeater = false;

                        break;
                    case 2:
                        System.out.println("Program avsluttes");
                        wallet.walletClose();
                        repeater = false;
                        break;
                    default:
                        System.out.println("Du må taste inn 1 eller 2");
                }
            }
        }
    }
    void wallet() {
        System.out.println("1 - Sjekk hvor mye penger du har");
        System.out.println("2 - Legg til penger");
        System.out.println("3 - Ta ut penger");

        boolean repeater = true;

        while (repeater) {

            int inputValue = input.nextInt();
                switch (inputValue) {
                    case 1:
                        System.out.println("Du har: " + wallet.getCoins() + " kroner");
                        break;
                    case 2:
                        try{
                            System.out.println("Hvor mye penger vil du legge til?");
                            int addCoins = input.nextInt();
                            wallet.setCoins(wallet.getCoins() + addCoins);
                            System.out.println("Du legger til "+ addCoins + " kroner og har nå "+ wallet.getCoins()+ " kroner i lommeboken.");
                        }catch (Exception e) {
                            System.out.println("you can only write numbers bro!");
                        }
                        break;
                    case 3:
                    default:
                        System.out.println("Du kan kun trykke 1,2 eller 3");
            }
        }
    }
}
