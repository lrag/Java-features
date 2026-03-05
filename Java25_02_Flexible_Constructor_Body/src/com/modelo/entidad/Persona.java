package com.modelo.entidad;

public class Persona {

	protected String nombre;
	protected int edad;

	public Persona() {
		super();
		if(edad<0) {
			throw new RuntimeException("La edad no puede ser menor que cero");
		}		
	}

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
