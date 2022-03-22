
public class Retangulo {
		// Atributos
		private double base;
		private double altura;
		
		// Métodos
		public void setAltura(double altura) {
			if (altura > 0)
				{
				this.altura = altura;
				}
				}
		// Métodos
		public void setBase(double base) {
			if (base > 0)
				{
				this.base = base;
				}
		}
		
		public double calculaArea() {
			double area = base * altura;
			
			return area; 
		}
		
		public void desenhar() {
			for (int i = 0; i < base; i++) {
				System.out.print(". ");
				
				for (int j = 0; j < altura; j++) {
					if (i == 0 || i + 1 >= base) {
						System.out.print(". ");
					} else {
						System.out.print("  ");
					}
				}
				
				System.out.println(".");
			}
			
		}
	}