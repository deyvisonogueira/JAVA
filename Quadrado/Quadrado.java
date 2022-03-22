package geometria;

import java.util.Scanner;

public class Quadrado {
	
	//Atributos
	private double lado;
	
	//Métodos
	public void setLado(double lado) {
		if(lado > 0) {
			this.lado = lado;
		}
	}
	
	public double calculaArea() {
		double area = lado * lado; //Calculando a area 
		return area; //retornando a area  
	}
		
}
