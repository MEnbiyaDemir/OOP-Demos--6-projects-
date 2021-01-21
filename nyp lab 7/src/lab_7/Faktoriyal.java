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
     * de�eri atar
     * @param deger
     */
    public void setDeger(int deger){
        this.deger=deger;
    }
    /**
     * Faktoriyali bulunmak istenen
     * d�nderir
     * @return
     */
    public int getDeger(){
        this.deger=deger;
        return 0;
    }
    
    /** 
     * Girilen de�erin faktorial de�erini Islemlerim
     * class �ndaki methodlar� kullanarak 
     * hesaplay�p sonuc parametresine yazd�r�r
     */    
    
    
    public void hesapla(){
     sonuc=1;
   	 Islemlerim calc=new Islemlerim(sonuc);
         for(int i = 1; i<= deger; i++){
        	 calc.deger_1=sonuc;
             sonuc = (int) calc.carp(i);}
    }
    
    /**
     * Degeri ve sonucu ekrana yazd�r�r
     */
    public void ekranaYazdir(){        
     System.out.println(deger + "'n�n Faktoriyeli: " + sonuc);
    }

}
