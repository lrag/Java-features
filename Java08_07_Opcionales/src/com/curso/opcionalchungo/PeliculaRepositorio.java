package com.curso.opcionalchungo;

public class PeliculaRepositorio {

	public OptionalChungo buscar(Integer id){
		switch(id){
			case 1 : 
				Direccion direccion = new Direccion("Salamanca", "Horno Segunda");
				Director director = new Director("Ridley Scott");
				director.setDireccion(direccion);
				Pelicula pelicula = new Pelicula(1, "Alien");
				pelicula.setDirector(director);
				return OptionalChungo.of(pelicula);
			case 2 : return OptionalChungo.of(new Pelicula(2,"Die Hard"));
			case 3 : return OptionalChungo.of(new Pelicula(3,"Bracula"));
			default: return OptionalChungo.empty();		
		}
	}

}


