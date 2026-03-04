package com;

import java.io.IOException;

public class _02_IO{
    public static void main(String[] args) throws IOException {
    	IO.println("HOLA RADIOLA...ESCRIBIENDO MENOS!");
    	
    	IO.println("Introduzca su nombre:");
    	String nombre = IO.readln();
    	String respuesta = IO.readln("\u00BFCu\u00E1l es la luz que alumbra las tinieblas? ");
    	
    	if(respuesta.equalsIgnoreCase("JAVA")) {
    		IO.print("EXCELENTE");
    	} else {
    		IO.print("Int\u00E9ntalo otra vez");
    	}
    	IO.println(", "+nombre);
    }
}

