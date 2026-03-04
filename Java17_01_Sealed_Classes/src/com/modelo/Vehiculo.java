package com.modelo;

import com.modelo.otroPaquete.Camion;
import com.modelo.otroPaquete.CamionArticulado;
import com.modelo.otroPaquete.Furgoneta;


//
//Definimos qué clases podrán heredar de Vehículo.
//sealed y permits no son palabras reservadas sino identificadores reservados
//
//
//Con las clases selladas podemos tener una clase con acceso público de la que pueden heredar
//otras situadas en distintos paquetes, manteniendo el control de cuáles son estas
//
//Las clases que hereden de una clase sellada han de ser finales o selladas a su vez
//
//Las clases 'permitted' deben estár en el mismo módulo
//
//Tambien en interfaces!
//
//No es obligatorio que una clase sellada sea abstracta
//
public abstract sealed class Vehiculo permits Coche, Camion, Furgoneta {	
	public abstract void arrancar();	
	
	public void movida() {
		
	}
	
}
