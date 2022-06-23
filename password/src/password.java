import java.util.Scanner;

public class password {
    public static void main (String[] args){
        String userName, password,newpass, ques;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanici Adini Giriniz : ");
        userName = inp.nextLine();

        System.out.print("Sifrenizi Giriniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java101")) {
            System.out.println("Giris Yaptiniz!");
         }
                 else if (userName.equals("patika")) {
                    System.out.println("Sifreyi yanlis girdiniz !");
                    System.out.print("Sifrenizi sifirlamak icin 'y' tusuna basiniz, mevcut sifre ile devam etmek icin 'm' tusuna basiniz . : ");
                    ques = inp.nextLine();

                        if (ques.equals("m")) {
                         System.out.println("Mevcut Sifreniz ile devam edebilirsiniz . ");
                        }

                        else if (ques.equals("y")) {
                          System.out.print("Yeni sifrenizi giriniz = ");
                         newpass = inp.nextLine();

                             if(newpass.equals("java101")) {
                                   System.out.println("Yeni sifreniz eski sifreniz ile ayni olamaz!");
                             }else {
                                System.out.println("Sifreniz Basariyla degistirilmistir");
                }

            }


        }
        else if (password.equals("java101")){
            System.out.println("Gecersiz kullanici adi girdiniz!");
        }else{
            System.out.println("Gecersiz bilgiler giriniz");
        }



    }
}
