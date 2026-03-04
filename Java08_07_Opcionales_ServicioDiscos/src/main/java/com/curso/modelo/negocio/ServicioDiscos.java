package com.curso.modelo.negocio;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.curso.modelo.entidad.Disco;
import com.curso.modelo.persistencia.RepositorioDiscos;

@Service
@Transactional
public class ServicioDiscos {

	private RepositorioDiscos repositorioDiscos;

	public ServicioDiscos(RepositorioDiscos repositorioDiscos) {
		super();
		this.repositorioDiscos = repositorioDiscos;
	}
	
	public Disco insertar(Disco disco) {
		//LN para insertar
		repositorioDiscos.save(disco);
		return disco;
	}
	
	public Disco modificar(Disco disco) {
		//LN para modificar
		repositorioDiscos.save(disco);
		return disco;
	}
	
	public void borrar(Disco disco) {
		repositorioDiscos.delete(disco);
	}
		
	//
	//Recibimos un opcional y queremos quitarnoslo del medio
	//
	public Disco buscar_sin_opcional(Integer id) {
		
		//
		//Con código 'feo':
		/*
		Optional<Disco> discoOp = repositorioDiscos.findById(id);
		if(!discoOp.isPresent()) {
			return null;
		} 
		
		Disco disco = discoOp.get();
		disco.setTitulo(disco.getTitulo().toUpperCase());
		return disco;
		*/
		
		//
		//Utilizando el api del opcional
		//
		return repositorioDiscos
			.findById(id)
			.map( d -> {
				d.setTitulo(d.getTitulo().toUpperCase());
				return d;
			})			
			.orElse(null);
		
	}
	
	public Optional<Disco> buscar(Integer id) {
		
		//Esto aquí no sirve porque no estamos pasando el título a mayúsculas
		//return repositorioDiscos.findById(id);
		
		//Esto esta mal aunque funcione. No es declarativo-funcional
		/*
		Optional<Disco> discoOp = repositorioDiscos.findById(id);
		if(!discoOp.isPresent()) {
			return discoOp;
		}
		
		Disco disco = discoOp.get();
		disco.setTitulo(disco.getTitulo().toUpperCase());
		//return Optional.of(disco);
		return discoOp;
		*/

		return repositorioDiscos.findById(id)
			.map( d -> {
				d.setTitulo(d.getTitulo().toUpperCase());
				return d;
			});
	}
	
	
	
	
	
	
	
	
	public Optional<String> buscarTitulo(Integer id) {
		return repositorioDiscos
			.findById(id)
			.map( d -> d.getTitulo() );
	}
	
}
