import java.util.Scanner;

public class manavproct {
    public static void main(String[] args){

        double e, a, d, m, p, totalprice;
        int e1, a2, d2, m2, p2;

        Scanner manav = new Scanner(System.in);

        System.out.print("Elma (kg) miktarini giriniz : ");
        e1 = manav.nextInt();

        System.out.print("Armut (kg) miktarini giriniz : ");
        a2 = manav.nextInt();

        System.out.print("Domates (kg) miktarini giriniz : ");
        d2 = manav.nextInt();

        System.out.print("Muz (kg) miktarini giriniz : ");
        m2 = manav.nextInt();

        System.out.print("Patlican (kg) miktarini giriniz : ");
        p2 = manav.nextInt();

        e = e1 * 3.67;
        a = a2 * 2.14;
        d = d2 * 1.11;
        m = m2 * 0.95;
        p = p2 * 5;

        totalprice = (e+a+d+m+p);

        System.out.println("Toplam Odenecek tutar : " +totalprice);


    }
}
