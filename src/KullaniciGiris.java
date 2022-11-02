import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String userName,password,decision;

        Scanner inp = new Scanner(System.in);
        System.out.println("Username giriniz");
        userName = inp.nextLine();
        System.out.println("Password giriniz");
        password = inp.nextLine();

        if (userName.equals("java123") && password.equals("patika")) {
            System.out.println("Giris yaptiniz");
        }
        else {
            System.out.println("Sifreniz yanlis");
            System.out.println("Sifre degistirmek istiyorsaniz y istemiyorsaniz n yazin");
            decision = inp.nextLine();
            if (decision.equals("y")) {
                System.out.println("Password giriniz");
                password = inp.nextLine();
                System.out.println("Sifreniz basariyla degisti");
            }
            else {
                System.out.println("Sifreniz degistirilmedi");
            }
        }
    }



}
