import java.util.Scanner;

public class taksimetre {
    public static void main (String[] args){

        int safkm, s = 10 ;
        double sonuc;

        Scanner taksimetre = new Scanner(System.in);

        System.out.print("Lutfen Gidilen Mesafeyi Giriniz = ");
        safkm = taksimetre.nextInt();

        sonuc = s + 2.2*safkm;

        if (sonuc < 20) sonuc= 20;

        System.out.println("Toplam Odenecek Tutar = " + sonuc);




    }
}
