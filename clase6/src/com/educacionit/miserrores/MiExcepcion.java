package com.educacionit.miserrores;

public class MiExcepcion extends Exception {


	private int codigoError;

	public MiExcepcion(int codigoError) {
		super();
		this.codigoError = codigoError;
	}

	@Override
	public String getMessage() {

		String mensaje = "";

		switch (codigoError) {
		case 111:
			mensaje="Error , el numero se encuentra entre 0 y 10";
			break;
			
		case 112:
			mensaje="Error , el numero se encuentra entre 11 y 20";
			break;
			
		case 113:
			mensaje="Error , el numero se encuentra entre 21 y 30";
			break;
		
		}
		
		return mensaje ;

	}

}
