package com;

import java.io.IOException;

public class Pruebas 
{
    @SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {

    	IO.println("--------------------------------------------------------------------------------------------");
    	com.modelo.entidad.PerroPolicia pp1 = new com.modelo.entidad.PerroPolicia("Rex",35d,0,100);

    	IO.println("--------------------------------------------------------------------------------------------");
    	try {
    		com.modelo.entidad.PerroPolicia pp2 = new com.modelo.entidad.PerroPolicia("Rex",35d,0,-1);
    	} catch (Exception e) {
    		IO.println(e.getMessage());
    	}
    	    	
    	IO.println("--------------------------------------------------------------------------------------------");
    	com.modelo.entidad_Java_25.PerroPolicia pp3 = new com.modelo.entidad_Java_25.PerroPolicia("Rex",35d,0,100);
    	
    	IO.println("--------------------------------------------------------------------------------------------");
    	try {
    		com.modelo.entidad_Java_25.PerroPolicia pp4 = new com.modelo.entidad_Java_25.PerroPolicia("Rex",35d,0,-1);
    	} catch (Exception e) {
    		IO.println(e.getMessage());
    	}
    	
    }

}

