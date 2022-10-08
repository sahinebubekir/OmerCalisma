package interfacePackage;

public interface Araba {

    /*
		 		Interface'i interface'e parent yaparken extends keyword kullanilir.

		 		class ==> class : extends
		 		interface ==> interface : extends
		 		class ==> interface : implements
		 		interface ==> class : OLMAZ bir interface'in parent'i class olamaz
		 */
    /*
	 		1) Java "interface"ler icindeki tum methodlarin abstract method olmasi gerektigini bilir.
	 	Bu yuzden siz method uretirken abstract yazsanizda olur yazmasaniz da olur.
	 	public abstract void koltuk(); ile public void koltuk(); tamamiyle aynidir.

	 		2) Interface'lerdeki hersey otamatik olarak public'dir. Bu yuzden access modifier'i
	 	public olarak yazsaniz da olur yazmasaniz da olur.
	 	public abstract void koltuk(); ile  abstract void koltuk(); ile  void koltuk(); aynidir.

	 		3) Normalde access modifier yamayinca access modifier default olur ama interface'lerde
	 	access modifier her zaman public oldugundan yazmasaniz da o public'dir.

	 		4) Interface class degildir, interface interface'dir.
	 */

		/*
		 	1) interface'deki tum variable'lar "final" dir.

		 	"final" variable olusturdugunuzda isimleri "bold" olarak yazilir.
		 	2) public static final String marka = "Honda"; ile String marka = "Honda"; tamamiyle aynidir.
		 	3) Genel kullanim olarak "final variable" larin isimleri buyuk harflerle yazilir.
		 */

    /*
	 	1) Interface'lerde "concrete" methodlar kullanilamaz, sadece "abstract" methodlar kullanilabilir.
	 	Interface'ler SADECE mecbur yapilmasi gerekenleri depolamak icin kullanilir.

	 	2) Java Multiple Inheritance'i desteklemez ama parent'lar class ise desteklemez. Parent'lar interface
	 	ise Java multiple inheritance'i destekler.

	 	3) Birden fazla parent class oldugunda farkli parent class'larda ayni isimli methodlarin olmasi mumkundur
	 	Bu tip durumlarda child class ayni isimli farkli body'li methodlardan hangisini kullanacagina karar veremez.
	 	Fakat interface'lerde method'larin body'leri olmadigindan ayni isimli methodlar birbirinin tamamiyla aynisidir.
	 	Bu methodlardan birini override etmek hepsini override etmek manasina gelir.

	 	Note: Ayni method signature sahip ama return type'lari farkli methodlar varsa Java interface'ler icin de CTE verir.

	 	4)
	 */
    /*
		 		Class'lari bir class'in parent'i yaparken "extends" keyword kullanilir.
		 Interface'leri bir class'in parent'i  yaparken implements kullanilir.
		 */


     void kapi();

     void direksiyon();


     //concrete method
     default void a(){
         System.out.println("!23131");
     }

     // static keyword'u ile concrete method uretilirse child class'tan implement mumkun degildir,.
     static void c(){
         System.out.println("3213");
     }

     //otomatik olarak public static ve final.
     String MARKA = "HONDA";


     void b();

}
