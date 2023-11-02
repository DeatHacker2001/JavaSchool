package cadenas;

public class EjerciciosArrays01 {
	public static void main(String[] args) {
		int [] enteros; //Definir Array
		enteros = new int[1 /*Le pasamos un valor para el tamaño*/]; //Instanciar Array
		int i = 0;
		String text = "Integer";
		char[] car = new char[10];
		String[] str = new String[1]; 
		long [] lon = new long[1];
		short [] sh = new short[1];
		
		//y asi con todos los tipos de variables existentes
		enteros[0] = 5;
		str[0] = "lol";
		lon[0] = 1000;
		sh[0] = 1;
		
		car = text.toCharArray();//convertir string a array de caracteres
		
		enteros[0] = (int)sh[0];
		System.out.println(car);
		
		while (car[i] != '\0') {
			System.out.println(car[i]);
			i++;
		}
		
//		for (i = 0; i < car.length; i++) {
//			System.out.println(car[i]);
//		}
		
		String text1 = new String(car);
		System.out.println(text1);
		
		
		
	}
}
