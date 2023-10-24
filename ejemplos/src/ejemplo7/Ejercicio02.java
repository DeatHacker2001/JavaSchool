package ejemplo7;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio02 {
	static Scanner scn = new Scanner(System.in);
	static Random rnd = new Random();

	public static void main(String[] args) {
		Ejercicio02 ejrc02 = new Ejercicio02();

		ejrc02.game();

		scn.close();
	}

	private void game() {
		float sueldo = 0.10f, trabS, horsT = 0, dineroE = 0, presJug = 20;
		int trab, totalTrabs = 0, hors, diasT, trabD = 0, trabM = 0, tiemp = 2000;
		String text;

		while (presJug >= 0) {

			System.out.print(
					"Cauntos trabajadores quieres contratar para tu empresa? \n Ten en cuenta que tu presupuesto es de "
							+ presJug + "€ y contratar a cada programador te cuesta 1€\r" + ">");
			trab = Integer.parseInt(scn.nextLine());
			totalTrabs = totalTrabs + trab;
			if (trab > presJug) {
				System.out.println("Tu presupuesto es muy bajo solo tienes" + presJug);
				return;
			} else {
				presJug = presJug - trab;
			}

			for (int i = 0; i <= totalTrabs; i++) {

				diasT = rnd.nextInt(5);
				if (diasT != 0) {
					for (int j = 1; j <= diasT; j++) {
						hors = rnd.nextInt(8);
						horsT = horsT + hors;
					}
				}
				try {
					Thread.sleep(tiemp);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				trabS = horsT * sueldo;
				if (diasT >= 1 && horsT > 0) {
					text = "El trabajador " + i + " asistio al trabajo " + diasT + " dias, y trabajo un total de "
							+ horsT + " horas, para un sueldo final de " + trabS + "€";
					dineroE = trabS + dineroE;

				} else {
					text = "El trabajador " + i + " ha sido despedido.";
					trabD++;
					totalTrabs--;
				}
				if (horsT >= 25) {
					text = text + " ¡Trabajor de la semana!";
					trabM++;
				}
				System.out.println(text);
				horsT = 0;
			}
			double porc = trabD * 100 / trab;
			presJug = presJug + dineroE;
			System.out.println("\nLa empresa esta semana pago a todos sus trabajadores un total de " + dineroE + "€");

			System.err.println("\nLa empresa esta semana despidio a " + trabD + " trabajadores para un porcentaje del "
					+ porc + "%" + " tienes " + totalTrabs + " trabajadores");
			System.err.println("\nLa empresa esta semana tiene " + trabM + " trabajadores ejemplares");
			System.out.println("\nLos trabajadores han generado " + dineroE + " para un total de " + presJug + "€");
		}

	}
}
