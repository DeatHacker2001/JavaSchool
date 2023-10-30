package cadenas;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Ejercicio01 {
	public static void main(String[] args) {
		String[] aText = new String[3];
		String bblt = "AÄÁÂÀaàäáâÈËÉÊEeèëéêIÏÍÌÎïíìîiÖÓÒÔOóöòôoUÜÚÛÙuúüûù";
		Ejercicio01 ejc01 = new Ejercicio01();
		char chr[] = new char[bblt.length()];
		biblioteca(bblt, chr);
		ejc01.leerCadena(aText, chr);
	}

	public final void leerCadena(String aText[], char chr[]) {
		
		int numVocal[] = new int[3];
		int cont = 0;
		char utilChar[] = new char[3];
		int j;
		String dialog[] = new String[3];
		
		for (int i = 0; i < 3; i++) {
			aText[i] = JOptionPane.showInputDialog("Introduce 3 una cadena de caracteres");
			
			char chr1[] = new char[aText[i].length()];
			for ( j = 0;j < chr1.length; j++) {
				chr1[j] = aText[i].charAt(j);
				for (int k = 0; k < chr.length; k++) {
					if (chr1[j] == chr[k]) {
						utilChar[cont] = chr[k];
						numVocal[cont] = cont++;
						
					}
				}
				
			}
		}
		
		for (int k = 0; k < 3; k++) {
			dialog[k] = " Hay en " + aText[k] + " vocales : " + numVocal[k];
		}
		JOptionPane.showConfirmDialog(null, dialog);
	}
	
	private static void biblioteca(String bblt, char[] chr) {
		
		for (int i = 0; i < chr.length; i++) {
			chr[i] = bblt.charAt(i);			
		}
		
	}
	
}
