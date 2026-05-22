package pck;

public class Robot {
	private String nombre;
	private int posx;
	private int posy;
	private int energia;
	public Robot(String nombre) {
		this.nombre=nombre;
		this.posx=0;
		this.posy=0;
		this.energia=100;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPosx() {
		return posx;
	}
	public void setPosx(int posx) {
		this.posx = posx;
	}
	public int getPosy() {
		return posy;
	}
	public void setPosy(int posy) {
		this.posy = posy;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		if (this.energia-energia<0) {
			System.out.println("No hay energia suficiente");	
		}
		else {
			this.energia = this.energia-energia;
		}
		
	}
	public void mover(int dx, int dy) {
		if ((getPosx()+dx>10) || (getPosx()+dx<0) || (getPosy()+dy>10) || (getPosy()+dy<0)) {
			System.out.println("No se puede mover por encima de (10,10)");
		}
		else {
			setEnergia(10);
			setPosx(getPosx()+dx);
			setPosy(getPosy()+dy);	
		}
	}
	@Override
	public String toString() {
		return "Robot [Nombre=" + nombre + ", Posicion x=" + posx + ", Posicion y=" + posy + ", Energia=" + energia + "]";
	}
}
