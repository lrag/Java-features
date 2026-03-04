package com.modelo.entidad_Java_25;

public class Empleado extends Persona {

	private String departamento;

	public Empleado() {
		super();
	}

	public Empleado(String nombre, int edad) {
		if(edad<16) {
			throw new RuntimeException("La edad del empleado no puede ser menor de 16");
		}		
		super(nombre, edad);
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
