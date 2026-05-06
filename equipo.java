package pck;

public class equipo {
	String nombre_equipo;
	String letras;
	String grupo;
	int cantidad;
	public equipo(String nombre_equipo, String letras, String grupo, int n_pegatinas, int cantidad) {
		super();
		this.nombre_equipo = nombre_equipo;
		this.letras = letras;
		this.grupo = grupo;
		this.cantidad=cantidad;
	}
	public String getNombre_equipo() {
		return nombre_equipo;
	}
	public void setNombre_equipo(String nombre_equipo) {
		this.nombre_equipo = nombre_equipo;
	}
	public String getLetras() {
		return letras;
	}
	public void setLetras(String letras) {
		this.letras = letras;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public int getCantidad() {
		return cantidad;
		
	public void setCantidad(int cantidad) {
		this.cantidad=cantidad;
	}
	}
	
}
//Cuantas laminas tengo(totales y de cada equipo), repetidas, no tengo, saber el equipo, archivos.
