package com.curso.finalize;

import java.io.FileWriter;
import java.net.Socket;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ClaseConFinalize {

	private List<Integer> lista = new ArrayList<>(100_000);
	
	private FileWriter fw;
	private Socket sk;
	private Connection cx;

	@Override
	public void finalize() {
		
		Object obj;
		
		System.out.println("Adios mundo cruel. ("+Thread.currentThread().getName()+")");
		try {
			//fw.close();
			//sk.close();
			//cx.close();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		
}
