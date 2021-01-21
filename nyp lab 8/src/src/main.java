package src;

import java.util.ArrayList;



public class main extends kume{
	

	public static void main(String[] args) {

		/* normalde hepsini tek class içinde yazacaktým ama 
		pdfte farklý class gibi bahsetmiþsiniz kume classý falan yazmýþtýnýz 
		o yüzden kume kýsmýný baþka classa yazdým
		kod çalýþýyor yani o kýsmý anlamadýðýmdan böyle yaptým umarým yanlýþ anladýysam puan kýrmazsýnýz 
		txtye de birleþik þekilde atýcam ama kume kýsmýnýn kendi classý olmasý lazým
		*/
		
		kume km = new kume();
		km.ekle(10);
		km.ekle(11);
		km.ekle(2);
		
		System.out.print("km = {");
		km.yazdir();
		System.out.println("}");
		
		int[] a = {1,2,3,4,5,6};
		kume km2 = new kume(a);
		System.out.print("km2 = {");
		km2.yazdir();
		System.out.println("}");
		
		kume km3 = new kume(a);
		System.out.print("km3 = {");
		km3.yazdir();
		System.out.println("}");
		
		if (km.denk(km2))
		System.out.println("km ve km2 kumeleri denk.");
		else
		System.out.println("km ve km2 kumeleri denk degil.");
		
		if (km2.esit(km3))
		System.out.println("km2 ve km3 kumeleri esit.");
		else
		System.out.println("km2 ve km3 kumeleri esit degil.");
		
		kume sn = km.birlesim(km2);
		System.out.print("km ve km2 birlesimi = {");
		sn.yazdir();
		System.out.println("}");

		kume sn2 = km.kesisim(km2);
		System.out.print("km ve km2 kesisimi = {");
		sn2.yazdir();
		System.out.println("}");
		
		kume sn3 = km.fark(km2); 
		System.out.print("km ve km2 farki = {");
		sn3.yazdir();
		System.out.println("}");
		
		
		
		
	}
	
	
	

}
