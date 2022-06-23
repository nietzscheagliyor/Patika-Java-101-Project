import java.util.Scanner;

public class hesapmakinesi {
        public static void main (String[] args){

            int a, b, select;

            Scanner hesap = new Scanner(System.in);
            System.out.print("Lutfen birinci sayiyi giriniz = ");
            a = hesap.nextInt();

            System.out.print("Lutfen ikinci sayiyi giriniz = ");
            b = hesap.nextInt();

            System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
            System.out.print("Seciminiz = ");

            select = hesap.nextInt();

            // if (select == 1){
            //     System.out.println("Toplama Isleminin sonucu = " + (a+b));
            // } else if (select == 2) {
            //     System.out.println("Cikarma isleminin sonucu = " +  (a - b) );
            // } else if (select == 3) {
            //     System.out.println("Carpma isleminin sonucu = " + (a*b));
            // } else if (select == 4 ) {
            //     System.out.println("Bolme islemninin sonucu = " + (a/b));
            // } else {
            //     System.out.println("Gecersiz komut girdiniz!!");
            // }
            //  }


            switch (select) {

                case 1:
                    System.out.println("Toplama isleminin sonucu = "  + (a+b));
                    break;
                case 2:
                    System.out.println("Cikarma isleminin sonucu = " + (a-b));
                    break;
                case 3:
                    System.out.println("Carpma isleminin sonucu = " + (a*b) );
                    break;
                case 4:
                    System.out.println("Bolme isleminin sonucu = " + (a/b));
                    break;
                default:
                    System.out.println("Hatali Giris Yaptiniz !!");

            }






        }

}


