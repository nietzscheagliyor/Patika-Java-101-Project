import java.util.Scanner;

public class daireAlan2 {
    public static void main (String[] args){

        int a, r ;
        double pi=3.14, area;

        Scanner inp = new Scanner(System.in);
        System.out.print("Yari cap giriniz =");
        r = inp.nextInt();

        System.out.print("Merkez acisinin olcusunu giriniz = ");
        a = inp.nextInt();

        area = (pi * (r*r) * a) / 360;

        System.out.println("Dairenin alani  = " + area);



    }
}
