package com;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Pruebas {

	public static void main(String[] args) throws Exception {
		
		//
		//Los records fueron introducidos de forma experimental en Java 14
		//	
		
		//Los objetos de tipo record son inmutables
		//Por defecto incluyen únicamente un constructor con parámetros
		System.out.println("=====================================");
		Cliente c = new Cliente(1,"Bud Spencer","Strada del guantazi","123456789");
		System.out.println(c);
		
		//No siguen la especificación Java bean para los métodos accesores!
		System.out.println(c.id());
		System.out.println(c.nombre());
		System.out.println(c.direccion());
		System.out.println(c.telefono());
		
		//Constructores compactos
		System.out.println("=====================================");
		try {
			Coche ch1 = new Coche(1,null,"","");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		Coche ch1 = new Coche(1,"aaa","bbb","ccc");
		System.out.println(ch1);
		
		//Podemos sobreescribir métodos
		System.out.println("=====================================");
		Producto p1 = new Producto(1,"Fleje","Ibérica de Flejes S.A.");
		Producto p2 = new Producto(1,"Fleje de primera calidad","Ibérica de Flejes S.A.");
		System.out.println(p1);
		System.out.println(p1.equals(p2));
		//E incluir otros (si es que tiene sentido)
		p1.metodo();
		System.out.println(p1.nombre());
		
		//Los record son objetos
		Object obj = p1;
		if(obj instanceof Producto p3) {
			System.out.println(p3.nombre()+", "+p3.fabricante());
		}

		System.out.println("=====================================");
		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writeValueAsString(c);
		System.out.println(json);
		
	}
	
}


