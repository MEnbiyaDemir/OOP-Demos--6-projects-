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
     * @param deger_1 i�lem i�in birinci de�er
     */
    public Islemlerim(double deger_1){
    this.deger_1=deger_1;
    }
    /**
     * Toplama i�lemi
     * @param deger_2 ikinci de�er
     * @return toplama i�leminin sonucu
     */
    public double topla(double  deger_2){ 
        double result=deger_1+deger_2;
        return result;
    }
    
     /**
     * ��karma i�lemi
     * @param deger_2 ikinci de�er
     * @return ��karma i�leminin sonucu
     */
    public double cikar(double  deger_2){ 
        double result=deger_1-deger_2;
        return result;
    }
    
    /**
     * �arpma i�lemi
     * @param deger_2 ikinci de�er
     * @return �arpma i�leminin sonucu
     */
    public double carp(double  deger_2){ 
        double result=deger_1*deger_2;
        return result;
    }
    
    
    /**
     * B�lme i�lemi
     * @param deger_2 ikinci de�er
     * @return b�lme i�leminin sonucu
     */
    public double bol(double  deger_2){ 
        double result=deger_1/deger_2;
        return result;
    }
    
    
    /**
     * Buyuktur i�lemi
     * @param deger_2 ikinci de�er
     * @return buyuktur i�leminin sonucu
     */
    public boolean buyukdur(double  deger_2){ 
        boolean result=false;
        if(deger_1>deger_2){result=true;}
        return result;
    }
    

    /**
     * Kucuktur i�lemi
     * @param deger_2 ikinci de�er
     * @return kucuktur i�leminin sonucu
     */
    public boolean kucuktur(double  deger_2){ 
        boolean result=false;
        if(deger_1<deger_2){result=true;}
        return result;
    }
    
    /**
     * Esittir i�lemi
     * @param deger_2 ikinci de�er
     * @return esittir i�leminin sonucu
     */
    public boolean esittir(double  deger_2){ 
        boolean result=false;
        if(deger_1==deger_2){result=true;}
        return result;
    }
}
