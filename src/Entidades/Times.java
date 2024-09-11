package Entidades;

import Aplicacao.MenuMetodos;

public class Times implements MenuMetodos {
    // Atributos
    private String regiao;
    private String cor;
    private String estadio;

    // Construtor
    public Times(String regiao, String cor, String estadio) {
        this.regiao = regiao;
        this.cor = cor;
        this.estadio = estadio;
    }

    // Métodos getters e setters
    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    // Método para jogar o time
    public void jogar() {
        System.out.println("jogar no time!");
    }

    // Método para ganhar a time
    public void ganhar() {
        System.out.println("Para o time ganhar");
    }

    // Método para perder a time
    public void perder() {
        System.out.println("Para o time perder");
    }

    // Método para exibir informações do times
    @Override
    public String toString() {
        return "times [regiao=" + regiao + ", cor=" + cor + ", estadio=" + estadio + "]";
    }

    // Método principal para testar a classe times
    public static void main(String[] args) {
        // Criando um objeto times
        Times times = new Times("Rio de Janeiro", "Vermelho", "Maracana");

        // Exibindo informações do times
        System.out.println(times);

        // Usando os métodos
        times.ganhar();
        times.jogar();
        times.perder();
    }

    public void menu() {
        System.out.println("TIMES");
        System.out.println("Escolha uma opção");
        System.out.println("1 - Mostrar informações");
        System.out.println("2 - Jogar");
        System.out.println("3 - Ganhar");
        System.out.println("4 - Sair");
    }
}