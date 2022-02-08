import java.util.ArrayList;

@SuppressWarnings("ALl")

public class a_2D_ArrayList {

    public static void main (String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic Bread");
        bakeryList.add("Doughnuts");

        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("Tomatoes");
        produceList.add("Zucchini");
        produceList.add("Peppers");

        ArrayList<String> drinksList = new ArrayList<String>();
        drinksList.add("Soda");
        drinksList.add("Coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);

    }
}
