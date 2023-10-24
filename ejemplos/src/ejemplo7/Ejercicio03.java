package ejemplo7;

import java.util.Scanner;
import java.sql.Time;
import java.util.Random;


public class Ejercicio03 {
	static Scanner scn = new Scanner(System.in);
	static Random rnd = new Random();
	static String name;
	
	
	
	public static void main(String[] args) {
		Ejercicio04 ejc04 = new Ejercicio04();
		ViewScenne view = new ViewScenne();
		System.out.print("Hola bienvenido, introduce tu nombre a continuacion\r" + ">");
		name = ejc04.readLine(scn);
		gameStarted(view);
		
		
		
	}
	static void gameStarted(ViewScenne view) {
		
		view.showMontains(100);
		
		
		
	}
	public final void waitTime(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	
}
