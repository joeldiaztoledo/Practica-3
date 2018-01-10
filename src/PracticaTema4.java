// Autor: Joel Díaz Toledo
public class PracticaTema4 {

	public static void main(String[] args) {
		
		System.out.println("El jugador 1 hace su lanzamiento:");
		int a = (int) Math.floor(Math.random()*(6)+1);
		System.out.println("Dado 1: " + a);
		int b = (int) Math.floor(Math.random()*(6)+1);
		System.out.println("Dado 2: " + b);
		
		System.out.println("El jugador 2 hace su lanzamiento:");
		int c = (int) Math.floor(Math.random()*(6)+1);
		System.out.println("Dado 1: " + c);
		int d = (int) Math.floor(Math.random()*(6)+1);
		System.out.println("Dado 2: " + d);
		
		int e = a + b;
		int f = c + d;
		int mayor = Math.max(e, f);
		System.out.println("La tirada mas alta es: " + mayor);
		
		if(e >= f) {
			if(e > f) {
				System.out.println("El ganador es el jugador 1.");
			}
			else {
				System.out.println("Empate. Ambos jugadores han sacado la misma jugada.");
			}
		}
		else {
			System.out.println("El ganador es el jugador 2.");
		}
		double suma = a + b + c + d;
		long media = Math.round(suma / 4);
		System.out.println("La media de los 4 dados es: " + media);
	}
}
