//190202018  Muhammed Enbiya Demir

package lab_7;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double deger_1,deger_2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ýslem yapilmasini istediginiz 1. sayiyi girin: ");
        deger_1=sc.nextDouble();
        System.out.println("Islem yapilmasini istediginiz 2. sayiyi girin: ");
        deger_2=sc.nextDouble();
        
		Islemlerim calc=new Islemlerim(deger_1);
		System.out.println("Toplam:" + calc.topla(deger_2));
		System.out.println("Çýkarma:" + calc.cikar(deger_2));
		System.out.println("Toplam:" + calc.bol(deger_2));
		System.out.println("Toplam:" + calc.carp(deger_2));
		boolean a=calc.buyukdur(deger_2);
		boolean b=calc.kucuktur(deger_2);
		boolean c=calc.esittir(deger_2);
		if(a==true){System.out.println("1.deger > 2.deger");}
		if(b==true){System.out.println("1.deger < 2.deger");}
		if(c==true){System.out.println("1.deger = 2.deger");}

        Faktoriyal fc=new Faktoriyal();
        fc.setDeger(4);
        fc.hesapla();
        fc.ekranaYazdir();
        fc.setDeger(5);
        fc.hesapla();
        fc.ekranaYazdir();
        
        System.out.println("daire yaricapý gir: ");
        int yaricap=sc.nextInt();
        Daire dr=new Daire(yaricap);
        dr.alanHesapla();
        dr.cevreHesapla();
        dr.ekranaYazdir();
        if(dr.alanHesapla()<dr.cevreHesapla()) {System.out.println("alan cevreden kucuktur");}
        if(dr.alanHesapla()>dr.cevreHesapla()) {System.out.println("alan cevreden buyuktur");}
        if(dr.alanHesapla()==dr.cevreHesapla()) {System.out.println("alan cevreye esittir");}

        System.out.println("6 yaricaplý daire özellikleri: ");
        Daire dr2=new Daire(6);
        dr2.alanHesapla();
        dr2.cevreHesapla();
        dr2.ekranaYazdir();
        
	}

}
