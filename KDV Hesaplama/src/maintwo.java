import java.util.Scanner;

public class maintwo {
    public static void main (String[] args){

       double sayi, kdvOrani18 = 0.18, kdvOrani8 = 0.08, hesaplanankdv, hesaplanankdv2 , o1, o2, kdvliSonuc;

       Scanner input = new Scanner(System.in);
        System.out.print("KDV'si hesaplanacak sayiyi giriniz = ");
        sayi= input.nextDouble();

        boolean kdvDusuk = sayi < 1000 ;

        hesaplanankdv = (sayi * kdvOrani18);
        hesaplanankdv2 =(sayi * kdvOrani8);

        o1 = kdvDusuk ? (hesaplanankdv) : (hesaplanankdv2);
        o2 = kdvDusuk ? (kdvOrani18) : (kdvOrani8);

        kdvliSonuc = ( o1 + sayi);

        System.out.println("KDV'siz Tutar: "+ sayi);
        System.out.println("KDV Orani: "+ o2);
        System.out.println("Eklenecek KDV: "+ o1);
        System.out.println("KDV'li Tutar: "+ kdvliSonuc);


    }
}
