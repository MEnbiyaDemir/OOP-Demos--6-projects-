package src;
/*190202018 Muhammed Enbiya Demir*/

public abstract class Ogrenci extends Ders implements Kisi{
	
         
	public Ogrenci(String name,String ders_adi,int numara,int ortalama) {
        super(ders_adi);
		this.name=name;
		this.numara=numara;
		this.ortalama=ortalama;
		// TODO Auto-generated constructor stub
	}
		
	String name;
    String ders_adi;
	int numara;
	int ortalama;
	
	public void bilgi_yazdir(){System.out.println("isim: " + this.name + "num: " + this.numara + "not ort: " + this.ortalama);}
	public void ort_azalt(){this.ortalama=-5;}
	public void ort_artir(){this.ortalama=+5;}



	
	

}
