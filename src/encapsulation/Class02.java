package encapsulation;

public class Class02 {


    public static void main(String[] args) {
        Class01 class01 = new Class01();
        //field = variable
        Class01 class02 = new Class01();


        //class01 objesinde bulunan bPrivate'ninin degeri null
        String a = class01.getbPrivate();
        // a = null;
        class01.setbPrivate("321");
        //class01 objesinde bulunan bPrivate'ininin degeri 321
        yazdirma(a); //null
        yazdirma(class01.getbPrivate()); //321
        //System.out.println(class01.getbPrivate());
        yazdirma(class02.getbPrivate()); //null
        class02.setbPrivate("678");
        String b = class02.getbPrivate();
        yazdirma(b);
        class02.setbPrivate("654");
        yazdirma(class02.getbPrivate());
    }

    public static void yazdirma(String a){
        System.out.println(a);
    }

}
