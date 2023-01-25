package ejerciciofiguras;
//importo el Scanner para poder introducir datos, y MismatchException para poder evitar que se introduzcan letras en los menus
import java.util.Scanner;
import java.util.InputMismatchException;

public class ClasePrincipal {

	public static void main(String[] args) {
		menu();
	}
		public static void menu() {
			//No se si poner varios espacios es la mejor manera de dar formato al menu. \t deja un espacio demasiado grande para mi gusto.
			System.out.println("   FIGURAS PLANAS \n---------------------- \n1. Crear un triángulo \n2. Crear un rectángulo \n\n Escoge una opción:");
		
			Scanner scanner = new Scanner(System.in);
			int opcion = scanner.nextInt();
		
			try {
				switch (opcion) {
				case 1 :
					Triangulo miTriangulo = new Triangulo ("Triangulo", "Amarillo", 8, 8, 8, 6.93);
					miTriangulo.dime_caracteristicas();
					miTriangulo.tipoTriangulo();
					break;
				case 2:
					try {
						System.out.println("Indica el color del rectángulo:");
						String color = scanner.next();
						System.out.println("Indica la longitud de la base:");
						double base = scanner.nextDouble();
						//evito numeros negativos en la base y la altura
						while (base <=0) {
							System.out.println("Valor negativo no valido. Indica un número positivo:");
							base = scanner.nextDouble();
							}
						
						System.out.println("Indica la longitud de la altura:");
						double altura = scanner.nextDouble();
						while (altura <=0) {
							System.out.println("Valor negativo no valido. Indica un número positivo:");
							altura = scanner.nextDouble();
							}
						
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
						break;
					} catch (InputMismatchException e){
						System.out.println("No has introducido un numero. \nPorfavor introduce un numero");
						menu();
					}
					
				default: 
					System.out.println("Opción inválida");
					menu();
				}
			} catch (InputMismatchException e){ //con el try y catch evito que se introduzcan lertas en el menu
				System.out.println("No has introducido un numero. \nPorfavor introduce un numero");
				menu(); 
			}
	}

}
