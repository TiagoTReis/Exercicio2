package Aplicacao;

import Entidades.*;
import java.util.Scanner;

public class TestaClasse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando objetos
        Brinquedos brinquedos = new Brinquedos("pequeno", "amarelo", "plastico");
        Cachorros cachorros = new Cachorros("Doberman", "40", "4");
        Carros carros = new Carros("Azul", "Porsche", "Esportivo");
        Casas casas = new Casas("Amarela", "Grande", "Retangular");
        Eletronicos eletronicos = new Eletronicos("Retangular", "Cinza", "Plastico");
        Frutas frutas = new Frutas("doce", "amarela", "macio");
        Gatos gatoss = new Gatos("persa", "cinza", "pequeno");
        InstrumentosMusicais instrumentosMusicais = new InstrumentosMusicais("corda", "medio", "madeira");
        Pokemon pokemon = new Pokemon("amarelo", "eletrico", "6kg");
        Times times = new Times("Rio de Janeiro", "Vermelho", "Maracana");

        boolean sair = false;

        while (!sair) {
            System.out.println("Menu:");
            System.out.println("1. Brincar com os brinquedos !");
            System.out.println("2. Guardar os brinquedos!");
            System.out.println("3. Por o cachorro pra dormir");
            System.out.println("4. Por o cachorro pra correr");
            System.out.println("5. Abastecer o carro");
            System.out.println("6. Frea o carro!");
            System.out.println("7. Construir uma casa");
            System.out.println("8. Pintar uma casa");
            System.out.println("9. Ligar o eletronico");
            System.out.println("11. Comer a fruta");
            System.out.println("12. Pegar a fruta");
            System.out.println("13. Gato miar");
            System.out.println("14. Gato arranhar");
            System.out.println("15. Afinar o instrumento musical");
            System.out.println("16. Tocar o instrumento musical");
            System.out.println("17. Por o pokemon pra lutar");
            System.out.println("18. Hora do pokemon defender");
            System.out.println("19. Jogar no time");
            System.out.println("20. Ganhar o jogo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    brinquedos.brincar();
                    break;
                case 2:
                    brinquedos.guardar();
                    break;
                case 3:
                    cachorros.dormir();
                    break;
                case 4:
                    cachorros.correr();
                    break;
                case 5:
                    carros.abastecer();
                    break;
                case 6:
                    carros.frear();
                    break;
                case 7:
                    casas.construir();
                    break;
                case 8:
                    casas.pintar();
                    break;
                case 9:
                    eletronicos.ligar();
                    break;
                case 10:
                    eletronicos.usar();
                    break;
                case 11:
                    frutas.comer();
                    break;
                case 12:
                    frutas.pegar();
                    break;
                case 13:
                    gatoss.miar();
                    break;
                case 14:
                    gatoss.arranhar();
                    break;
                case 15:
                    instrumentosMusicais.afinar();
                    break;
                case 16:
                    instrumentosMusicais.tocar();
                    break;
                case 17:
                    pokemon.lutar();
                    break;
                case 18:
                    pokemon.defender();
                    break;
                case 19:
                    times.jogar();
                    break;
                case 20:
                    times.ganhar();
                    break;

                case 0:
                    sair = true;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
