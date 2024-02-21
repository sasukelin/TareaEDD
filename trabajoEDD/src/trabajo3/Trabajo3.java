
package trabajo3;

/**
 *
 * @author lolsn
 */
import java.util.Scanner;

public class Trabajo3 {

      
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número natural: ");
        int n = scanner.nextInt();
        int cantCifras = cantCifras(n);
        System.out.println("La cantidad de cifras del número " + n + " es: " + cantCifras);
    }
        public static int cantCifras(int n) {
        if (n > 0) {
            return 1 + cantCifras(n / 10);
        } else {
            return 0;
        }
    }
}

