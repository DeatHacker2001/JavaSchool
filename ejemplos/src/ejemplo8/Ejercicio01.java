package ejemplo8;
import java.util.Scanner;
import javax.swing.*;

public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String moneda, cant;
		double conv, c;
		
		cant = JOptionPane.showInputDialog("Introduce una cantidad");
		c = Double.parseDouble(cant);
		
		sc.close();
	}
}
