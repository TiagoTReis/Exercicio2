package Aplicacao;

import Entidades.*;

import java.util.Scanner;

public class TestaClasse extends Objetos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao = 0;
        int opcao2 = 0;

        boolean sair = false;

        while (!sair) {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1 - Brinquedos");
            System.out.println("2 - Cachorros");
            System.out.println("3 - Carros");
            System.out.println("4 - Casas");
            System.out.println("5 - Eletronicos");
            System.out.println("6 - Frutas");
            System.out.println("7 - Gatos");
            System.out.println("8 - Instrumentos");
            System.out.println("9 - Pokemon");
            System.out.println("10 - Times");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    do {
                        brinquedos.menu();
                        opcao2 = input.nextInt();

                        switch (opcao2) {
                            case 1:
                                System.out.println(brinquedos.getCor());
                                System.out.println(brinquedos.getMaterial());
                                System.out.println(brinquedos.getTamanho());
                                break;
                            case 2:
                                brinquedos.guardar();
                                break;
                            case 3:
                                brinquedos.brincar();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Digite um valor existente!");
                        }
                        String esperar = input.next();

                    } while (opcao2 != 4);
                    break;

                case 2:
                    do {
                        cachorros.menu();
                        opcao2 = input.nextInt();

                        switch (opcao2) {
                            case 1:
                                System.out.println(cachorros.getRaca());
                                System.out.println(cachorros.getPeso());
                                System.out.println(cachorros.getIdade());
                                break;
                            case 2:
                                cachorros.latir();
                                break;
                            case 3:
                                cachorros.dormir();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Digite um valor existente!");
                        }
                        String esperar = input.next();

                    } while (opcao2 != 4);
                    break;
                case 3:
                    do {
                        carros.menu();
                        opcao2 = input.nextInt();

                        switch (opcao2) {
                            case 1:
                                System.out.println(carros.getCor());
                                System.out.println(carros.getMarca());
                                System.out.println(carros.getTipo());
                                break;
                            case 2:
                                carros.frear();
                                break;
                            case 3:
                                carros.acelerar();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Digite um valor existente!");
                        }
                        String esperar = input.next();

                    } while (opcao2 != 4);
                    break;
                case 4:
                    do {
                        casas.menu();
                        opcao2 = input.nextInt();

                        switch (opcao2) {
                            case 1:
                                System.out.println(casas.getCor());
                                System.out.println(casas.getTamanho());
                                System.out.println(casas.getFormato());
                                break;
                            case 2:
                                casas.construir();
                                break;
                            case 3:
                                casas.pintar();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Digite um valor existente!");
                        }
                        String esperar = input.next();

                    } while (opcao2 != 4);
                    break;
                case 5:
                    do {
                        eletronicos.menu();
                        opcao2 = input.nextInt();

                        switch (opcao2) {
                            case 1:
                                System.out.println(eletronicos.getFormato());
                                System.out.println(eletronicos.getCor());
                                System.out.println(eletronicos.getMaterial());
                                break;
                            case 2:
                                eletronicos.ligar();
                                break;
                            case 3:
                                eletronicos.guardar();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Digite um valor existente!");
                        }
                        String esperar = input.next();

                    } while (opcao2 != 4);
                    break;
                case 6:
                    do {
                        frutas.menu();
                        opcao2 = input.nextInt();

                        switch (opcao2) {
                            case 1:
                                System.out.println(frutas.getSabor());
                                System.out.println(frutas.getCor());
                                System.out.println(frutas.getTextura());
                                break;
                            case 2:
                                frutas.lavar();
                                break;
                            case 3:
                                frutas.comer();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Digite um valor existente!");
                        }
                        String esperar = input.next();

                    } while (opcao2 != 4);

                    break;
                case 7:
                    do {
                        gatos.menu();
                        opcao2 = input.nextInt();

                        switch (opcao2) {
                            case 1:
                                System.out.println(gatos.getRaca());
                                System.out.println(gatos.getCor());
                                System.out.println(gatos.getTamanho());
                                break;
                            case 2:
                                gatos.arranhar();
                                break;
                            case 3:
                                gatos.miar();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Digite um valor existente!");
                        }
                        String esperar = input.next();

                    } while (opcao2 != 4);

                    break;

                case 8:
                    do {
                        instrumentosMusicais.menu();
                        opcao2 = input.nextInt();

                        switch (opcao2) {
                            case 1:
                                System.out.println(instrumentosMusicais.getTipo());
                                System.out.println(instrumentosMusicais.getTamanho());
                                System.out.println(instrumentosMusicais.getMaterial());
                                break;
                            case 2:
                                instrumentosMusicais.afinar();
                                break;
                            case 3:
                                instrumentosMusicais.tocar();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Digite um valor existente!");
                        }
                        String esperar = input.next();

                    } while (opcao2 != 4);
                    break;

                case 9:
                    do {
                        pokemon.menu();
                        opcao2 = input.nextInt();

                        switch (opcao2) {
                            case 1:
                                System.out.println(pokemon.getCor());
                                System.out.println(pokemon.getTipo());
                                System.out.println(pokemon.getPeso());
                                break;
                            case 2:
                                pokemon.lutar();
                                break;
                            case 3:
                                pokemon.defender();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Digite um valor existente!");
                        }
                        String esperar = input.next();

                    } while (opcao2 != 4);
                    break;

                case 10:
                    do {
                        times.menu();
                        opcao2 = input.nextInt();

                        switch (opcao2) {
                            case 1:
                                System.out.println(times.getRegiao());
                                System.out.println(times.getCor());
                                System.out.println(times.getEstadio());
                                break;
                            case 2:
                                times.jogar();
                                break;
                            case 3:
                                times.ganhar();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Digite um valor existente!");
                        }
                        String esperar = input.next();

                    } while (opcao2 != 4);
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

        // Fechar o Scanner após o término do loop
        input.close();
    }
}
