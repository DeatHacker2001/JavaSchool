package cadenas;
import java.util.Scanner;
public class Ejercicio02Matriz {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] matriz;//Definimos una Matriz o un array bidimencional
		int filas = 3, column = 5; //Podemos ponerlas de un tamaño fijo pero 
		//^ Definimos variables v  
		int mayor , menor , numMayorF , numMenorF , numMayorC, numMenorC;
		

		System.out.println("Introduce la cantidad de filas");
		filas = Integer.parseInt(scn.nextLine()); //Pedimos un valor al usuario para el numero de filas
				
		System.out.println("Introduce la cantidad de columnas");
		column = Integer.parseInt(scn.nextLine()); //Pedimos un valor al usuario para el numero de columnas
			
		matriz = new int[filas][column];//Instanciamos la matriz o array pasandole como parametros los valores que el user introdijo
		for (int i = 0; i < matriz.length; i++) {//recorremos todo el array
			for (int j = 0; j < matriz[i].length; j++) {//recorremos las filas para saber la cantidad de columnas con un bucle anidado
				System.out.println("Introduce un valor para la posicion de la matriz fila " + i + " columna " + j );//Le mostramos al usuario la posicion en la que se encuentra nuestra matriz
				matriz[i][j] = Integer.parseInt(scn.nextLine());//EL usuario define un valor para esa posicion del array				
			}
		}
		
		//Ahora vamos a comparar todos los numeros introducidos por el usuario y vamos a definir el mayor valor
		//Le asignanmos un valor a las variables mayor y menor
		mayor = matriz[0][0];// ^
		menor = matriz[0][0];// ^
		
		//Le asignamos un valor a las variables restantes
		numMayorC = numMenorC = numMayorF = numMenorF = 0;
		
		//Recorremos nuevamente la matriz para comparar
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > mayor) {//cuando el numero encontrado sea mayor que el asignado
					mayor = matriz[i][j];//reasigna un nuevo valor a la variable
					numMayorF = i; //guarda el valor de "i" que vendria siendo la Fila
					numMayorC = j;//y "j" el valor de la Columna
				}else if (matriz[i][j] < menor) {//de lo contrario cuando el numero sea menor relizara la misma operacion pero para las variables repesentadas
					menor = matriz[i][j];
					numMenorF = i;
					numMenorC = j;
				}
			}
		}
		//Mostramos por pantalla el numero mayor, menor, y la fila y columna en la que se encuentra dichas variables
		System.out.println("El numero Mayor es :" + mayor + " y se encuentra en la fila " + numMayorF + " y la columna " + numMayorC + "\n"
				+ "El numero Menor es :" + menor + " y se encuentra en la fila " + numMenorF + " y la columna " + numMenorC);
		scn.close();
		
		
	}
}
