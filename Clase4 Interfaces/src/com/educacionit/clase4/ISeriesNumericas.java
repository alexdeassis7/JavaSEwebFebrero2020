package com.educacionit.clase4;

public interface ISeriesNumericas {
	// Conjunto de metodos abstractos que implicitamente son public
	// metodo default : a partir de la JDK 1.8
	// permite dar un unico comportamiento

//	default int getSiguiente() {
//		return 0 ;
//	}

	// retorna el siguiente de la serie
	int getSiguiente();

	// reinicia la serie
	void reiniciar();

//	establece un valor inicial a la serie 
	void setComenzar(int x);

}
