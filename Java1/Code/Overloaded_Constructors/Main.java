package Overloaded_Constructors;

public class Main {

    public static void main(String[] args) {
        // Overloaded constructors = multiple constructors within a class with the same name,
        //                           but have different parameters
        //                           name + parameter = signature

        Pizza pizza = new Pizza("Thick Crust", "Tomato", "Mozzarella", "Pepperoni");

        System.out.println("Here are the ingredients for your pizza");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }
}
