import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                ArrayList<Jogo> jogos = new ArrayList<>();
                Arquivo arquivo = new Arquivo();


                try {
                    jogos = arquivo.ler();
                } catch (IOException | ClassNotFoundException e) {
                    System.out.println("Erro ao ler o arquivo no início.");
                }

                while (true) {
                    System.out.println("1. Adicionar Jogo");
                    System.out.println("2. Mostrar Jogos");
                    System.out.println("3. Ordenar jogo por preco (Crescente)");
                    System.out.println("4. Ordenar jogo por preco (Decrescente)");
                    System.out.println("5. Sair");

                    int opcao = sc.nextInt();
                    sc.nextLine();
                    if (opcao == 1) {
                        try {
                            System.out.print("Nome do jogo: ");
                            String nome = sc.nextLine();

                            System.out.print("Tipo de jogo: ");
                            String genero = sc.nextLine();

                            System.out.print("Preco: ");
                            double preco = sc.nextDouble();
                            sc.nextLine();
                            Jogo novoJogo = new Jogo(nome, genero, preco);
                            jogos.add(novoJogo);
                            arquivo.escrever(jogos);
                        } catch (PrecoNegativoException e) {
                            System.out.println(e.getMessage());
                        } catch (IOException e) {
                            System.out.println("Erro ao escrever no arquivo.");
                        }
                    } else if (opcao == 2) {
                        for (Jogo jogo : jogos) {
                            jogo.mostrarInfos();
                        }
                    } else if (opcao == 3) {
                        jogos.sort(Comparator.comparingDouble(Jogo::getPreco));
                        System.out.println("Jogos ordenados por preco (crescente):");
                        for (Jogo jogo : jogos) {
                            jogo.mostrarInfos();
                        }
                    } else if (opcao == 4) {
                        jogos.sort(Comparator.comparingDouble(Jogo::getPreco).reversed());
                        System.out.println("Jogos ordenados por preco (decrescente):");
                        for (Jogo jogo : jogos) {
                            jogo.mostrarInfos();
                        }
                    } else if (opcao == 5) {
                        break;
                    }
                }

                sc.close();
            }
        }

