package divisores;

/*
Ler um número inteiro N e calcular todos os seus divisores.
*/

import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um inteiro: ");
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                System.out.println(i);
            }
        }
        
    }
}
