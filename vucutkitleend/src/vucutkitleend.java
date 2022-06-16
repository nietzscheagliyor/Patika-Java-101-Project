import java.util.Scanner;

public class vucutkitleend {
    public static void main (String[] args){

        int kilo;
        double boy, index;

        Scanner vtke = new Scanner(System.in);
        System.out.print("Lutfen Kilonuzu giriniz = ");
        kilo = vtke.nextInt();

        System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz = ");
        boy = vtke.nextDouble();

        index = kilo / (boy * boy);

        System.out.println("Vucut kitle indeksiniz = " + index);





    }
}
