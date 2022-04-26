package geometria;

public class Circulo {
	// Atributos
		private double raio;
		private double pi = 3.14;
		private double raio2;
			
		// Métodos
		public void setRaio(double raio) {
			if (raio > 0) {
				this.raio = raio;
			}
		}	
		
		public double calculaArea() {
			raio2 = raio * raio;
			double area = raio2 * pi;
				
			return area; 
		}
		
		public void desenhar() {
			for (int i = 0; i < raio2; i++) {
				if(i == 1) {
					System.out.print("");
				} else if (i == raio2) {
					System.out.print("");
				} else {
					System.out.print(".");
				}
				for(int j = 0; j < raio2; j++) {
					if(i == 1) {
						System.out.print("");
					} else if (i == raio2) {
						System.out.print("");
					} else {
						System.out.print(".");
					}
				}
			}
		}	
}
