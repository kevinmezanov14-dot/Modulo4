package f20260129;
import java.util.Scanner;
public class Captura {

	public static void main(String[] args) {
		// Scanner para capturar datos por consola
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese su nombre: ");
		String nombre= scanner.nextLine(); // capturar cadena de texto string
		System.out.printf("Hola %s%n", nombre); // imprimir nombre capturado
		scanner.close(); // cerrar scanner
	}

}
