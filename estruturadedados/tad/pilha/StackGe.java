/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados.tad.pilha;

/**
 *
 * @author Genildo Ferreira
 */
public class StackGe <T> {
    private int top = -1;
    private int defaultSize = 10;
    private Object[] dados;

    public StackGe( ) {
        this.dados = new Object[defaultSize];
    }
    
    public StackGe(int size) {
        this.dados = new Object[size];
    }
    
    public boolean isEmpty(){
        if(dados[0]==null){
            return true;
        }              
        return false;        
    }
    
    public boolean isFull(){
        if(dados.length == defaultSize){
            if(dados[defaultSize]!= null){
                return true;
            }else{             
                return false;
            }
        }else{
            if(dados[dados.length-1] == null){
                return false;
            }else{
                return true;
            }
        }
    } 
    
    public int size(){
        int value = dados.length;
        return value;
    }
    
    public int top(){ 
        return this.top;        
    }
    
    public void push(T element){
        dados[this.top+1] = element;
        this.top += 1; 
    }
    
    public T pop(){
        T element = (T) dados[top];
        dados[top]=null;
        this.top -= 1;
        return element;
    }
    
    public void clear( ){
        int index = top;
        for(int i=index; i>=0; i--){
            dados[i] = null;
            this.top -= 1;
        }
    }
    
    public void print(){
        for(int i=0; i<=top; i++ ){
            System.out.println(dados[i]);
        }
    }
}// close class StackGe
