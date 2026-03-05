package com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Pruebas 
{
    public static void main(String[] args) throws IOException {
    	   
    	//
    	// Introducidas en Java 21
    	//    
    	
    	int _ = 5;
    	//System.out.println(_);
    	
    	System.out.println("==================================");
    	
    	List<String> palabras = List.of("uno", "dos", "tres", "cuatro", "cinco");
    	int total = 0;
    	for(@SuppressWarnings("unused") String palabra: palabras) {
    		total++;
    	}
    	System.out.println("Total: "+total);

    	// :)
    	for(String _ : palabras) {
    		total++;
    	}
    	System.out.println("Total: "+total);
    	
    	System.out.println("==================================");
    	
    	List<Punto> puntos = new ArrayList<>();
    	Queue<Integer> datos = getCola();
    	while(datos.size() >= 3) {
    		Integer x = datos.remove(); //Lanza excepción si no hay elemento. Poll devuelve nulo
    		Integer y = datos.remove();
    		//Esta variable no se utiliza, aunque le pongamos el @SuppressWarnings lo mismo sonar se queja
    		//@SuppressWarnings("unused")
    		//Integer z = datos.remove();
    		//
    		//Y si ignoramos el valor devuelto lo mismo sonar se queja igualmente 
    		datos.remove();
    		
    		Punto p = new Punto(x,y);
    		puntos.add(p);
    	}
    	
    	datos = getCola();
    	while(datos.size() >= 3) {
    		Integer x = datos.remove(); //Lanza excepción si no hay elemento. Poll devuelve nulo
    		Integer y = datos.remove();
    		//Pues ya estaría...
    		Integer _ = datos.remove();
    		
    		Punto p = new Punto(x,y);
    		puntos.add(p);
    	}
    	
    	System.out.println("==================================");
    	
    	try {
    		int n = 5;
    		System.out.println(n/0);
    	} catch (RuntimeException e) {
    		System.out.println("ZAS!");
    	}
    	
    	try {
    		int n = 5;
    		System.out.println(n/0);
    	} catch (RuntimeException _) {
    		System.out.println("ZAS!");
    	}
    	
    	System.out.println("==================================");
    	
    	Object obj = Integer.valueOf(10);
		String tipo = switch(obj) {
			case null       -> throw new RuntimeException("NULO");
			case Integer i  -> "Un integer es";
			case List lista -> "Una lista es";
			case String s   -> "Un string es";
			default         -> "Ni idea de lo que es";
		};
		System.out.println(tipo);
		
		tipo = switch(obj) {
			case null      -> throw new RuntimeException("NULO");
			case Integer _ -> "Un integer es";
			case List    _ -> "Una lista es";
			case String  _ -> "Un string es";
			default        -> "Ni idea de lo que es";
		};
		System.out.println(tipo);    	
    	
    }
    
    public static Queue<Integer> getCola(){
    	Queue<Integer> datos = new LinkedList<>();
    	datos.offer(1);
    	datos.offer(2);
    	datos.offer(3);
    	datos.offer(4);
    	datos.offer(5);
    	datos.offer(6);
    	return datos;
    }
    
    public static void movida(int n, String s) {
    	
    }

}

record Punto(Integer x, Integer y) {
}



