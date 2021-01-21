package src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class kume {
	
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
	
	
	
}
