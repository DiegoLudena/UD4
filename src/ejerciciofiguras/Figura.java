package ejerciciofiguras;

public abstract class Figura {
	protected String nombre;
	protected String color;
	protected double perimetro;
	protected double area;
	
	//Constructor
	public Figura(String nombre, String color, double perimetro, double area) {
		this.nombre = nombre;
		this.color = color;
		this.perimetro = perimetro;
		this.area = area;
	}
	
	//getter y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	//metodo dime_caracteristicas()
	public void dime_caracteristicas() {
		System.out.println("Esta figura es un " + this.getNombre() +" de color " +this.getColor() + ". Su perímetro es de " +this.getPerimetro() +"cm, y su área es de " +this.getArea()+ "cm\u00B2");
	}

}
