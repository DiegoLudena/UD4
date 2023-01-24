package ejerciciofiguras;

public class Rectangulo extends Figura{
	private double base;
	private double altura;
	
	
	public Rectangulo(String nombre, String color, double base, double altura) {
		super(nombre, color,2*base+2*altura, base*altura);
		this.base = base;
		this.altura = altura;
		
		}

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
	
	public boolean comprobarCuadrado() {
		if (this.getAltura() == this.getBase()){
			return true;
		}
		else {
			return false;
		}
	}
	
}
