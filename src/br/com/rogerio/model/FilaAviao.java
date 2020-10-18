/*
 2. Escreva um programa que simule o controle de uma pista de decolagem de
aviões em um aeroporto. Neste programa, o usuário deve ser capaz de
realizar as seguintes tarefas:
a) Listar o número de aviões aguardando na fila de decolagem;
b) Autorizar a decolagem do primeiro avião da fila;
c) Adicionar um avião à fila de espera;
d) Listar todos os aviões na fila de espera;
e) Listar as características do primeiro avião da fila.
 */
package br.com.rogerio.model;

/**
 *
 * @author roger
 */
public class FilaAviao {
    
    private int tamanho;
    private int inicio;
    private int fim;
    private Aviao[] aviao;
    private int quantAvioes;

    public FilaAviao() {
        this(10);
    }
    
    public FilaAviao(int tamanho){
        if (tamanho <= 0) {
            throw new RuntimeException("Tamanho da fila deve ser maior que 0!\n");
        }
        this.tamanho = tamanho;
        this.aviao = new Aviao[tamanho];
        inicio = 0;
        fim = 0;
        quantAvioes = 0;
        
    }
    
    public boolean isEmpty(){
        return quantAvioes == 0;
    }
    
    public boolean isFull(){
        return quantAvioes == aviao.length;
    }
    
    public int size(){
        return quantAvioes;
    }
    
    public void enqueue(Aviao aviao){
        if (isFull()) {
            throw new RuntimeException("Pista de aviões cheia!\nCapacidade máxima: " + 
                    tamanho);
        }
        this.aviao[fim] = aviao; 
        fim = (fim +1) % this.aviao.length;
        quantAvioes++;
    }
    
    public void dequeue(){
        if (isEmpty()) {
            throw new RuntimeException("A pista está vazia de avião!\n");
        }
        inicio = (inicio + 1) % this.aviao.length;
        quantAvioes--;
        
    }
    
    public Aviao peek(){
        if (isEmpty()) {
            throw new RuntimeException("Não há aviões na pista para decolar!\n");
        }
        return this.aviao[inicio];
    }
    
    public void destroy(){
        inicio = 0;
        fim = 0;
        quantAvioes = 0;
    }
}
