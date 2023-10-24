package ejemplo6;


public class Ejercicio01 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 60; i++) {
			for (int j = 0; j < 60; j++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("min " + i + " seg " + j);
				
			}
			
		}
	}
}
