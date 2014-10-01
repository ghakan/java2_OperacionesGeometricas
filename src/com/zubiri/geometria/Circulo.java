/*
 * Clase para obtener resultados de distintas operaciones aritméticas.
 */

package com.zubiri.geometria;
public class Circulo {

	private float radio = 0;
	private float circu = 0;
	private float area = 0;

      public void setRadio(float num)
        {
              	this.radio = num;
		this.area = 3.14f * num * num;
		this.circu = 2 * 3.14f * num;
        }

 	public float getArea() {
        return area;
    }
 	public float getCircu() {
        return circu;
    }
}
