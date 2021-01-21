package src;
/*190202018 Muhammed Enbiya Demir*/

public abstract class Personel extends Maas implements Kisi {

  
	public Personel(String name,String email,int maas_degeri,int numara) {
		super(maas_degeri);
		this.name=name;
		this.numara=numara;
        this.email=email;
		// TODO Auto-generated constructor stub
	}
	

	String name;
	String email;
	int numara;
	int maas_degeri;
	
	public void bilgi_yazdir(){System.out.println("isim: " + this.name + "num: " + this.numara + "maas: " + this.maas_degeri);}
	public void maas_artir(){this.maas_degeri=+100;}
	public void maas_azalt(){this.maas_degeri=-50;}

	
	
	
}
