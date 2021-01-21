package src;
/*190202018 Muhammed Enbiya Demir*/

public abstract class Lisansustu extends Ogrenci {
	
	String diploma;
	int burs;
	boolean mezun=false;
	
	public void bursu_kes(){System.out.println("burs kesildi.");
		this.burs=0;}
	public void mezun_et(){		System.out.println("mezun edildi");

		this.mezun=true;}
	public void diploma_yazdir(){System.out.println("Diploma: " + this.diploma);}
	
	

	
	public Lisansustu(String name, String ders_adi,String diploma, int numara, int ortalama,int burs,boolean mezun) {
		super(name, ders_adi, numara, ortalama);
		this.diploma=diploma;
		this.mezun=mezun;
		this.burs=burs;
		// TODO Auto-generated constructor stub
	}

	


}
