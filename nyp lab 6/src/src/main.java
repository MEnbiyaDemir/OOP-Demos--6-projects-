package src;

import java.util.ArrayList;
import java.util.Scanner;



public class main {
	

	public static int[] doublet(int[] array) {
		
		for(int i=0;i<4;i++) {
		array[i]=array[i]*2;
		
		
		}
		
		return array;
	}
	
	public static void okut(ArrayList<Integer> array,int n) {
		
		for(int i=0; i<n; i++) {
			System.out.print(" "+array.get(i));
		}
	}
	
	
public static void main(String[] args) {

	int[] array={1,3,5,7};
		
		System.out.print("Dizinin ilk hali: ");
		for(int i=0; 4>i;i++) {
			System.out.print(" " + array[i]);
		}
		
		System.out.println("");
		
		int[] newarray= doublet(array);
		
		System.out.print("Dizinin son hali: ");
		for(int i=0; 4>i;i++) {
			System.out.print(" " + newarray[i]);
		}
		
		System.out.println("");
System.out.println(" Calisma2 = Listeye girmesini ve medyaný alýnmasýný istediðiniz sayýlarý girin. Listeyi bitirdiyseniz 0 girerek bitirebilirsiniz.");
        
		ArrayList<Integer> numberlist = new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		
		 int a=1;
		do{  
			System.out.println("Listeye girmesini istediginiz yeni sayýyý giriniz: ");
			a=sc.nextInt();
			if(a==0) {
				break;}
			numberlist.add(a);
		    }while(a!=0);  		
		
		int n=numberlist.size();
		
		System.out.print("Kullanýcýnýn girdiði degerler: ");
		okut(numberlist,n);
		
		for(int i=0;i<n;i=i+2) {
			if(i==n-1) {break;}
			int bm;
			bm=numberlist.get(i);
			numberlist.set(i, numberlist.get(i+1));
			numberlist.set(i+1, bm);
				
		}
		
		System.out.println("");
		System.out.print("Yeni degerler: ");
		okut(numberlist,n);
	}
}
