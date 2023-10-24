package ejemplo6;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String play="PLAY", options="OPTIONS", exit="EXIT", text;
		boolean tonto, stone;
		

		System.out.println("___________________\n"
						 + "|                 |\n"
						 + "|      "+play+"       |\n"
						 + "|                 |\n"
						 + "|_________________|\n"
						 + "|                 |\n"
						 + "|    "+options+"      |\n"
						 + "|                 |\n"
						 + "|_________________|\n"
						 + "|                 |\n"
						 + "|      "+exit+"       |\n"
						 + "|                 |\n"
						 + "|-----------------|\n");
		System.out.println(""
				+ "_________________________\n"
				+ "|Whrite Play to continue|\n"
				+ "-------------------------");
		System.out.print(">");
		play = scn.nextLine();
		if (play.equalsIgnoreCase("play")) {
			System.out.println("\n"
					+ "___________________________\n"
					+ "| Welcome to KnigthTravel |\n"
					+ "---------------------------");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\n"
					+ "_________________________________________\n"
					+ "| Before to start I need know your name |\n"
					+ "-----------------------------------------");
			System.out.print(">");
			String name;
			name = scn.nextLine();
			
			System.out.println(""
					+ "______________________________________________________________\n"
					+ "| Once upon a time there was a brave warrior named "+name+",      \n"
					+ "| whose mental capacity to process data was in doubt,        |\n"
					+ "| during his expedition to Hortolefaxus he had a great idea! |\n"
					+ "--------------------------------------------------------------");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("______________________\n"
					 + "|                    |\n"
					 + "|    1.Do Nothing    |\n"
					 + "|                    |\n"
					 + "|____________________|\n"
					 + "|                    |\n"
					 + "|   2.Keep walking   |\n"
					 + "|                    |\n"
					 + "|____________________|\n"
					 + "|                    |\n"
					 + "|3.Try to eat a stone|\n"
					 + "|                    |\n"
					 + "|--------------------|\n");
			System.out.print(">");
			options = scn.nextLine();
			if (options.equalsIgnoreCase("1") || options.equalsIgnoreCase("Do Nothing")) {
				System.out.println("\n"
						+ "_______________________________________________\n"
						+ "| While you were doing nothing, a stray arrow |\n"
						+ "| pierced your head and left you one-eyed     |\n"
						+ "| and even dumber.                            |\n"
						+ "-----------------------------------------------");
				tonto = true;
			}else if (options.equalsIgnoreCase("2") || options.equalsIgnoreCase("Keep walking")) {
				System.out.println("\n"
						+ "________________________________________\n"
						+ "| You have gone on your way and        |\n"
						+ "| miraculously nothing has happened.   |\n"
						+ "----------------------------------------");
			}else if (options.equalsIgnoreCase("3") || options.equalsIgnoreCase("Try to eat a stone")) {
				System.out.println(""
						+ "___________________________________________________________________________________________________________\n"
						+ "| Your weak teeth due to lack of hygiene are breaking one by one in your desperate attempt to eat a stone |\n"
						+ "| after 2 hard hours you have lost all your teeth and finally you manage to swallow the stone,            |\n"
						+ "| luckily it was not so big and it was smooth,                                                            |\n"
						+ "| you manage to swallow it and you feel satisfied and full for GREAT ACHIEVEMENT!                         |\n"
						+ "-----------------------------------------------------------------------------------------------------------");
			}
			
			
			
		}else if (play.equalsIgnoreCase(options)) {
			System.out.println("\n"
					+ "_____________________________________\n"
					+ "| Sorry I dont have yet eny options |\n"
					+ "-------------------------------------");
		}else if (play.equalsIgnoreCase(exit)) {
			System.out.println("\n"
					+ "___________________________\n"
					+ "|    Good bye Mr.Beast    |\n"
					+ "---------------------------");
		}
		scn.close();
	}
}
