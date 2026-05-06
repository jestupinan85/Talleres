package pck;

public class laminas {
	int n_pegatina;
	String equipo;
	String jugador;
	boolean especial;
	public laminas(int n_pegatina, String equipo, String jugador, boolean especial) {
		this.n_pegatina = n_pegatina;
		this.equipo = equipo;
		this.jugador = jugador;
		this.especial = especial;
	}
	public int getN_pegatina() {
		return n_pegatina;
	}
	public void setN_pegatina(int n_pegatina) {
		this.n_pegatina = n_pegatina;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public String getJugador() {
		return jugador;
	}
	public void setJugador(String jugador) {
		this.jugador = jugador;
	}
	public boolean isEspecial() {
		return especial;
	}
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	

}
