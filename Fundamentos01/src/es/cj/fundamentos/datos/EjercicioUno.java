package es.cj.fundamentos.datos;

import java.util.Scanner;

public class EjercicioUno {

	// Programa que realice la conversión de grados Celsius a Farenheit.
	// Los grados Celsius debe intruducirlos el usuario.
	//x1.8 + 32
	
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.println("Grados Celsius: ");
		double grados = sc.nextDouble();
		double fahrenheit = (grados * 1.8) + 32;
		System.out.println(grados + " grados Celsius son " + fahrenheit + " grados fahrenheit");		

	}

}

