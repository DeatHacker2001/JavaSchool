package cadenas;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Espejo {
	public static void main(String[] args) {

		String str;
		str = JOptionPane.showInputDialog("Introduce una palabra");
		StringBuilder strB = new StringBuilder(str);
		readVoc(str);
		JOptionPane.showMessageDialog(null, revers(strB, str));
		JOptionPane.showMessageDialog(null, mirror(str));

	}
	
	public static void readVoc(String str) {
		boolean isVocal = false;
		int cont = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.contains("aeiouáéíóúAEIOUÁÉÍÓÚ")) {
				isVocal = true;
				cont++;
			}			
		}
		JOptionPane.showMessageDialog(null, str + cont);
	}

	private static String revers(StringBuilder strB,String str) {		
		str = strB.reverse().toString();
		return str;
	}
	
	private static String mirror(String str) {
		char firstChar;
		String str1 = str;
		
		firstChar = str1.charAt(0);
		str1 = str1.replace(firstChar, '\0');
		str = str1.concat(str1);		
		return str;
	}
	
}
