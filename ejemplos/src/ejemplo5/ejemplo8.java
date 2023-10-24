package ejemplo5;
import java.util.Scanner;
public class ejemplo8 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String num, /*num1,res*/  numI;		//para realizarlo de diferente forma tienes que cambiar el String por un int
		
		num = scn.nextLine(); // y cambiar el nextLine por el nextInt
		
		numI = new StringBuilder(num).reverse().toString();
		System.out.println("EL numero invertido es: " + numI);
		scn.close();
		
		
		/*num1 = num % 10;
		num = num / 10;
		res = num1 * 10 + num;
		System.out.println(res);*/
		
		
		
		
		scn.close();
        
		
	}
}
