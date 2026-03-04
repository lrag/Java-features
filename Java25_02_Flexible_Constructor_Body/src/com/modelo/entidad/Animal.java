package com.modelo.entidad;

import java.util.Objects;

public class Animal {

	protected String nombre;
	protected Double peso;

	public Animal() {
		super();
		IO.println("Animal()");
	}

	public Animal(String nombre, Double peso) {
		super();
		IO.println("Animal(String nombre, Double peso)");

		if(nombre==null || nombre.trim().length() == 0) {
			throw new RuntimeException("Nombre obligatorio");
		}
		if(peso==null || peso<=0) {
			throw new RuntimeException("Peso debe de ser mayor que 0");
		}
		
		this.nombre = nombre;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", peso=" + peso + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, peso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(peso, other.peso);
	}

}
