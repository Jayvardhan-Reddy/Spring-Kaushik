package Passingattribute;

public class Appln {

	public static void main(String[] args) {
		Inheritint in = new TrailDTO();
		//Mydraw(in);
		Inheritint cir = new Circle();
		in.draw();
		Appln ap = new Appln();
		ap.Mydraw(in);
		ap.Mydraw(cir);
		
		cir.draw();
	}

	public void Mydraw(Inheritint inherit)
	{
		inherit.draw();
		
		
	}
	//public void 
	
}
