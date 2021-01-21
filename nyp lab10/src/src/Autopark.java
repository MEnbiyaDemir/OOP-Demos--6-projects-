//Muhammed Enbiya Demir 190202018

package src;

import java.util.Vector;

public class Autopark {
 Vector<Automobile> park;
 static long otoparkKasasi = 0;

 
 
 Autopark(int size){
 this.otoparkKasasi=0;
park=new Vector<Automobile>(size);
 }


 public void girisYap(Automobile oto) {
 //doldur
  if(park.capacity()>park.size()) {
  park.add(oto);
  System.out.println(oto.license + " park etti. Otopark kapasitesi ve boyutu: " + park.capacity() + ", " + (park.capacity()-park.size()));
  oto.girisZamani=System.currentTimeMillis();}
  else
	  System.out.println(oto.license + "park edemedi.");
 } 
 
 
 
 public void cikisYap(Automobile oto) {
	 if(park.contains(oto)) {
	 long a=System.currentTimeMillis()-oto.girisZamani;
	 int eklenen=(int)(a*10/100f);
	 otoparkKasasi=otoparkKasasi+eklenen;
	 park.remove(oto);
	 System.out.println(oto.license +" otoparktan " + a + " milisaniye sonra cikti. Odenen para: " + eklenen);}
	 else
	 System.out.println("arac bulunamadi.");
 }

 // otopark kasasýnda kaç TL olduðunu ekranda gösterecek.
 public static void kasaBilgi() {
 //doldur
	 System.out.println("Kasadaki para: " + otoparkKasasi);
 }
 
 public int recursiveTopl(int n){
	 if(n<=2){return 1;}
	 else
		 return 3*recursiveTopl(n/2)+n;
	 } 




 // Ornek Test senaryosu
 public static void main(String[] args) throws InterruptedException {
 Autopark park = new Autopark(1);
 Automobile a = new Automobile("41 BR 123");
 Automobile b = new Automobile("34 TR 456 ");
 park.girisYap(a); // a otoparka giris yapiyor
 Thread.sleep(200); // 200 milisaniye zaman geçiyor.

 park.girisYap(b); // b otoparka giris yapiyor
 Thread.sleep(999); // 999 milisaniye zaman geçiyor
 park.cikisYap(b);  // b otoparktan cikiyor
 park.cikisYap(a); // a otoparktan çýkýyor –aslýnda yukarda kapasitededen dolayý giremediði için
 //(park edemedi) araç bulunamadý yaziyo
 park.kasaBilgi(); // otoparktaki toplam parayý yazdýrýyor.
 }
} 
