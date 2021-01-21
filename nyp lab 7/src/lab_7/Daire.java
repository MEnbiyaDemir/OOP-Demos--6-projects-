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
     * @param yaricap Dairenin yar��ap�
     */
    public Daire(int yaricap){
        this.yaricap=yaricap;
    }
    
    /**
     * Dairenin alan�n� Islemlerim class �ndaki 
     * methodlar� kullanarak hesaplar
     * @return alan� double cinsinden dondurur
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
     * Dairenin �evresini Islemlerim class �ndaki 
     * methodlar� kullanarak hesaplar
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
     * Bir dairenin cevresinin alan�ndan b�y�yk
     * olup olmad���n� Islemlerim class �ndaki 
     * methodlar� kullanarak belirler
     * @return boolean de�er d�nderir
     */
    public boolean cevreAlandanBuyuktur(){
        return false;
    }
    
    /**
     * Bir dairenin cevresinin alan�ndan k���k
     * olup olmad���n� �slemlerim class �ndaki 
     * methodlar� kullanarak belirler
     * @return boolean de�er d�nderir
     */
    public boolean cevreAlandanKucuktur(){
        return false;
    }
    
    /**
     * Dairenin alan�n� ve �evresini ekrana yazd�r�r.
     */
    public void ekranaYazdir(){
	System.out.println("Daire Alan: " + alanHesapla());
     System.out.println("Daire Cevre: " + cevreHesapla());
    }
    
    

}
