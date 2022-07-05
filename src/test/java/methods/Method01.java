package methods;

import java.util.Scanner;

public class Method01 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String b = scan.next(); // String b = "Ebubekir"
        int c = scan.nextInt();
        double a = marketeGit(10,8); // 7.0
        // marketeGit(3, 5);


        ekmekYe(a);
        //faturaYatirma(50);
    }

    public static double marketeGit(int babaParasi, int anneParasi){
        // babaParasi = 3;
        // anneParasi = 5;
        double ekmekParasi = 2;
        double ekmekSayisi = (babaParasi + anneParasi) / ekmekParasi; // 7.0
        System.out.println("baba " + ekmekSayisi + " tane ekmek aldim");

        // ekmekSayisi = 7.0;
        return ekmekSayisi;
    }

    public static void ekmekYe(double ekmekSayisi){
        System.out.println(ekmekSayisi + " ekmek yedik");
    }


    public static void faturaYatirma(int babaParasi){
        // babaParasi = 3;
        // anneParasi = 5;
        int faturaParasi = 30;
        System.out.println("Baba faturayi yatirdim " + (babaParasi - faturaParasi) + " kadar param kaldi");
    }

    //Access Modifiers
    //private protected default

    protected String c;
    //default String d; Yanlis yazim
    String d;

}
