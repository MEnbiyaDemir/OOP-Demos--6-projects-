//Muhammed Enbiya Demir 190202018
// txt dosyas�nda ders isimlerinin icindeki bosluklar�n yerine "_" koyarak �al��t�rd�m


import java.util.ArrayList;
import java.util.Vector;

public class Ogrenci {

	private String ad,soyAd,ogrenciNo;
	
	public Ogrenci(String ad,String soyAd,String ogrenciNo){
		this.ad=ad;
		this.ogrenciNo=ogrenciNo;
		this.soyAd=soyAd;
		
	}
	
	
	public void bilgiyazdir(){
		System.out.println("�sim:" + this.ad);
		System.out.println("Soy�sim:" + this.soyAd);
		System.out.println("no:" + this.ogrenciNo);
		}
	
	public void dersyazdir(){
		
	}
	
	public void ortalama(){
		
		
	}
    
    

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyAd() {
		return soyAd;
	}

	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}

	public String getOgrenciNo() {
		return ogrenciNo;
	}

	public void setOgrenciNo(String ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}
	
}
