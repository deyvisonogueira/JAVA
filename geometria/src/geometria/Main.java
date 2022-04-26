package geometria;

public class Main {
	
	public static void main(String[] args) {
	// Teste da classe Quadrado
	Quadrado primeiroQuadrado = new Quadrado();
	primeiroQuadrado.setLado(15);
	
	double areaPrimeiroQuadrado = primeiroQuadrado.calculaArea();
	System.out.println("Area quadrado: " + areaPrimeiroQuadrado);
	
	System.out.println("Desenho quadrado: ");
	primeiroQuadrado.desenhar();
	
	// Teste da classe Retangulo
	Retangulo primeiroRetangulo = new Retangulo();
	primeiroRetangulo.setAltura(15);
	primeiroRetangulo.setBase(10);
				
	double areaPrimeiroRetangulo = primeiroRetangulo.calculaArea();
	System.out.println("Area retangulo: " + areaPrimeiroRetangulo);
				
	System.out.println("Desenho retangulo: ");
	primeiroRetangulo.desenhar();
	
	// Teste da classe Triangulo
	Triangulo primeiroTriangulo = new Triangulo();
	primeiroTriangulo.setBase(10);
	primeiroTriangulo.setAltura(15);
				
	double areaPrimeiroTriangulo = primeiroTriangulo.calculaArea();
	System.out.println("Area triangulo: " + areaPrimeiroTriangulo);
				
	System.out.println("Desenho triangulo: ");
	primeiroTriangulo.desenhar();
	
	// Teste da classe Circulo
	Circulo primeiroCirculo = new Circulo();
	primeiroCirculo.setRaio(12);
				
	double areaPrimeiroCirculo = primeiroQuadrado.calculaArea();
	System.out.println("Area circulo: " + areaPrimeiroCirculo);
				
	System.out.println("Desenho circulo: ");
	primeiroCirculo.desenhar();
	}
}
