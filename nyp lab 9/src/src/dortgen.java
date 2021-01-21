/*190202018 Muhammed Enbiya Demir*/


package src;

public class dortgen extends Sekil{
	
	int en=1,boy=1;
	
	public dortgen(int x,int y){
		super(x, y);
		System.out.println("dortgen olusturuldu");
		
	}
	public dortgen(int x,int y,int en,int boy){
		super(x,y);
		this.en=en;
		this.boy=boy;
		System.out.println("dortgen olusturuldu");
        
	}

	
	void sil(){
        Sekil.sil(this.varlikID);
    }	
	public float alan(){float alan=this.boy*this.en; return alan;}
	public float cevre(){float cevre=2*(this.boy+this.en); return cevre;}
	
	

}
