package Entidades;

import Aplicacao.MenuMetodos;

public class Casas implements MenuMetodos {
    // Atributos
    private String cor;
    private String tamanho;
    private String formato;

    // Construtor
    public Casas(String cor, String tamanho, String formato) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.formato = formato;
    }

    // Métodos getters e setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    // Método para morar na na casa
    public void morar() {
        System.out.println("Morar na casa!");
    }

    // Método para construir a casa
    public void construir() {
        System.out.println("Construir a casa");
    }

    // Método para pintar a casa
    public void pintar() {
        System.out.println("Pintar a casa");
    }

    // Método para exibir informações do casas
    @Override
    public String toString() {
        return "casas [cor=" + cor + ", tamanho=" + tamanho + ", formato=" + formato + "]";
    }

    // Método principal para testar a classe casas
    public static void main(String[] args) {
        // Criando um objeto casas
        Casas casas = new Casas("Amarela", "Grande", "Retangular");

        // Exibindo informações do casas
        System.out.println(casas);

        // Usando os métodos
        casas.construir();
        casas.morar();
        casas.pintar();
    }

    public void menu() {
        System.out.println("CASAS");
        System.out.println("Escolha uma opção");
        System.out.println("1 - Mostrar informações");
        System.out.println("2 - Construir");
        System.out.println("3 - Pintar");
        System.out.println("4 - Sair");

    }
}

