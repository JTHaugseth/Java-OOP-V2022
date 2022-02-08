public class Scanner {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+ " years old!");

    }
}
