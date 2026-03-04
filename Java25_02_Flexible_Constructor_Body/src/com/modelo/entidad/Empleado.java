package com.modelo.entidad;

public class Empleado extends Persona {

	private String departamento;

	public Empleado() {
		super();
	}

	public Empleado(String nombre, int edad) {
		super(nombre, edad);
		if(edad<16) {
			throw new RuntimeException("La edad del empleado no puede ser menor de 16");
		}		
	}

	public Empleado(String departamento) {
		super();
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado [departamento=" + departamento + "]";
	}
	
}
