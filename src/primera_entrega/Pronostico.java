package modelo;

public class Pronostico {
	private Partido partido;
	private Equipo equipo;
	private ResultadoEnum resultado;
	/**
	 * @param partido
	 * @param equipo
	 * @param resultado
	 */
	public Pronostico(Partido partido, Equipo equipo, ResultadoEnum resultado) {
		this.partido = partido;
		this.equipo = equipo;
		this.resultado = resultado;
	}
	/**
	 * 
	 */
	public Pronostico() {
		
		
	}
	public Partido getPartido() {
		return partido;
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	public ResultadoEnum getResultado() {
		return resultado;
	}
	public void setResultado(ResultadoEnum resultado) {
		this.resultado = resultado;
	}
	
	
	
	
}
