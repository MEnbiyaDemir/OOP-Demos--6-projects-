//Muhammed Enbiya Demir 190202018
// txt dosyas�nda ders isimlerinin icindeki bosluklar�n yerine "_" koyarak �al��t�rd�m

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

		
		
		//sonra Ogrenci s�n�f�nda ��rencinin ortalama notunu veren, ��rencininderslerini listeleyen
		
		File f=new File("ali_bilge.txt");
		
		try {
			BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream(f)));
		
			
		
		
		    char ch;
			int kod= reader.read();
			int count=0;  //txtde hangi bilginin okundu�unu anlamak i�in
			
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
				//ogrenci class� i�indeki list arrayine eklemeye �al��t���mda nullpointerexception hatas� al�yordum,�imdilik ��zemedim
				//bu y�zden en az�ndan quizin ba�ka bir amac� olan kelimeleri teker teker alma k�sm�n� yapt���m� g�stermek i�in
				//d�ng� i�inde a�a��daki �ekilde yazd�rd�m
				if(count==7){System.out.println(ad+donem+not); count=4;  ad=""; donem=""; not=""; }
			} 
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
		
		
		ali.bilgiyazdir();
		System.out.println("");
	}

}
