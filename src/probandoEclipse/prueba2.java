package probandoEclipse;

import java.util.Scanner;

public class prueba2 {

	public static void main(String[] args) {
		Scanner numeros = new Scanner(System.in);
		
		int contadorDeNumerosPositivos = 0;
		int contadorDeNumerosNegativos = 0;
		int contadorDe0 = 0;
		boolean salir = false;
		
		while(salir == false) {
			System.out.println("Introduzca un número por favor");
			int numeroIntroducido = numeros.nextInt();
			
			if(numeroIntroducido > 0) {
				contadorDeNumerosPositivos++;
			}
			if(numeroIntroducido < 0) {
				contadorDeNumerosNegativos++;
			}
			if(numeroIntroducido == 0) {
				contadorDe0++;
			}
			int yes = 0;
			int no = 1;
			System.out.println("¿Desea continuar? " + "Seleccione " + yes + " Si desea continuar, " +" o "+ no + " si desea parar");
			int continuar = numeros.nextInt();
				if(continuar >=1) {
					salir = true;
				}
		
			}
		System.out.println("La cantidad total de números positivos es de: " + contadorDeNumerosPositivos);
		System.out.println("La cantidad total de números negativos es de: " + contadorDeNumerosNegativos);
		System.out.println("La cantidad total de 0 es de: " + contadorDe0);
	}

}
