package modelo;

public class Partido {
	private Integer partido;
	private Equipo equipo1;
	private Equipo equipo2;
	int golesEquipo1;
	int golesEquipo2;

	public Partido(Integer partido, Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
		this.partido = partido;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
	}

	public Partido() {
		
	}

	public Integer getPartido() {
		return partido;
	}

	public void setPartido(Integer partido) {
		this.partido = partido;
	}

	public Equipo getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public Equipo getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	public int getGolesEquipo1() {
		return golesEquipo1;
	}

	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}

	public int getGolesEquipo2() {
		return golesEquipo2;
	}

	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}

	
	
	
}
