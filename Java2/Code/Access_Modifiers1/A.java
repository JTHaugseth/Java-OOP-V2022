package Access_Modifiers1;
import Access_Modifiers2.*;

public class A {

    //protected String protectedMessage = "This is protected";


    /*public static void main(String[] args) {

        C c = new C();

        System.out.println(c.publicMessage); // Dette går fordi publicMessage i C er satt til public
    }*/

    public static void main(String[] args) {

        B b = new B();

        //System.out.println(b.privateMessage); //Dette går ikke fordi privateMessage er private i B.
    }
}
