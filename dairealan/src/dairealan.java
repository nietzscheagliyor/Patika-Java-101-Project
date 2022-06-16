import java.util.Scanner;

public class dairealan {
    public static void main (String[] args){

        int r;
        double π=3.14,area, env ;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lutfen Dairenin capini Giriniz = ");
        r = inp.nextInt();

        area = π*r*r;
        env = 2*π*r;

        System.out.println("Direnin alani =" + area);
        System.out.println("Dairenin cevresi = " + env);







    }
}

