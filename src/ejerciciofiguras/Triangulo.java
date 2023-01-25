package ejerciciofiguras;

public class Triangulo extends Figura{
		private double ladoa;
		private double ladob;
		private double ladoc;
		private double altura;
		
		public Triangulo(String nombre, String color, double ladoa, double ladob, double ladoc, double altura) {
			super(nombre, color, ladoa+ladob+ladoc, ladoa*altura/2);
			this.ladoa = ladoa;
			this.ladob = ladob;
			this.ladoc = ladoc;
			this.altura = altura;
		}

		public double getLadoa() {
			return ladoa;
		}

		public void setLadoa(double ladoa) {
			this.ladoa = ladoa;
		}

		public double getLadob() {
			return ladob;
		}

		public void setLadob(double ladob) {
			this.ladob = ladob;
		}

		public double getLadoc() {
			return ladoc;
		}

		public void setLadoc(double ladoc) {
			this.ladoc = ladoc;
		}

		public double getAltura() {
			return altura;
		}

		public void setAltura(double altura) {
			this.altura = altura;
		}
		
		public void tipoTriangulo() {
			if (this.getLadoa() == this.getLadob() && this.getLadoa() == this.getLadoc()) {
				System.out.println("Este triángulo es equilátero.");	
			}
			else if ((this.getLadoa() == this.getLadob() && this.getLadoa() != this.getLadoc()) || (this.getLadoa() != this.getLadob() && this.getLadoa() == this.getLadoc()) || (this.getLadob() == this.getLadoc() && this.getLadoa() != this.getLadoc())) {
				System.out.println("Este triángulo es isósceles.");	
			}
			else{
				System.out.println("Este triángulo es escaleno.");	
			}
		}
		
}
