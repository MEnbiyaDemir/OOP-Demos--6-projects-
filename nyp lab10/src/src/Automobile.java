package src;

//Muhammed Enbiya Demir 190202018


public class Automobile implements Arac {
	 double fuel;
	 double speed;
	 String license;
	 long girisZamani;
	 
	 public double getFuel() {
			return fuel;
		}

		public void setFuel(double fuel) {
			this.fuel = fuel;
		}

		public double getSpeed() {
			return speed;
		}

		public void setSpeed(double speed) {
			this.speed = speed;
		}

		public String getLicense() {
			return license;
		}

		public void setLicense(String license) {
			this.license = license;
		}

		public long getGirisZamani() {
			return girisZamani;
		}

		public void setGirisZamani(long girisZamani) {
			this.girisZamani = girisZamani;
		}

	 
	 // otoparktaki ara� say�s�n� 1 art�racak, fueli ve speed i 0 yapacak license�i ise null
	 public Automobile(){
	 //doldur
		 this.fuel=0;
	     this.speed=0;
		 this.license=null;
	 }

	 public Automobile(double f, double s, String l)
	 {
	 //doldur
		 this.fuel=f;
		 this.speed=s;
		 this.license=l;
	 }
	 
	 public Automobile(String l) {
	 this.setLicense(l); 
	 }


	 public void h�zlan(double h�zlanmaOran�){
		 if(h�zlanmaOran�>1 || h�zlanmaOran�<0){System.out.println("hizlanma oran� 0-1 aras�nda de�il. hiz degismedi");}
		 else{
		 speed=speed+speed*h�zlanmaOran�;
		 if(speed>300){System.out.println("hiz 300den yuksege cikti. hiz 300e sabitlendi");}}
	 }
	 
	 // yavasla metodunda yava�larken h�z�n 0 �n alt�na d��medi�inden emin olun. D��erse 0 yap�n.
	 // yava�lama oran�n (0-1] aral���nda oldu�undan emin olun.
	 // bu �artlar� sa�lam�yorsa h�z de�i�meyecek ve ekrana h�z de�i�medi yaz�lacak.
	 public void yavasla(double yavaslamaOran�){
		 if(yavaslamaOran�>1 || yavaslamaOran�<0){System.out.println("yavaslama oran� 0-1 aras�nda de�il.");}
		 else {
		 speed=speed-speed*yavaslamaOran�;
		 if(speed<0){System.out.println("h�z 0in altina dustu. hiz 0a sabitlendi.");}}

	 }

	 // arac�n h�z�n� 0 yapar.
	 // ekrana da h�z s�f�rland� ara� durdu yazar.
	 public void stop() {
		 speed=0;
		 System.out.println("hiz 0a sabitlendi. arac durdu");}
	 }
	
	
