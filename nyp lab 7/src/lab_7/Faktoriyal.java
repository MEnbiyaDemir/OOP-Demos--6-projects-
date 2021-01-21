//190202018  Muhammed Enbiya Demir

package lab_7;

/**
 *
 * @author asayar
 */
public class Faktoriyal {
    
    private int deger;
    private int sonuc;
    
    
    /**
     * Faktoriyali bulunmak istenen
     * deðeri atar
     * @param deger
     */
    public void setDeger(int deger){
        this.deger=deger;
    }
    /**
     * Faktoriyali bulunmak istenen
     * dönderir
     * @return
     */
    public int getDeger(){
        this.deger=deger;
        return 0;
    }
    
    /** 
     * Girilen deðerin faktorial deðerini Islemlerim
     * class ýndaki methodlarý kullanarak 
     * hesaplayýp sonuc parametresine yazdýrýr
     */    
    
    
    public void hesapla(){
     sonuc=1;
   	 Islemlerim calc=new Islemlerim(sonuc);
         for(int i = 1; i<= deger; i++){
        	 calc.deger_1=sonuc;
             sonuc = (int) calc.carp(i);}
    }
    
    /**
     * Degeri ve sonucu ekrana yazdýrýr
     */
    public void ekranaYazdir(){        
     System.out.println(deger + "'nýn Faktoriyeli: " + sonuc);
    }

}
