
package pkg10.bolum;

import java.util.Stack;

public class Bolum10_6 {
    public static void main(String[] args) {
        Stack<Integer> primeStack = new Stack<>();
        
        for (int n = 2; n <= 120; n++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= Math.sqrt(n); divisor++) {
                if (n % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeStack.push(n);
            }
        }
        
        System.out.println("1 ile 120 arasindaki asal sayilar (Stack'ten tersten cikis):");
        while (!primeStack.isEmpty()) {
            System.out.print(primeStack.pop() + " ");
        }
        System.out.println();
    }
}
