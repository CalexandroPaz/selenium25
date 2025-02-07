package miClaseObjetos;

public class DemoVehiculo {
	
	public static void main(String[] args) {
		
		Vehiculo miniVan = new Vehiculo();
		
		int rango;
		
		miniVan.pasajeros = 9;
		miniVan.capacidad = 15;
		miniVan.kmh = 20;
		
		rango = miniVan.capacidad * miniVan.kmh;
		System.out.println("La miniVan tiene una capacidad de: " + rango);
		
		System.out.println("**********************************************");
		
		Vehiculo carro = new Vehiculo();
		carro.pasajeros = 4;
		System.out.println("Numero de pasajeros en carro es: " + carro.pasajeros);
	}

}
