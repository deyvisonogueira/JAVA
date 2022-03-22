
public class Principal {
	public static void main(String[] args) {

		// Teste da classe Retangulo
		Retangulo primeiroRetangulo = new Retangulo();
		primeiroRetangulo.setAltura(10);
		primeiroRetangulo.setBase(5);
		
		double areaPrimeiroRetangulo = primeiroRetangulo.calculaArea();
		System.out.println("Area retangulo: " + areaPrimeiroRetangulo);
		
		System.out.println("Desenho retangulo: ");
		primeiroRetangulo.desenhar();
	}
	
	
}

