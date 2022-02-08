import java.lang.reflect.Array;
import java.util.*;

@SuppressWarnings("ALl")

public class Practice2DArrayList {

    public static void main (String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic Bread");
        bakeryList.add("Doughnuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("Tomatoes");
        produceList.add("Zucchini");
        produceList.add("Peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("Soda");
        drinksList.add("Coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);

    }
}
