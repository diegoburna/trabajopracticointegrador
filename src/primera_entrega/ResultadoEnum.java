package modelo;


enum resultado{
	GANADOR,
	PERDEDOR,
	EMPATE;
}


public class ResultadoEnum {
	private  resultado  resultado;

	/**
	 * @param resultado
	 */
	public ResultadoEnum(modelo.resultado resultado) {
		this.resultado = resultado;
	}

	/**
	 * 
	 */
	public ResultadoEnum() {
	}

	public resultado getResultado() {
		return resultado;
	}

	public void setResultado(resultado resultado) {
		this.resultado = resultado;
	} 
	
}
