package Entidades;

import Aplicacao.MenuMetodos;

public class Cachorros implements MenuMetodos {
    // Atributos
    private String raca;
    private String peso;
    private String idade;

    // Construtor
    public Cachorros(String raca, String peso, String idade) {
        this.raca = raca;
        this.peso = peso;
        this.idade = idade;
    }

    // Métodos getters e setters
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    // Método para dormir com o cachorros
    public void dormir() {
        System.out.println("Cachorro Dormindo!");
    }

    // Método para latir o cachorros
    public void latir() {
        System.out.println("Cachorro latindo.");
    }

    // Método para correr o cachorros
    public void correr() {
        System.out.println("Cachorro correndo.");
    }

    // Método para exibir informações do cachorros
    @Override
    public String toString() {
        return "cachorros [raca=" + raca + ", peso=" + peso + ", idade=" + idade + "]";
    }

    // Método principal para testar a classe cachorros
    public static void main(String[] args) {
        // Criando um objeto cachorros
        Cachorros cachorros = new Cachorros("Doberman", "40", "4");

        // Exibindo informações do cachorros
        System.out.println(cachorros);

        // Usando os métodos
        cachorros.latir();
        cachorros.dormir();
        cachorros.correr();
    }

    public void menu() {
        System.out.println("CACHORROS");
        System.out.println("Escolha uma opção");
        System.out.println("1 - Mostrar informações");
        System.out.println("2 - Latir");
        System.out.println("3 - Dormir");
        System.out.println("4 - Sair");
    }
}


