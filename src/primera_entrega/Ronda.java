package modelo;

public class Ronda {
	private Integer nroRonda;
	private Partido partido;
	/**
	 * @param nroRonda
	 * @param partido
	 */
	public Ronda(Integer nroRonda, Partido partido) {
		this.nroRonda = nroRonda;
		this.partido = partido;
	}
	/**
	 * 
	 */
	public Ronda() {
	}
	public Integer getNroRonda() {
		return nroRonda;
	}
	public void setNroRonda(Integer nroRonda) {
		this.nroRonda = nroRonda;
	}
	public Partido getPartido() {
		return partido;
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
	}	
}
