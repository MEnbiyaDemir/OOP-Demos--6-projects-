//190202018  Muhammed Enbiya Demir

package lab_7;

/**
 * 
 * @author asayar
 */
public class Islemlerim {
    public double deger_1;
    
    /**
     * Constructor
     * @param deger_1 iþlem için birinci deðer
     */
    public Islemlerim(double deger_1){
    this.deger_1=deger_1;
    }
    /**
     * Toplama iþlemi
     * @param deger_2 ikinci deðer
     * @return toplama iþleminin sonucu
     */
    public double topla(double  deger_2){ 
        double result=deger_1+deger_2;
        return result;
    }
    
     /**
     * Çýkarma iþlemi
     * @param deger_2 ikinci deðer
     * @return çýkarma iþleminin sonucu
     */
    public double cikar(double  deger_2){ 
        double result=deger_1-deger_2;
        return result;
    }
    
    /**
     * Çarpma iþlemi
     * @param deger_2 ikinci deðer
     * @return çarpma iþleminin sonucu
     */
    public double carp(double  deger_2){ 
        double result=deger_1*deger_2;
        return result;
    }
    
    
    /**
     * Bölme iþlemi
     * @param deger_2 ikinci deðer
     * @return bölme iþleminin sonucu
     */
    public double bol(double  deger_2){ 
        double result=deger_1/deger_2;
        return result;
    }
    
    
    /**
     * Buyuktur iþlemi
     * @param deger_2 ikinci deðer
     * @return buyuktur iþleminin sonucu
     */
    public boolean buyukdur(double  deger_2){ 
        boolean result=false;
        if(deger_1>deger_2){result=true;}
        return result;
    }
    

    /**
     * Kucuktur iþlemi
     * @param deger_2 ikinci deðer
     * @return kucuktur iþleminin sonucu
     */
    public boolean kucuktur(double  deger_2){ 
        boolean result=false;
        if(deger_1<deger_2){result=true;}
        return result;
    }
    
    /**
     * Esittir iþlemi
     * @param deger_2 ikinci deðer
     * @return esittir iþleminin sonucu
     */
    public boolean esittir(double  deger_2){ 
        boolean result=false;
        if(deger_1==deger_2){result=true;}
        return result;
    }
}
