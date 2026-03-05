package com.modelo.entidad;

import java.util.Objects;

public class Perro extends Animal {

	protected Integer numeroPulgas;

	public Perro() {
		super();
		IO.println("Perro()");
	}

	public Perro(String nombre, Double peso, Integer numeroPulgas) {
		super(nombre, peso);
		IO.println("Perro(String nombre, Double peso, Integer numeroPulgas)");
		
		if(numeroPulgas==null || numeroPulgas<0) {
			throw new RuntimeException("Numero de pulgas no puede ser menor que 0");
		}		

		this.numeroPulgas = numeroPulgas;
	}

	public Integer getNumeroPulgas() {
		return numeroPulgas;
	}

	public void setNumeroPulgas(Integer numeroPulgas) {
		this.numeroPulgas = numeroPulgas;
	}

	@Override
	public String toString() {
		return "Perro [numeroPulgas=" + numeroPulgas + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(numeroPulgas);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perro other = (Perro) obj;
		return Objects.equals(numeroPulgas, other.numeroPulgas);
	}

}
