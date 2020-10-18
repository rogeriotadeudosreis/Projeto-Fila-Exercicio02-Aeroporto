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
public class Aviao {

    private String empresa;
    private int numero;

    public Aviao() {
    }

    public Aviao(String empresa,int numero) {
        this.empresa = empresa;
        this.numero = numero;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Empresa: " + empresa.toUpperCase() + "\n"
                + "Número do avião: " + numero + "\n";
    }
}
