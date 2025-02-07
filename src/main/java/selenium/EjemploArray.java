package selenium;

public class EjemploArray {
	
	public static void main(String[] args) {
		
		int intArray[];
		int[] intArray2;
		
		String[] arr;
		
		arr = new String[5];
		
		arr[0] = "cero";
		arr[1] = "uno";
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("El valor de indice" + i + ":" + arr[i]);
		}
	}

}
