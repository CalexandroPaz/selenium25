package herencia;

public class Triangulo extends DosDimenciones{
	
	String estilo;
	
	double area() {
		return base * altura / 2;
	}
	
	void mostrarEstilo() {
		System.out.println("Triangulo es: " + estilo);
	}

}
