package probandoEclipse;

import java.util.Scanner;


public class prueba3 {
static boolean salir = false;
static int min = Integer.MIN_VALUE;
static int max = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner leerNumerosIntroducidos = new Scanner(System.in);
		
		while(salir == false) {
			System.out.println("Introduzca un número por favor");
			int n1 = leerNumerosIntroducidos.nextInt();
			if(n1 > min){
				min = n1;
			}
			if(n1 < max) {
				max = n1;
			}
			int yes = 0;
			int no = 1;
			System.out.println("¿Desea continuar? " + "Seleccione " + yes + " Si desea continuar, " +" o "+ no + " si desea parar");
			int continuar = leerNumerosIntroducidos.nextInt();
				if(continuar >=1) {
					salir = true;
				}
		}

	
		System.out.println("El número mayor es: " + max);
		System.out.println("El número menor es: " + min);
	}

}
