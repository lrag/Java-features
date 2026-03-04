
//El fichero tiene que llamarse module-info.java y estar en el raíz del claspath
module java09_03_Modulos {

	//requires y exports no son palabras reservadas
	requires java.base; //Incluido por defecto
	requires java.sql;
	requires java.desktop; //Para aplicaciones de escritorio con swing
	requires java.naming; //Para el directorio JNDI
	
	exports com; //No se exportan los subpaquetes
	
}




