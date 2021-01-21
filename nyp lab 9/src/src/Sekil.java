/*190202018 Muhammed Enbiya Demir*/


package src;

import java.util.ArrayList;

public abstract class Sekil {
	
	int x,y;
    int varlikID=0;
	static ArrayList<Sekil> sekilist=new ArrayList<Sekil>();

	
	public Sekil(int x,int y){
		this.x=x;
		this.y=y;
		sekilist.add(this);
		varlikID++;
	}
	
	public static void sil(int id){sekilist.remove(id);}

	
	public void listele(){
		for(Sekil i:sekilist) {
		System.out.println(i.varlikID + ". siradaki sekil.");
		System.out.println("Sekil sinifi: " + i.getClass().getName());
		System.out.println("x: " + i.x);
		System.out.println("y: " + i.y); }
		}
	
	public void enUst(){
		System.out.println("EnUst:");
		System.out.println("X:" + sekilist.get(sekilist.size()-1).x);
		System.out.println("Y:" + sekilist.get(sekilist.size()-1).y);
		System.out.println("X:" + sekilist.get(sekilist.size()-1).alan());
		System.out.println("X:" + sekilist.get(sekilist.size()-1).cevre());

	}


	
	public float alan(){
		return 0;}
	public float cevre(){
		return 0;}


}
