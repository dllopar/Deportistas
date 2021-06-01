package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	
	
	public Club(String string) {
		
		this.nombre = nombre;
		socios = new HashSet<>();
		competencias = new HashMap<>();
	}


	public void agregarDeportista(Corredor corredor) {
		
		socios.add(corredor);
		
	}


	public void agregarDeportista(Nadador nadador) {

		socios.add(nadador);
		
	}


	public void agregarDeportista(Ciclista ciclista) {

		socios.add(ciclista);
	}


	public void agregarDeportista(Triatleta triatleta) {

		socios.add(triatleta);
	}


	public Integer getCantidadSocios() {

		return socios.size();
	}


	public void agregarDeportista(Deportista celeste) {

		socios.add(celeste);
	}


	public void crearEvento(TipoDeEvento carreraNatacionEnAguasAbiertas, String nombreEvento) {
		
		Evento nuevoEvento = new Evento(carreraNatacionEnAguasAbiertas);

		competencias.put(nombreEvento, nuevoEvento );
	}


	public Object inscribirEnEvento(String string, Deportista deportista) {

		return null;
	}
	
}
