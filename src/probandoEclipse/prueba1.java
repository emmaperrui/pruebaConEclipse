package probandoEclipse;

import java.util.Scanner;


public class prueba1 {

	public static void main(String[] args) {
		boolean salir = false;
		int opcion = 0;
		
		Scanner leerNumerosIntroducidos = new Scanner(System.in);
		
		while(salir == false) {
			System.out.println("Introduzca un número por favor");
			int n1 = leerNumerosIntroducidos.nextInt();
			System.out.println("Intoruduzca otro número por favor");
			int n2 = leerNumerosIntroducidos.nextInt();
			int r = n1 + n2;
			System.out.println("El resultado de la suma es: " + r);
			
			int yes = 0;
			int no = 1;
			System.out.println("¿Desea continuar? " + "Seleccione " + yes + " Si desea continuar, " +" o "+ no + " si desea parar");
			int continuar = leerNumerosIntroducidos.nextInt();
		
			if(continuar >=1) {
				salir = true;
			}
			
		}
	}

}
