import java.util.Scanner;

public class havad {
    public static void main(String[] args ) {

        int heat;

        Scanner at = new Scanner(System.in);
        System.out.print("Lutfen Hava sicakligini giriniz : ");
        heat = at.nextInt();

             if ( heat  <  5 ) {
               System.out.println("Kayak Yapabilirsiniz . ");
                   }
                else if ( heat == 5 ) {
                 System.out.println("Kayak yapabilir veya sinemaya gidebilirsiniz . ");

                 }

                if (heat > 5  && heat < 15 ){
                    System.out.println("Sinemaya Gidebilirsiniz .  !! :D ");
                } else if (heat == 15 ) {
                    System.out.println("Sinemaya veya Piknige gidebilirsiniz . ");

                }

                if ( heat > 15 && heat < 25 ) {
                    System.out.println("Piknige ve sinemaya gidebilirsiniz . ");
                }
                    else if (heat == 25 ) {
                    System.out.println("Piknige, Yüzmeye ve sinemaya gidebilirsiniz ");

                }

                  if ( heat > 25 && heat <= 50 ) {
                      System.out.println("Yuzmeye, Sinemaya ve golge bir yerde piknige Gidebilirsiniz. ");
                  } else if (heat > 50 ) {
                      System.out.println("Abartma lan Afrika mi orasi . ");

                  }


    }
}
