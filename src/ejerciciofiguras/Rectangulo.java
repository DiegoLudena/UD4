package ejerciciofiguras;

public class Rectangulo extends Figura{
	private double base;
	private double altura;
	
	//Constructor
	
	public Rectangulo(String nombre, String color, double base, double altura) {
		super(nombre, color,2*base+2*altura, base*altura);
		this.base = base;
		this.altura = altura;
		
		}
	
	//getters y setters

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setPerimetro(double perimetro) {
		this.perimetro = 2*base+2*altura;
	}
	
	public void setArea(double area) {
		this.area = base*altura;
	}
	
	//metodo comprobarCuadrado. Comprueba si los lados son iguales o distintos y devuelve un booleano
	public boolean comprobarCuadrado() {
		if (this.getAltura() == this.getBase()){
			return true;
		}
		else {
			return false;
		}
	}
	
}
