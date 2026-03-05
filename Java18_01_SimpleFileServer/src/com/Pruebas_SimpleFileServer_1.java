package com;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.file.Path;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.SimpleFileServer;

public class Pruebas_SimpleFileServer_1 {
	
	//Solo GET y HEAD
	//Ignora query parameters
	

	public static void main(String[] args) throws IOException {
	    InetSocketAddress address = new InetSocketAddress(1880);
	    Path path = Path.of("D:/paginas");
	    HttpServer server = SimpleFileServer.createFileServer(address, path, SimpleFileServer.OutputLevel.VERBOSE);
	    
	    HttpHandler handler = SimpleFileServer.createFileHandler(Path.of("D:/paginas-2"));
	    server.createContext("/cosas", handler);
	    
	    server.start();
	}	
	
}


