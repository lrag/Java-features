package com.modelo.entidad;

import java.util.Objects;

public final class PerroPolicia extends Perro {

	private Integer numeroCasosResueltos;

	public PerroPolicia() {
		super();
		IO.println("PerroPolicia()");
	}

	public PerroPolicia(String nombre, Double peso, Integer numeroPulgas, Integer numeroCasosResueltos) {
		super(nombre, peso, numeroPulgas);
		IO.println("PerroPolicia(String nombre, Double peso, Integer numeroPulgas, Integer numeroCasosResueltos)");
		
		if(numeroCasosResueltos==null || numeroCasosResueltos<0) {
			throw new RuntimeException("Numero de casos resueltos no puede ser menor que 0");
		}			
		
		this.numeroCasosResueltos = numeroCasosResueltos;
	}

	public Integer getNumeroCasosResueltos() {
		return numeroCasosResueltos;
	}

	public void setNumeroCasosResueltos(Integer numeroCasosResueltos) {
		this.numeroCasosResueltos = numeroCasosResueltos;
	}

	@Override
	public String toString() {
		return "PerroPolicia [numeroCasosResueltos=" + numeroCasosResueltos + ", numeroPulgas=" + numeroPulgas
				+ ", nombre=" + nombre + ", peso=" + peso + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(numeroCasosResueltos);
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
		PerroPolicia other = (PerroPolicia) obj;
		return Objects.equals(numeroCasosResueltos, other.numeroCasosResueltos);
	}

}
