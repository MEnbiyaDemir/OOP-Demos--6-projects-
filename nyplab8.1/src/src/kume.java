package src;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class kume{
	
	 Set<Integer> array =new HashSet<>();
		
	    //constr
		public kume(){}
		//copy constr
		public kume(kume a) {
			this.array=a.array;
		}
		
		public kume(int[] a){
			for (int i = 0; i < a.length; i++) {
	            this.array.add(a[i]);
	        }	}
		
		
		
		public void ekle(int a) {
			array.add(a);
		} 
		
		public void yazdir(){ for(Integer array:array){System.out.print(array+" ");} }  
		
		public boolean denk(kume a){ 
			if(this.array.size()==a.array.size()){return true;}
			return false;
			} 
		
		public boolean esit(kume a){
			if(a.array.equals(this.array)){return true;}
			return false;
		} 
		
		public kume birlesim(kume a){
			kume kumebirlesim=new kume();
			kumebirlesim.array.addAll(a.array);
			kumebirlesim.array.addAll(this.array);
			return kumebirlesim;
		}
		
		public kume kesisim(kume a) {
			kume kumekesisim=new kume();
			kumekesisim.array.addAll(a.array);
			kumekesisim.array.retainAll(this.array);
			return kumekesisim;
		} 
		
		public kume fark(kume a){
			kume kumefark=new kume();
			kumefark.array.addAll(this.array);
				kumefark.array.removeAll(a.array);
				return kumefark;
			
		} 
		
		
	

	public static void main(String[] args) {

	  //Muhammed Enbiya Demir 190202018
		
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
