
package cliclofor;
import java.util.Scanner;
/**
 *
 * @author josep
 */
public class ClicloFor {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int n = 0;
        int primero = 0;
        int segundo = 1;
        int fibo = 0;
        int i = 0;
        
        System.out.println("Ingrese el limite de la seria Fibonacci");
        n = leer.nextInt();
        System.out.println("\n");
        
        System.out.println(i +", " +primero);
        i = i + 1;
        System.out.println(i +", " +segundo);
        i = i + 1;
        for(i = 2; i<n; i++){
            
            
            fibo = primero + segundo;
            primero = segundo;
            segundo = fibo;
            
            System.out.println(i +", " +fibo);
        }
    }
}                   
    
    

