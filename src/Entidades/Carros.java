package Entidades;

import Aplicacao.MenuMetodos;

public class Carros implements MenuMetodos {
    // Atributos
    private String cor;
    private String marca;
    private String tipo;

    // Construtor
    public Carros(String cor, String marca, String tipo) {
        this.cor = cor;
        this.marca = marca;
        this.tipo = tipo;
    }

    // Métodos getters e setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Método para acelerar o carro
    public void acelerar() {
        System.out.println("Acelera o carro!");
    }

    // Método para frear o carros
    public void frear() {
        System.out.println("");
    }

    // Método para abastecer o carros
    public void abastecer() {
        System.out.println("Abastecer o carro");
    }

    // Método para exibir informações do carros

    public String toString() {
        return "carros [cor=" + cor + ", marca=" + marca + ", tipo=" + tipo + "]";
    }

    // Método principal para testar a classe carros
    public static void main(String[] args) {
        // Criando um objeto carros
        Carros carros = new Carros("Azul", "Porsche", "Esportivo");

        // Exibindo informações do carros
        System.out.println(carros);

        // Usando os métodos
        carros.frear();
        carros.acelerar();
        carros.abastecer();
    }

    public void menu() {
        System.out.println("CARROS");
        System.out.println("Escolha uma opção");
        System.out.println("1 - Mostrar informações");
        System.out.println("2 - Frear");
        System.out.println("3 - Acelerar");
        System.out.println("4 - Sair");

    }
}
