package Entidades;

import Aplicacao.MenuMetodos;

public class Eletronicos implements MenuMetodos {

    // Atributos
    private String formato;
    private String cor;
    private String material;

    // Construtor
    public Eletronicos(String formato, String cor, String material) {
        this.formato = formato;
        this.cor = cor;
        this.material = material;
    }

    // Métodos getters e setters
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // Método para usar o eletronico
    public void usar() {
        System.out.println("Usar o eletronico!");
    }

    // Método para guardar a eletronico
    public void guardar() {
        System.out.println("Guardar o eletronico");
    }

    // Método para ligar a eletronico
    public void ligar() {
        System.out.println("Ligar o eletronico");
    }

    // Método para exibir informações do eletronicos
    @Override
    public String toString() {
        return "eletronicos [formato=" + formato + ", cor=" + cor + ", material=" + material + "]";
    }

    // Método principal para testar a classe eletronicos
    public static void main(String[] args) {
        // Criando um objeto eletronicos
        Eletronicos eletronicos = new Eletronicos("Retangular", "Cinza", "Plastico");

        // Exibindo informações do eletronicos
        System.out.println(eletronicos);

        // Usando os métodos
        eletronicos.guardar();
        eletronicos.usar();
        eletronicos.ligar();
    }

    public void menu() {
        System.out.println("ELETRONICOS");
        System.out.println("Escolha uma opção");
        System.out.println("1 - Mostrar informações");
        System.out.println("2 - Ligar");
        System.out.println("3 - Guardar");
        System.out.println("4 - Sair");

    }
}


