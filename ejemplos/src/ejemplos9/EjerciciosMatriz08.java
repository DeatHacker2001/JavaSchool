package ejemplos9;

import java.util.Iterator;

public class EjerciciosMatriz08 {
	public static void main(String[] args) {
		
		final int EQUIPOS = 20, MIEMBROS = 10;
		String[] names = {"Denis" , "David" , "Nico" , "Dencer", "Roberto" , "Ricardo", "Ronaldo" , "Richard", "Lucas" , "Jhonathan"};
		String[] apellidos = {"Sánchez","Pérez","Gómez","Rodríguez","Fernández","García","López","Martínez","González","Torres"};
		String[] namesMasAltos = new String[EQUIPOS];
		String [][] equipos = new String[EQUIPOS][MIEMBROS];
		String jugMasAlto;
		float [][] altura = new float[EQUIPOS][MIEMBROS];
		float masAlto = 0;
		int cont = 0;
		float [] altos = new float[EQUIPOS];
		
		//Asigna Nombres y Alturas Aleatorias
		for (int i = 0; i < equipos.length; i++) {
			for (int j = 0; j < equipos[i].length; j++) {
				equipos[i][j] = names[(int)(Math.random()*(names.length - 0) + 0)] + " " + apellidos[(int)(Math.random()*(apellidos.length - 0) + 0)];
				altura[i][j] = (float)(Math.random()*(2-1)+1);
			}
		}
		
		//Guarda los mas altos de cada equipo 
		for (int i = 0; i < altura.length; i++) {
			for (int j = 0; j < altura[i].length; j++) {
				if (altura[cont][j] > altos[cont]) {
					altos[cont] = altura[i][j];
					namesMasAltos[cont] = equipos[i][j];
				}
				if (j == altura[i].length -1) {
					cont++;
				}
			}
		}
		
		//Muestra quienes son los mas altos de cada equipo y cual es su altura
		for (int i = 0; i < altos.length; i++) {
			System.out.println("El mas alto del equipo " + (i+1) + " es: \n" + namesMasAltos[i]);
			System.out.println("Con una altura de: \n" + altos[i] );
			System.out.println("----------------------\n");
		}
		
		//Calcula la media de cada uno de los equipos y la de todos los equipos
		float [] mediaDCada = new float[EQUIPOS];
		float media = 0;
		for (int i = 0; i < altura.length; i++) {
			for (int j = 0; j < altura[i].length; j++) {
				media += altura[i][j];				
			}
			media /= altura[i].length;
			mediaDCada[i] = media;
			media= 0;
		}
		
		cont = 1;
		for (float f : mediaDCada) {
			System.out.println("\nLa media del Equipo:\r" + cont + "\rEs de: \r" + f);
			cont++;
		}
		
		float medTotal = 0;
		for (int i = 0; i < mediaDCada.length; i++) {
			medTotal += mediaDCada[i];
		}
		medTotal /= mediaDCada.length;
		//System.out.println("La media total es de " + medTotal);
	}
}
