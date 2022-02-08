import java.lang.Math;

@SuppressWarnings("ALL")

public class a_Math {

    public static void main(String[] args){

        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y); //Math.max finn den største verdien.
        double zz = Math.min(x, y); // Math.min finn den minste verdien.
        double zzz = Math.abs(y); // Finn den absolutte verdien av en variabel. I ditte tilfelle blir -10 = 10.
        double v = Math.sqrt(x); // Finn square-root av verdien.
        double vv = Math.round(x); // Runder av til nærmeste heltall.
        double vvv = Math.ceil(x); // Ceil runder alltid OPP til nærmeste heltall.
        double c = Math.floor(x); // Floor runder alltid NED til nærmeste heltall.


        System.out.println(c);
    }
}
