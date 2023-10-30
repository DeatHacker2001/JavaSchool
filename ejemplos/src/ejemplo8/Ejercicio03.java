package ejemplo8;

import java.util.Scanner;

public class Ejercicio03 {

	// Función para volter un número
	public static long voltea(long numero) {
		long resultado = 0;
		while (numero > 0) {
			resultado = resultado * 10 + numero % 10;
			numero /= 10;
		}
		return resultado;
	}

	// Función para comprobar si un número es capicúa
	public static boolean esCapicua(long numero) {
		return numero == voltea(numero);
	}

	// Función para contar el número de dígitos de un número
	public static int digitos(long numero) {
		int count = 0;
		while (numero > 0) {
			count++;
			numero /= 10;
		}
		return count;
	}

	// Función para obtener el dígito en una posición específica
	public static long digitoN(long numero, int posicion) {
		return (numero / (long) Math.pow(10, posicion)) % 10;
	}

	// Función para encontrar la posición de la primera ocurrencia de un dígito
	public static int posicionDeDigito(long numero, int digito) {
		String numeroStr = String.valueOf(numero);
		int posicion = numeroStr.indexOf(String.valueOf(digito));
		if (posicion == -1) {
			return -1;
		}
		return posicion;
	}

	// Función para quitar n dígitos por detrás (por la derecha)
	public static long quitaPorDetras(long numero, int n) {
		return numero / (long) Math.pow(10, n);
	}

	// Función para quitar n dígitos por delante (por la izquierda)
	public static long quitaPorDelante(long numero, int n) {
		String numeroStr = String.valueOf(numero);
		if (numeroStr.length() <= n) {
			return 0;
		}
		return Long.parseLong(numeroStr.substring(n));
	}

	// Función para añadir un número detrás de otro número
	public static long pegaPorDetras(long numero, long numeroAgregar) {
		return numero * (long) Math.pow(10, digitos(numeroAgregar)) + numeroAgregar;
	}

	// Función para añadir un número delante de otro número
	public static long pegaPorDelante(long numero, long numeroAgregar) {
		return numeroAgregar * (long) Math.pow(10, digitos(numero)) + numero;
	}

	// Función para obtener un trozo de número entre posiciones inicial y final
	public static long trozoDeNumero(long numero, int inicio, int fin) {
		String numeroStr = String.valueOf(numero);
		if (inicio < 0 || inicio >= numeroStr.length() || fin < 0 || fin >= numeroStr.length() || inicio > fin) {
			return 0;
		}
		return Long.parseLong(numeroStr.substring(inicio, fin + 1));
	}

	// Función para unir dos números
	public static long juntaNumeros(long numero1, long numero2) {
		return pegaPorDetras(numero1, numero2);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Introduce un numero:\n" + ">");
		long numero = scn.nextLong();
		long numero1 = numero;
		System.out.println("Número volteado: " + voltea(numero));
		System.out.println("¿Es capicúa? " + esCapicua(numero));
		System.out.println("Número de dígitos: " + digitos(numero));
		System.out.println("Digite una posicion");
		int p = scn.nextInt();
		System.out.println("Dígito en la posición "+p+" del numero introducido: " + digitoN(numero1, p));
		System.out.println("Dígito en la posición "+p+": del numero invertido" + digitoN(numero, p));
		System.out.println("Digite una numero para saber su posicion");
		int n = scn.nextInt();
		System.out.println("Posición del dígito "+n+" en el número introducido: " + posicionDeDigito(numero1, n));
		System.out.println("Posición del dígito "+n+" en el número invertido: " + posicionDeDigito(numero, n));
		System.out.println("Quitar 2 dígitos por detrás: " + quitaPorDetras(numero, 2));
		System.out.println("Quitar 2 dígitos por delante: " + quitaPorDelante(numero, 2));
		System.out.print("Introduce un numero para agregar por delante:\n" + ">");
		long numeroD = scn.nextLong();
		System.out.println("Añadir 678 por detrás: " + pegaPorDetras(numero, numeroD));
		System.out.print("Introduce un numero para agregar por detras:\n" + ">");
		long numeroT = scn.nextLong();
		System.out.println("Añadir 678 por delante: " + pegaPorDelante(numero, numeroT));
		System.out.println("Trozo entre posiciones 1 y 3: " + trozoDeNumero(numero, 1, 3));
		System.out.print("Introduce un numero para unir:\n" + ">");
		long numero2 = scn.nextLong();
		System.out.println("Unir números: " + juntaNumeros(numero, numero2));
		scn.close();
	}
}
