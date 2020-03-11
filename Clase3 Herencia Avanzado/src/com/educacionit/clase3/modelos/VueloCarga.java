package com.educacionit.clase3.modelos;
//Clase hijo que hereda Vuelo
public class VueloCarga extends Vuelo{	
	public int asientos = 12 ;
	public float espacioMaximoDeCarga = 1000; //pies cubicos de espacio en la bodega
	public float espacioCargaUsado = 0; //utilizaremos esta variable para ver la cantidad 
	//de espacio que hemos usado en el avion .
	
	//implememntamos metodo abstracto de la clase padre
	public boolean agregarPasajeroConDiscapacidad(Passenger p1) {
		
		
		
		return true;
	}
	
	//metodo para agregar un paquete al avion , este metodo
	//recibira las dimenciones del paquete
	public void agregarPaquete(float altura , float ancho ,float profundidad) {		
		double size = altura * ancho * profundidad;
		//llamamos al metodo espacioDeCargaDisponible
		if( espacioDeCargaDisponible(size) ) {
			
			System.out.println("Se reservo espacio en la bodega del avion ");
			System.out.println("el tamanio del paquete es :" + size);
			espacioCargaUsado += size;
			//espacioCargaUsado = (float) (espacioCargaUsado + size);
			
		}else {				
			faltaEspacio();
		}		
	}	
	//metodo privado que me indica si poseo espacio suficiente para 
	//agregar el paquete en la bodega del avion 
	private boolean espacioDeCargaDisponible(double tamanio) {
		//boolean respuesta =  espacioCargaUsado + tamanio <= espacioCargaUsado;		
		return espacioCargaUsado + tamanio <= espacioMaximoDeCarga;
	}	
	private void faltaEspacio() {
		System.out.println("No tenemos mas espacio en la bodega , debera buscar otra empresa !");
	}
	//anottations
	@Override
	public int getAsiento() {
		return 12;
	}
	
	
}
