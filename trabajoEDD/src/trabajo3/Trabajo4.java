
package trabajo3;

/**
 *
 * @author lolsn
 */
public class Trabajo4 {
    
    public static void main(String[] args) {
        int a = 23;
        int b = 3;
        int resultado = divide(a, b);
        System.out.println("La divicion de " + a + " entre " + b + " es: " + resultado);
    }
       public static int divide(int a, int b) {
        if (a >= b) {
            return 1 + divide(a - b, b);
        } else {
            return 0;
        }
    }
}

