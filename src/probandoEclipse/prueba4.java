package probandoEclipse;

import java.util.Scanner;
import java.lang.Math;

public class prueba4 {

	public static void main(String[] args) {
		boolean salir = false;
		Scanner leerNumerosIntroducidos = new Scanner(System.in);
		int numero, contador = 0;
		double aleatorio = 0;
		aleatorio = (int)(Math.random()*100);
		
		while(salir == false) {
		System.out.println("Introduzca un n�mero por favor");
		numero = leerNumerosIntroducidos.nextInt();
		
		if(numero < aleatorio) {
			System.out.print("El n�mero introducido es menor que el n�mero aleatorio, vuelva a intentarlo");
		}
		if(numero > aleatorio) {
			System.out.print("El n�mero introducido es mayor que el n�mero aleatorio, vuelva a intentarlo");
		}
		if(numero == aleatorio) {
			System.out.print("El n�mero introducido es igual que el n�mero aleatorio, enhorabuena!!!!");
		}
		int yes = 0;
		int no = 1;
		System.out.println("�Desea continuar? " + "Seleccione " + yes + " Si desea continuar, " +" o "+ no + " si desea parar");
		int continuar = leerNumerosIntroducidos.nextInt();
			if(continuar >=1) {
				salir = true;
			}
		}
	}

}
