package ejemplo8;
		
import java.util.Scanner;
//En esta clase creamos un metodo para convertir un numero decimal a bin 
public class ejercicioasd {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);//Intanciamos el metodo scanner y le pasamos como parametros System.in
		
		System.out.println("Introduce un num"); //Mostramos por pantalla un mensaje
		int num = Integer.parseInt(scn.nextLine()); //Creamos una variable de tipo entero, le pasamos el parametro Integer .
		// el metodo parseInt para convertir el string que devuelve el metodo scn.nextLine a un entero menor que 15
		String a = binario(num); //definimos un string y guardamos el valor que retorna la funcion binario y le pasamos como parametro el numero que queremos convertir
		System.out.println(a); //imprimimos el resultado
		scn.close(); //cerramos el metodo scanner
		
//		como se llama el profe 
//		david carrion
//		ademas el apellido de este tio es carrillo XD
		
	}	
		
	private static String binario(int num) {//Creamos una funcion que devuelbe un String
		String bin = "";//definimos una variable string que recibe un valor vacio;
		
		for (int i = 0; i < 4 ; i++) {//inicializamos un bucle 
			
			if (num % 2 == 0) {//inicializamos una condicion mientras que el resto de la divicion de un numero entre 2 sea igual a 0
				bin = bin.concat("0"); //al string bin se le va a concatenar el valor 0
			}else if (num % 2 == 1) {//en caso de que el resto sea igual a 1
				bin = bin.concat("1");//se va a concatenar un 1
			}else if (num / 2 == 0) {//en caso de que el resultado final de la division sea cero
				bin = bin.concat("0");//se va a concatenar un 0
			}
			num/=2;//al finalizar la condicion se divide el numero entre 2
			
		}
		//Instanciamos la funcion StringBuilder que contiene un elemento que nos permite invertir una cadena y le pasamos como parametro el valor del string bin
		StringBuilder strB = new StringBuilder(bin);
		
		bin = strB.reverse().toString();//guardamos en el string bin el resultado del strB. el elementro reverse y lo convertimos a un string con la declaracion toString
		return bin;//retornamos el valor de bin
	}	
}		
