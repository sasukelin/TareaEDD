
package trabajo3;

/**
 *
 * @author lolsn
 */
public class trabajo1y2 {
    



    public static void main(String[] args) {
        int a = 23;
        int b = 3;
        int resultadoDelProducto = producto(a, b);
        System.out.println("El producto de " + a + " y " + b + " es: " + resultadoDelProducto);
        int numeroPotencia = potencia(a, b); 
        System.out.println("A el numero"+ a + "elevado a la " + b + " es: " + numeroPotencia);
    
    }

    public static int producto(int a, int b) {
        if (b == 0) {
            return 0;
        } 
        else {
            return a + producto(a, b - 1);
        }
    }

    public static int potencia(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * potencia(a, b - 1);
     }
 }
}