/*190202018 Muhammed Enbiya Demir*/


package src;

public class daire extends Sekil{
	
	int yaricap=1;
	
	public daire(int x,int y){
	    super(x,y);
		System.out.println("daire olusturuldu");
	}
	
	public daire(int x,int y,int yaricap){
	    super(x,y);
	    this.yaricap=yaricap;
		System.out.println("daire olusturuldu");
		
	}

	
	void sil(){
        Sekil.sil(this.varlikID);
    }	
	public void buyut(int k){this.yaricap=this.yaricap+k;}
	
	public float alan(){float alan=(float)((this.yaricap*this.yaricap)*3.14); return alan;}
	public float cevre(){float cevre=this.yaricap*2*3; return cevre;}



}
