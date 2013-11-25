/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados.tad.testepilha;

import estruturadedados.tad.pilha.StackGe;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Genildo Ferreira
 */
public class StackGeTest {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        boolean go = true;
        do{
            try {
                System.out.println("Digite o tamanho do array: ");
                int tam = in.nextInt(); // InputMismatchException
                StackGe pilha = new StackGe(tam);       

                System.out.println("Verificando de a pilha está vazia: ");
                System.out.println(pilha.isEmpty());
                System.out.println("Verificando de a pilha está cheia: ");
                System.out.println(pilha.isFull());
                System.out.println("Tamanho da pilha:");
                System.out.println(pilha.size());
                System.out.println("Elemento no topo da pilha: ");
                System.out.println(pilha.top());

                System.out.print("digite um numero inteiro: \n");
                int valueInt = in.nextInt(); 
                System.out.printf("Inserindo elemento, %d na pilha \n",valueInt);
                pilha.push(valueInt); // ArrayIndexOutOfBoundsException

                System.out.print("digite um numero do tipo double: \n");
                double valueDouble = in.nextDouble();        
                System.out.printf("Inserindo elemento, %f na pilha \n",valueDouble);
                pilha.push(valueDouble);

                System.out.print("digite um valor do tipo string: \n");
                String valueString = in.next( );
                System.out.printf("Inserindo elemento, %s na pilha \n",valueString);
                pilha.push(valueString);


                System.out.println("Verificando se a pilha está vazia: ");
                System.out.println(pilha.isEmpty());
                System.out.println("Verificando se a pilha está cheia: ");
                System.out.println(pilha.isFull());
                System.out.println("Tamanho da pilha:");
                System.out.println(pilha.size());
                System.out.println("Elemento no topo da pilha(indice): ");
                System.out.println(pilha.top());
                System.out.println("########### Elementos da lista #############");
                pilha.print();
                System.out.println("Removendo elemento do topo da pilha: ");
                System.out.println(pilha.pop());
                //System.out.println(pilha.pop());
                //System.out.println(pilha.pop());
                
                System.out.println("########### Elementos da lista atualizada #############");
                pilha.print();


            }catch(InputMismatchException erro1){
                System.out.println("O tipo de valor digitado e invalido : ");
                in.nextLine(); // descarta a entrada invalida e libera novamente a função Scanner
            }catch(ArrayIndexOutOfBoundsException erro2){
                System.out.println("Capturei erro de entrada ArrayIndexOutOfBoundsException.");
            }            
        }while(go);
    }
}

