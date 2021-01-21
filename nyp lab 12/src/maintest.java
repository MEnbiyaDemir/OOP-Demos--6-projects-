//Muhammed Enbiya Demir 190202018
// txt dosyasýnda ders isimlerinin icindeki bosluklarýn yerine "_" koyarak çalýþtýrdým

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Ogrenci ali=new Ogrenci("", "", "");
		Ders list[] = new Ders[6];

		
		
		//sonra Ogrenci sýnýfýnda öðrencinin ortalama notunu veren, öðrencininderslerini listeleyen
		
		File f=new File("ali_bilge.txt");
		
		try {
			BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream(f)));
		
			
		
		
		    char ch;
			int kod= reader.read();
			int count=0;  //txtde hangi bilginin okunduðunu anlamak için
			
	        String ad="";
	        String donem="";
	        String not="";

			while(kod !=-1){
				ch=(char)kod;
				kod=reader.read();
				if(ch==' ' || ch=='\n'){count++;}
				if(count==0){ali.setAd(ali.getAd()+ch);}
				if(count==1){ali.setSoyAd(ali.getSoyAd()+ch);}
				if(count==2){ali.setOgrenciNo(ali.getOgrenciNo()+ch);}
				
				if(count==3){ad=ad+ch;}
				if(count==4 || count==5){donem=donem+ch;}
				if(count==6){not=not+ch;}
				//ogrenci classý içindeki list arrayine eklemeye çalýþtýðýmda nullpointerexception hatasý alýyordum,þimdilik çözemedim
				//bu yüzden en azýndan quizin baþka bir amacý olan kelimeleri teker teker alma kýsmýný yaptýðýmý göstermek için
				//döngü içinde aþaðýdaki þekilde yazdýrdým
				if(count==7){System.out.println(ad+donem+not); count=4;  ad=""; donem=""; not=""; }
			} 
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
		
		
		ali.bilgiyazdir();
		System.out.println("");
	}

}
