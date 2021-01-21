package src;
/*190202018 Muhammed Enbiya Demir*/

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    
		Lisans ahmet =new Lisans("ahmet", "matematik", 190202019, 70);
		Doktora mehmet =new Doktora("mehmet", "yüksek mat", "doktora belgesi", 120202789, 95, 200, false);
		IdariPersonel burak=new IdariPersonel("burak", "burak@hotmail.com", 0, 300);
		
		mehmet.diploma_yazdir();
		System.out.println("mehmetin bursu: " +  mehmet.burs);
		mehmet.bursu_kes();
		System.out.println("mehmetin bursu: " +  mehmet.burs);

		ahmet.bilgi_yazdir();
		ahmet.ort_artir();
		ahmet.bilgi_yazdir();

		
		burak.bilgi_yazdir();
		burak.maas_artir();
		burak.bilgi_yazdir();
		
		
	}

}
