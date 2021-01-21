//190202018  Muhammed Enbiya Demir

package lab_7;

/**
 *
 * @author asayar
 */
public class Daire {
    
    // Class parametreleri
    public double PI=3.14;
    public int yaricap;
	double alan,cevre;

    /**
     * Constructor
     * @param yaricap Dairenin yarýçapý
     */
    public Daire(int yaricap){
        this.yaricap=yaricap;
    }
    
    /**
     * Dairenin alanýný Islemlerim class ýndaki 
     * methodlarý kullanarak hesaplar
     * @return alaný double cinsinden dondurur
     */
    
    double yaricapkare=yaricap*yaricap;
    double cap=yaricap*2;
    
    public double  alanHesapla(){
    	double alan;
        Islemlerim calc=new Islemlerim(yaricap);
        alan=calc.carp(calc.carp(PI));
        return alan;
    }
    
    /**
     * Dairenin çevresini Islemlerim class ýndaki 
     * methodlarý kullanarak hesaplar
     * @return cevreyi double cinsinden dondurur
     */
    public double cevreHesapla(){
    	double cevre;
        Islemlerim calc=new Islemlerim(2);
        Islemlerim calc2=new Islemlerim(yaricap);
       cevre=calc2.carp(calc.carp(PI));
       return cevre;
    }
    
    /**
     * Bir dairenin cevresinin alanýndan büyüyk
     * olup olmadýðýný Islemlerim class ýndaki 
     * methodlarý kullanarak belirler
     * @return boolean deðer dönderir
     */
    public boolean cevreAlandanBuyuktur(){
        return false;
    }
    
    /**
     * Bir dairenin cevresinin alanýndan küçük
     * olup olmadýðýný ýslemlerim class ýndaki 
     * methodlarý kullanarak belirler
     * @return boolean deðer dönderir
     */
    public boolean cevreAlandanKucuktur(){
        return false;
    }
    
    /**
     * Dairenin alanýný ve çevresini ekrana yazdýrýr.
     */
    public void ekranaYazdir(){
	System.out.println("Daire Alan: " + alanHesapla());
     System.out.println("Daire Cevre: " + cevreHesapla());
    }
    
    

}
