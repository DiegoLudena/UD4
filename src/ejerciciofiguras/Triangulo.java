package ejerciciofiguras;

public class Triangulo extends Figura{
		private int ladoa;
		private int ladob;
		private int ladoc;
		private int altura;
		
		public Triangulo(String nombre, String color, double perimetro, double area, int ladoa, int ladob, int ladoc,
				int altura) {
			super(nombre, color, ladoa+ladob+ladoc, ladoa*altura/2);
			this.ladoa = ladoa;
			this.ladob = ladob;
			this.ladoc = ladoc;
			this.altura = altura;
		}

		public int getLadoa() {
			return ladoa;
		}

		public void setLadoa(int ladoa) {
			this.ladoa = ladoa;
		}

		public int getLadob() {
			return ladob;
		}

		public void setLadob(int ladob) {
			this.ladob = ladob;
		}

		public int getLadoc() {
			return ladoc;
		}

		public void setLadoc(int ladoc) {
			this.ladoc = ladoc;
		}

		public int getAltura() {
			return altura;
		}

		public void setAltura(int altura) {
			this.altura = altura;
		}
		
		public void tipoTriangulo() {
			if (this.getLadoa() == this.getLadob() && this.getLadoa() == this.getLadoc()) {
				System.out.println("Este triángulo es equilátero.");	
			}
			else if ((this.getLadoa() == this.getLadob() && this.getLadoa() != this.getLadoc()) || (this.getLadoa() != this.getLadob() && this.getLadoa() == this.getLadoc()) || (this.getLadob() == this.getLadoc() && this.getLadoa() != this.getLadoc())) {
				System.out.println("Este triángulo es isósceles.");	
			}
			else {}
				System.out.println("Este triángulo es escaleno.");	
		}
		
		
		
}
