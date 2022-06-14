import java.util.Scanner;

public class main {
        public static void main (String[] args){

            double a;
            Scanner input = new Scanner(System.in);
            System.out.print("Bir Deger Giriniz :");
            a = input.nextDouble();

           double kdvli = a*18/100 + a;
           double kdv = a*18/100;

            System.out.print("KDV'siz Fiyat =");
            System.out.println(a);

            System.out.print("KDV'li Fiyat =");
            System.out.println(kdvli);

            System.out.print("KDV tutari =");
            System.out.println(kdv);





        }
}
