package src;

import java.util.ArrayList;



public class main extends kume{
	

	public static void main(String[] args) {

		/* normalde hepsini tek class i�inde yazacakt�m ama 
		pdfte farkl� class gibi bahsetmi�siniz kume class� falan yazm��t�n�z 
		o y�zden kume k�sm�n� ba�ka classa yazd�m
		kod �al���yor yani o k�sm� anlamad���mdan b�yle yapt�m umar�m yanl�� anlad�ysam puan k�rmazs�n�z 
		txtye de birle�ik �ekilde at�cam ama kume k�sm�n�n kendi class� olmas� laz�m
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
