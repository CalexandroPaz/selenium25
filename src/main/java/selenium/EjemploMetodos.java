package selenium;

public class EjemploMetodos {
	
	public static void main(String[] args) {
		
		int resultado = suma(2,80);
		System.out.println(resultado);
		
		int resultado2 = suma(5,5,5);
		System.out.println(resultado2);
		System.out.println(carro(3));
		ejemploVoid();
		
	}
	
	public static int suma(int a, int b) {
		int c = a+b;
		return c;
		
	
	}
	
	public static int suma(int a, int b, int c) {
		int d = a+b+c;
		return d;
	}
	
	public static String carro(int a) {
		String[] cars = {"Volvo", "BMW","Ford","Mazda"};
		return cars[a];
	}
	
	public static void ejemploVoid() {
		System.out.println("Hola metodo void");
	}


}
