package ar.edu.unlam.pb2.eva03;

public class Corredor extends Deportista{

	private Integer distanciaPreferida;
	private Integer kilometrosEntrenados;

	public Corredor(Integer numeroDeSocio, String nombre, Integer distanciaPreferida) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida = distanciaPreferida;
		kilometrosEntrenados = 0;
	}

	public void setCantidadDeKilometrosEntrenados(Integer kilometros) {

		kilometrosEntrenados = kilometros;
	}

	public Integer getDistanciaPreferida() {
		// TODO Auto-generated method stub
		return distanciaPreferida;
	}

	public Integer getCantidadDeKilometrosEntrenados() {
		// TODO Auto-generated method stub
		return kilometrosEntrenados;
	}

	public Integer getNumeroDeSocio() {
		// TODO Auto-generated method stub
		return super.getNumeroDeSocio();
	}

}
