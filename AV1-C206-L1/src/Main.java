import java.util.Scanner;

import java.util.ArrayList;

 class Empresa {
    String nome;
    String cnpj;
    String endereco;
    int funcionariosDisponiveis;
    ArrayList<Funcionario> funcionarios;

    public Empresa(String nome, String cnpj, String endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.funcionariosDisponiveis = 0;
        this.funcionarios = new ArrayList<>();
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + endereco);
        System.out.println("Funcionários Disponíveis: " + funcionariosDisponiveis);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        funcionariosDisponiveis++;
    }

    public void alocarFuncionario(int index) {
        if (index >= 0 && index < funcionarios.size()) {
            System.out.println("Funcionário " + funcionarios.get(index).getMatricula() + " alocado para a obra.");
            funcionariosDisponiveis--;
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public float contarFuncionariosDisponiveis() {
        return (float) funcionariosDisponiveis / funcionarios.size() * 100;
    }
}

class Pessoa {
      String nome;
      String cpf;
      int idade;

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
    }
}


class Funcionario extends Pessoa {
    int matricula;

    public Funcionario(String nome, String cpf, int idade, int matricula) {
        super(nome, cpf, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
}






public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empresa minhaEmpresa = new Empresa("Minha Empresa", "428231942", "Rua ???, 123");

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Mostrar informações da empresa");
            System.out.println("2. Adicionar funcionário");
            System.out.println("3. Alocar funcionário para obra");
            System.out.println("4. Contar porcentagem de funcionários disponíveis");
            System.out.println("5. Sair");

            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    minhaEmpresa.mostrarInfo();
                    break;
                case 2:
                    System.out.println("Digite o nome do funcionário:");
                    String nomeFuncionario = sc.nextLine();
                    System.out.println("Digite o CPF do funcionário:");
                    String cpfFuncionario = sc.nextLine();
                    System.out.println("Digite a idade do funcionário:");
                    int idadeFuncionario = sc.nextInt();
                    System.out.println("Digite a matrícula do funcionário:");
                    int matriculaFuncionario = sc.nextInt();

                    Funcionario novoFuncionario = new Funcionario(nomeFuncionario, cpfFuncionario, idadeFuncionario, matriculaFuncionario);
                    minhaEmpresa.adicionarFuncionario(novoFuncionario);
                    break;
                case 3:
                    System.out.println("Digite o índice do funcionário para alocar:");
                    int indice = sc.nextInt();
                    minhaEmpresa.alocarFuncionario(indice);
                    break;
                case 4:
                    float porcentagem = minhaEmpresa.contarFuncionariosDisponiveis();
                    System.out.println("Porcentagem de funcionários disponíveis: " + porcentagem + "%");
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}




