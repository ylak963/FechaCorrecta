package es.studium.FechaCorrecta;

import java.util.Scanner;

public class FechaCorrecta {

	public static void main(String[] args) {
		int anio, mes, dia;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indique un n�mero correspondiente al dia: ");
		dia =teclado.nextInt();
		System.out.println("Indique un n�mero correspondiente al mes: ");
		mes=teclado.nextInt();
		System.out.println("Indique un n�mero correspondiente al anio: ");
		anio=teclado.nextInt();
		teclado.close();
		
		if(anio%4==0 && anio%100!=0 || anio%400==0) {
			System.out.println("El a�o es bisiesto.");
		}
		else {
			System.out.println("El a�o no es bisiesto");
		}

	}

}
