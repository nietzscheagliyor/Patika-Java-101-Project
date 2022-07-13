import java.util.Scanner;

public class class1 {
    public static void main (String[] args) {

        int fizik, kimya, mat, tarih, edebiyat;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz = ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz = ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz = ");
        kimya = input.nextInt();

        System.out.print("Tarih notunuzu giriniz = ");
        tarih = input.nextInt();

        System.out.print("Edebiyat notunuzu giriniz = ");
        edebiyat = input.nextInt();

        if ( mat < 0 || mat > 100 ){
             mat = 0 ;
        }
        if (fizik < 0 || fizik > 100 ) {
            fizik = 0;
        }
        if (kimya < 0 || kimya > 100 ){
            kimya = 0 ;
        }
        if (tarih < 0 || tarih > 100 ) {
            tarih  = 0 ;
        }
        if ( edebiyat < 0 || edebiyat < 100 ) {
            edebiyat = 0;
        }

        double avarage = ( mat + fizik + kimya + edebiyat + tarih )/ 5;

        if ( avarage <= 55 ) {
            System.out.println("SINIFTA KALDINIZ !!!!!");
            System.out.println("Ortalamanız = " + avarage);
        }
        else {
            System.out.println("Tebrikler Sınıfı Gectiniz !1!!");
            System.out.println("Ortalamanız = " + avarage);
        }
    }

}

