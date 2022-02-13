public class Overloaded_Methods {

    public static void main(String[] args) {
        // Overloaded methods = methods that share the same name but have different parameters
        //                      method name + parameters = method signature

        int x = add(1,2, 3);
        //double c = add(1.1,2.1, 3.3, 4.2);

        System.out.println(x);
        //System.out.println(c);

    }

    // int

    static int add(int a, int b) {
        System.out.println("This is overloaded method number 1");
        return a + b;
    }
    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method number 2");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method number 3");
        return a + b + c + d;
    }

    // double

    static double add(double a, double b) {
        System.out.println("This is overloaded method number 4");
        return a + b;
    }
    static double add(double a, double b, double c) {
        System.out.println("This is overloaded method number 5");
        return a + b + c;
    }
    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloaded method number 6");
        return a + b + c + d;
    }
}
