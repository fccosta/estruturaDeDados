/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados.tad.testepilha;

import estruturadedados.tad.pilha.StackGe;
import java.util.Scanner;

/**
 *
 * @author Genildo Ferreira
 */
public class StackGeTest {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        StackGe pilha = new StackGe(5);
       
        System.out.printf("Verificando de a pilha está vazia: ");
        System.out.println(pilha.isEmpty());
        System.out.printf("Verificando de a pilha está cheia: ");
        System.out.println(pilha.isFull());
        System.out.printf("Tamanho da pilha:");
        System.out.println(pilha.size());
        System.out.printf("Elemento no topo da pilha: ");
        System.out.println(pilha.top());
        
        System.out.printf("digite um numero inteiro: \n");
        int valueInt = in.nextInt(); 
        System.out.printf("Inserindo elemento, %d na pilha \n",valueInt);
        pilha.push(valueInt);
        
        System.out.printf("digite um numero do tipo double: \n");
        double valueDouble = in.nextDouble();        
        System.out.printf("Inserindo elemento, %f na pilha \n",valueDouble);
        pilha.push(valueDouble);
        
        System.out.printf("digite um valor do tipo string: \n");
        String valueString = in.next( );
        System.out.printf("Inserindo elemento, %s na pilha \n",valueString);
        pilha.push(valueString);
        
        
        System.out.printf("Verificando se a pilha está vazia: ");
        System.out.println(pilha.isEmpty());
        System.out.printf("Verificando se a pilha está cheia: ");
        System.out.println(pilha.isFull());
        System.out.printf("Tamanho da pilha:");
        System.out.println(pilha.size());
        System.out.printf("Elemento no topo da pilha(indice): ");
        System.out.println(pilha.top());
        
        pilha.print();
         
     }   
}
