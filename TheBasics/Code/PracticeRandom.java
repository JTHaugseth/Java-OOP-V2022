import java.util.Random;

public class PracticeRandom {

    public static void main(String[] args) {

        Random random = new java.util.Random();

        int x = random.nextInt(6)+1; // Binder random til 6 (0-5) og legger på +1, så vi får 1-6 (Terning)
        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(x);


    }
}
