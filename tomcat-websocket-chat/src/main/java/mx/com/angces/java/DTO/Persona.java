package mx.com.angces.java.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Persona {

	@JsonProperty
	private String nombre;
	
	@JsonProperty
	private String apellidoPaterno;
	
	@JsonProperty
	private String apellidoMaterno;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	
}
