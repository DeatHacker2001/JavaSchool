package ejemplo8;

import java.util.Scanner;

public class ejercicioasd {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("asd");
		int num = Integer.parseInt(scn.nextLine());
		String a = binario(num);
		System.out.println(a);
		scn.close();
		

	}

	private static String binario(int num) {
		String bin = "", dig ="", bin1="",bin2="";
		for (int i = num; i > 0; i/=2) {
			
			if (i%2==1) {
				dig="0";
				dig= "1";
				bin1 = bin + dig;
			}else {
				bin="0";
				dig="0";
				bin2 = dig + bin;
			}
			
			
		}
		bin = bin1 + bin2;
		return bin;
	}
}
