import java.util.Scanner;

public class readme {
    public static void main(String[]  args) {

        int mat, fizik, kimya, biyoloji, edebiyat, tarih;


        Scanner ortalama = new Scanner(System.in);

            System.out.print("Matematik Notunuzu Giriniz Majesteleri :");
            mat = ortalama.nextInt();

            System.out.print("Fizik Notunuzu Giriniz Majesteleri :");
            fizik = ortalama.nextInt();

            System.out.print("Kimya Notunuzu Giriniz Majesteleri :");
            kimya = ortalama.nextInt();

            System.out.print("Biyoloji Notunuzu Giriniz Majesteleri :");
            biyoloji = ortalama.nextInt();

            System.out.print("Edebiyat Notunuzu Giriniz Majesteleri  :");
            edebiyat = ortalama.nextInt();

            System.out.print("Tarih Notunuzu Giriniz Majesteleri :");
            tarih = ortalama.nextInt();

            int toplam = (mat+fizik+kimya+biyoloji+edebiyat+tarih);
            double aritmetikort = toplam/6;

        System.out.print("Ortalamananiz:  ");
        System.out.println(aritmetikort);




        int a=60, b=59;

        boolean kosul1 = aritmetikort >= a;
        boolean kosul2 = aritmetikort > b ;

        boolean sonuc = kosul1 || kosul2;

        String str = sonuc ? "Tebrikler, Geçtiniz !" : "Gecmis Olsun Kaldiniz!!!";

        System.out.println(str);








    }
}
