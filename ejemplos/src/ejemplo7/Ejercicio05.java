package ejemplo7;
import java.util.Iterator;
import java.util.Scanner;
public class Ejercicio05 {
public static void main(String[] args) {
	int num, num1;
	Scanner scn = new Scanner(System.in);
	num = scn.nextInt();
	suma(num);
}
public static void suma(int num) {
	
	for (int i = 0; i <= num; i++) {
		for (int j = 0; j < num; j++) {
			if (i*j==num) {
				System.out.println(j);
			}			
		}
	}

}
}
