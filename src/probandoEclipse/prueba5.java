package probandoEclipse;

import java.util.Scanner;

public class prueba5 {
	
	public void copiaArray() {
		Scanner numeroIntroducidoPorUsuario = new Scanner(System.in);
		
		System.out.print("Introduzca el tamaño del array por favor: ");
		int n = numeroIntroducidoPorUsuario.nextInt();
		
		int array1[] = new int [n];
		int array2[] = new int [n];
		
		for(int i = 0; i <= n; i++) {
            array1[n] = array2[n];
        }
		
	}

	public static void main(String[] args) {
		Scanner numeroIntroducido = new Scanner(System.in);
		
		System.out.print("Introduzca el tamaño del array por favor: ");
		int n = numeroIntroducido.nextInt();
		int array[] = new int [n];
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("Ingrese número " + (i + 1) +  ": ");
			array[i] = numeroIntroducido.nextInt();
		}
		int mayor, menor = 0;
		mayor = menor = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > mayor) {
				mayor = array[i];
			}
			if(array[i] < menor) {
				menor = array[i];
			}
		}
		System.out.println("El mayor tamaño del array es: " +  mayor);
		System.out.println("El menor tamaño del array es: " + menor);
		
		
	}
	
	public void invertirArray() {
		
		int numeros[] = {1, 2, 3, 4, 5};
		int aux[] = new int[numeros.length];
		
		for(int i = numeros.length-1, j = 0; i >= 0; i--, j++) {
			aux[j] = numeros[i];
			System.out.print(aux[j]);
			
		}
		
	}
	
	public void sumarDosArray() {
		double arrayParaSuma [] = {1.2, 8, 7, 5.9};
		double total = 0; 
		
		for(double i = 0; i > arrayParaSuma.length; i++) {
			
		}
		System.out.println("La suma total del array es: " +  total);
		
	}

}
