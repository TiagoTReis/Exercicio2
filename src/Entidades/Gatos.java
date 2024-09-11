package Entidades;

import Aplicacao.MenuMetodos;

public class Gatos implements MenuMetodos {
    // Atributos
    private String raca;
    private String cor;
    private String tamanho;

    // Construtor
    public Gatos(String raca, String cor, String tamanho) {
        this.raca = raca;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    // Métodos getters e setters
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

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

    // Método para miar os gatos
    public void miar() {
        System.out.println("Gato mia!");
    }

    // Método para arranhar a gatos
    public void arranhar() {
        System.out.println("Gato arranhando");
    }

    // Método para comer a gatos
    public void comer() {
        System.out.println("Gato comendo");
    }

    // Método para exibir informações do gatoss
    @Override
    public String toString() {
        return "gatos [raca=" + raca + ", cor=" + cor + ", tamanho=" + tamanho + "]";
    }

    // Método principal para testar a classe gatoss
    public static void main(String[] args) {
        // Criando um objeto gatoss
        Gatos gatoss = new Gatos("persa", "cinza", "pequeno");

        // Exibindo informações do gatoss
        System.out.println(gatoss);

        // Usando os métodos
        gatoss.arranhar();
        gatoss.miar();
        gatoss.comer();
    }
    public void menu() {
        System.out.println("Gatos");
        System.out.println("Escolha uma opção");
        System.out.println("1 - Mostrar informações");
        System.out.println("2 - Arranhar");
        System.out.println("3 - Miar");
        System.out.println("4 - Sair");

}
}



