package ejerciciofiguras;

import java.util.Scanner;

public class ClasePrincipal {

	public static void main(String[] args) {
		menu();
		
		Scanner scanner = new Scanner(System.in);
		int opcion = scanner.nextInt();
		
		switch (opcion) {
		case 1 :
			break;
		case 2:
			System.out.println("Indica el color del rectángulo:");
			String color = scanner.next();
			System.out.println("Indica la longitud de la base");
			double base = scanner.nextDouble();
			System.out.println("Indica la longitud de la altura");
			double altura = scanner.nextDouble();
			
			
			Rectangulo miRectangulo = new Rectangulo("Rectangulo", color, base, altura);
			if (miRectangulo.comprobarCuadrado() == true){
				miRectangulo.setNombre("Cuadrado");
				System.out.println("Es un " +miRectangulo.getNombre());
			}
			else {
				System.out.println("Es un " +miRectangulo.getNombre());
			}
			System.out.println("El área es " +miRectangulo.getArea() +"cm\u00B2.");
			System.out.println("El perímetro es " +miRectangulo.getPerimetro() +"cm.");		
			miRectangulo.dime_caracteristicas();
			break;
		default: 
			System.out.println("Opción inválida");
			menu();
		}
	}
	public static void menu() {
		System.out.println("   FIGURAS PLANAS \n----------------------");
		System.out.println("1. Crear un triángulo \n2. Crear un rectángulo \n\n Escoge una opción:");

	}

}
