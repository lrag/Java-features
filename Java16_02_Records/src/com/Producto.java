package com;

import java.util.Objects;

//Record con sobreescritura y métodos
public record Producto(Integer id, String nombre, String fabricante) {
	
	@Override
	public String toString() {
		return id+","+nombre+","+fabricante;
	}
	
	//Sobreescribiendo métodos accesores
	@Override
	public String nombre() {
		System.out.println("nombre() sobreescrito");
		return this.nombre;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(fabricante, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(fabricante, other.fabricante) && Objects.equals(id, other.id)
				&& Objects.equals(nombre, other.nombre);
	}
	
	public void metodo() {
		System.out.println("Método del record Producto");
	}
	
}
