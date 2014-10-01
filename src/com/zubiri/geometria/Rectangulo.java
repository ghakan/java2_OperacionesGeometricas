
package com.zubiri.geometria;
public class Rectangulo {

	private double altura = 0;

	private double base = 0;


	public double area() {

		double result;
		
		result = this.getBase() * this.getAltura();
		return result;
	}

	public double perimetro() {

		double result;

		result = 2 * this.getBase() + 2 * this.getAltura();

		return result;
	}

	public double getAltura() {

		return altura;
	}	
	public double getBase() {

		return base;
	}	

	public void setAltura(double num) {

		altura = num;
	} 

	public void setBase(double num) {

		base = num;
	} 
}
