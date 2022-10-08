package interfacePackage;

import java.util.ArrayList;
import java.util.List;

public class Class01 extends Class02 implements Araba, Interface02 {

    public static void main(String[] args) {
       //abstract method concrete method
        System.out.println(MARKA);
        //final degiskenlerin degerleri degistirilemez!!!
        //MARKA = "AUDI";
    }

    @Override
    public void a() {
        Araba.super.a();
    }


    @Override
    public void yurume() {
        System.out.println("KEDiler kosar");
    }

    @Override
    public void kapi() {

    }

    @Override
    public void direksiyon() {

    }

    @Override
    public void b() {

    }
}
