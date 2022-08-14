import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class siralama {
    public static void main(String[] args){
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayi  A : ");
        a = input.nextInt();

        System.out.print("Ikinci sayi B :");
        b = input.nextInt();

        System.out.print("Ucuncu sayi C :");
        c = input.nextShort();

        if(a>b && a>c) {
            if(b>c){
                System.out.print("a > b > c ");
            }else if (c>b){
                System.out.print("a > c > b");
            }
        }else if(a>b && a<c){
            System.out.print("c > a > b ");
        }else if (a<b && a>c){
            System.out.print("b > a > c ");
        }
        if(a<c && a<b) {
            if (b > c) {
                System.out.print("b > c > a");
            } else if (c > b) {
                System.out.print("c > b > a ");
            }
        }


    }
}
