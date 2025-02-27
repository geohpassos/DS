
package geovanna.metodo;

import java.util.Scanner;


public class Calculadora {
    
     Scanner x = new Scanner(System.in);
        
    
    void adicao() {
        
         Scanner x = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        int valor1 = x.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = x.nextInt();
        
        int resultado = valor1 + valor2;
        System.out.println("");
        System.out.println("O valor da soma é: "+resultado);
        System.out.println("");
    }
    void subtrair(){
         Scanner x = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        int valor1 = x.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        int valor2 = x.nextInt();
        
        int resultado = valor1 - valor2;
        
        
        System.out.println("O valor da subtração é: "+resultado);
        System.out.println("");
    }
    
    void multiplicacao(){
        Scanner x = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        int valor1 = x.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        int valor2 = x.nextInt();
        
        int resultado = valor1 * valor2;
        
        System.out.println("O valor da multiplicação é: "+resultado);
        System.out.println("");
            
        
    }
    
    void divisao(){
        Scanner x = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        int valor1 = x.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        int valor2 = x.nextInt();
        
        int resultado = valor1 / valor2;
        
        System.out.println("O valor da divisão é: "+resultado);
        System.out.println("");
        
    }
}
