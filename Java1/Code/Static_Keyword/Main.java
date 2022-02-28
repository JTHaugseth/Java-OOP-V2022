package Static_Keyword;

public class Main {

    public static void main(String[] args) {
        // static = modifier. A single copy of a variable/method is created and shared.
        //          The class "owns" the static member.

        Friend friend1 = new Friend("Ole");
        Friend friend2 = new Friend("Julian");
        Friend friend3 = new Friend("Vegard");
        Friend friend4 = new Friend("Simen");

        //System.out.println(Friend.numberOfFriends);
        Friend.displayFriend();
    }
}
