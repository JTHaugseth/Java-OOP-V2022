package Static_Keyword;

public class Friend {

    String name;
    static int numberOfFriends;

    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }
    static void displayFriend() {
        System.out.println("You have " + numberOfFriends + " friends");
    }
}
