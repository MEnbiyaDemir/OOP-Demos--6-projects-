//Muhammed Enbiya Demir 190202018
// txt dosyasýnda ders isimlerinin icindeki bosluklarýn yerine "_" koyarak çalýþtýrdým


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
		System.out.println("Ýsim:" + this.ad);
		System.out.println("SoyÝsim:" + this.soyAd);
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
