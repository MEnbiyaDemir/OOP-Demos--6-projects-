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

	 
	 // otoparktaki araç sayýsýný 1 artýracak, fueli ve speed i 0 yapacak license’i ise null
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


	 public void hýzlan(double hýzlanmaOraný){
		 if(hýzlanmaOraný>1 || hýzlanmaOraný<0){System.out.println("hizlanma oraný 0-1 arasýnda deðil. hiz degismedi");}
		 else{
		 speed=speed+speed*hýzlanmaOraný;
		 if(speed>300){System.out.println("hiz 300den yuksege cikti. hiz 300e sabitlendi");}}
	 }
	 
	 // yavasla metodunda yavaþlarken hýzýn 0 ýn altýna düþmediðinden emin olun. Düþerse 0 yapýn.
	 // yavaþlama oranýn (0-1] aralýðýnda olduðundan emin olun.
	 // bu þartlarý saðlamýyorsa hýz deðiþmeyecek ve ekrana hýz deðiþmedi yazýlacak.
	 public void yavasla(double yavaslamaOraný){
		 if(yavaslamaOraný>1 || yavaslamaOraný<0){System.out.println("yavaslama oraný 0-1 arasýnda deðil.");}
		 else {
		 speed=speed-speed*yavaslamaOraný;
		 if(speed<0){System.out.println("hýz 0in altina dustu. hiz 0a sabitlendi.");}}

	 }

	 // aracýn hýzýný 0 yapar.
	 // ekrana da hýz sýfýrlandý araç durdu yazar.
	 public void stop() {
		 speed=0;
		 System.out.println("hiz 0a sabitlendi. arac durdu");}
	 }
	
	
