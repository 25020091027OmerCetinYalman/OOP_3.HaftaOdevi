
package pkg10.bolum;

import java.util.Stack;
import java.util.Scanner;

public class Bolum10_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir pozitif tam sayi girin (orn: 120): ");
        int number = input.nextInt();
        
        Stack<Integer> factors = new Stack<>();
        int factor = 2;
        
        while (number > 1) {
            if (number % factor == 0) {
                factors.push(factor);
                number /= factor;
            } else {
                factor++;
            }
        }
        
        System.out.print("Asal carpanlar (Stack ile ters sirada): ");
        while (!factors.isEmpty()) {
            System.out.print(factors.pop() + " ");
        }
        System.out.println();
    }
}


