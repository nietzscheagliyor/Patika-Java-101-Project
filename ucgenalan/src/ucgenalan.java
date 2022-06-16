import java.util.Scanner;

public class ucgenalan {
    public static void main (String[] args){

        int a, b, c;
        double u, alan, alank;

        Scanner alann = new Scanner(System.in);
        System.out.print("Birinci Kenari Giriniz = ");
        a = alann.nextInt();

        System.out.print("Ikinci Kenari Giriniz = ");
        b = alann.nextInt();

        System.out.print("Ucuncu kenari giriniz = ");
        c = alann.nextInt();

        u = (a+b+c)/2;
        alank  =  u*(u-a)*(u-b)*(u-c);
        alan = Math.sqrt(alank);

        System.out.print("Ucgenin alani = ");
        System.out.print(alan);







    }
}
