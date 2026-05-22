package pck;

public class Principal {

	public static void main(String[] args) {
		Robot R1=new Robot ("Alex");
		Obrero R2=new Obrero ("Camilo");
		Explorador R3=new Explorador ("Aleja");
		
		System.out.println(R1.toString());
		R1.mover(2, 1);
		System.out.println(R1.toString());
		R1.mover(21, 55);
		System.out.println(R1.toString());
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//for (int i=0; i<10;i++) {
			//System.out.println("|  |  |  |  |  |");
			//System.out.println("|--|--|--|--|--|");


