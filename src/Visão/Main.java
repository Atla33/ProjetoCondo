package Visão;

import Dominio.Eventos;

import Dominio.Morador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int op, op2;

        boolean entrou = false;

        ArrayList<Morador> morador = new ArrayList<Morador>();
        morador.add(new Morador("enzo","enzo.danjour@gmail.com","27/05/1999","123456",89));
        ArrayList<Eventos> eventos = new ArrayList<Eventos>();

        do {

            op = menu();

            switch (op) {
                case 1:

                    System.out.println("Digite o seu nome: ");
                    String nome = teclado.nextLine();
                    teclado.nextLine();

                    System.out.println("Digite o número da sua casa: ");
                    int Casa = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Digite a sua data de nascimento: ");
                    String DataNascimento = teclado.nextLine();

                    System.out.println("Digite o seu e-mail: ");
                    String Email = teclado.nextLine();

                    System.out.println("Digite uma senha: ");
                    String Senha = teclado.nextLine();

                    morador.add(new Morador(nome, Email, DataNascimento, Senha, Casa));

                    break;
                case 2:
                    System.out.println("Digite o nome para buscar: ");
                    nome = teclado.nextLine();
                    for (int i = 0; i < morador.size(); i++) {
                        if (morador.get(i).getNome().equals(nome)) {
                            System.out.println("\nMorador encontrado");
                            System.out.println("\nNome: " + morador.get(i).getNome());
                            System.out.println("\nE-mail: " + morador.get(i).getEmail());
                            System.out.println("\nData de Nascimento: " + morador.get(i).getDataNascimento());
                            System.out.println("\nNúmero da casa: " + morador.get(i).getCasa());
                            System.out.println("\nSenha: " + morador.get(i).getSenha());

                            System.out.println("\n\n");

                            System.out.println("Deseja alterar o nome? (1 - Sim 2 - Não)");
                            if (teclado.nextInt() == 1) {
                                System.out.println("\nDigite o novo nome: ");
                                morador.get(i).setNome(teclado.nextLine());
                                System.out.println("Dado alterado com sucesso. ");
                            }

                            System.out.println("\n\n");

                            System.out.println("Deseja alterar o e-mail? (1 - Sim 2 - Não)");
                            if (teclado.nextInt() == 1) {
                                System.out.println("\nDigite o novo e-mail: ");
                                morador.get(i).setEmail(teclado.nextLine());
                                System.out.println("Dado alterado com sucesso. ");
                            }
                            System.out.println("\n\n");

                            System.out.println("Deseja alterar a data de nascimento? (1 - Sim 2 - Não)");
                            if (teclado.nextInt() == 1) {
                                System.out.println("\nDigite a nova data de nascimento: ");
                                morador.get(i).setDataNascimento(teclado.nextLine());
                                System.out.println("Dado alterado com sucesso. ");
                            }

                            System.out.println("\n\n");

                            System.out.println("Deseja alterar o número da casa? (1 - Sim 2 - Não)");
                            if (teclado.nextInt() == 1) {
                                System.out.println("\nDigite o novo número da casa: ");
                                morador.get(i).setCasa(teclado.nextInt());
                                System.out.println("Dado alterado com sucesso. ");
                            }

                            System.out.println("\n\n");

                            System.out.println("Deseja alterar a senha? (1 - Sim 2 - Não)");
                            if (teclado.nextInt() == 1) {
                                System.out.println("\nDigite a nova senha: ");
                                morador.get(i).setSenha(teclado.nextLine());
                                System.out.println("Dado alterado com sucesso. ");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome para buscar: ");
                    nome = teclado.nextLine();
                    for (int i = 0; i < morador.size(); i++) {
                        if (morador.get(i).getNome().equals(nome)) {
                            System.out.println("Deseja realmente excluir? (1 - Sim 2 - Não)");
                            if (teclado.nextInt() == 1)
                                morador.remove(morador.get(i));
                                System.out.println("Morador excluido com sucesso. ");
                        }
                    }
                    break;
                case 4:
                    do {
                            System.out.println("Bem vindo faça o login no condorium");
                            System.out.println("Digite o seu login (Nome): ");
                            nome = teclado.nextLine();
                            System.out.println("Digite a sua senha: ");
                            Senha = teclado.nextLine();
                            for (int i = 0; i < morador.size(); i++) {

                                entrou = true;

                                if(morador.get(i).getNome().equals(nome) && morador.get(i).getSenha().equals(Senha)) {
                                    System.out.println("Logim bem sucedido ");

                                    entrou = false;
                                    do{
                                        System.out.println("\n\t ---  O QUE DESEJA FAZER  ---  ");
                                        System.out.println("\t1 - ADICIONAR PROTOCOLO");
                                        System.out.println("\t2 - SOLICITAR ARQUIVO");
                                        System.out.println("\t3 - ADICIONAR EVENTO");
                                        System.out.println("\t4 - ALTERAR EVENTO");
                                        System.out.println("\t5 - REMOVER EVENTO");
                                        System.out.println("\t6 - Sair");
                                        System.out.print("\tDigite a opção desejada: \n\t");
                                        op2 = teclado.nextInt();
                                        teclado.nextLine();

                                        switch (op2) {

                                            case 1:
                                                ;
                                                System.out.println("\nHello World");
                                                break;
                                            case 2:
                                                ;
                                                int TipoArquivo;
                                                do {

                                                    System.out.println("\n\t ---  QUAL ARQUVO DESEJA  ---  ");
                                                    System.out.println("\t1 - 1ª VIA DO CONDOMINIO");
                                                    System.out.println("\t2 - 2ª VIA DO CONDOMINIO");
                                                    System.out.println("\t3 - 1ª VIA DO GÁS");
                                                    System.out.println("\t4 - SAIR");
                                                    System.out.print("\tDigite a opção desejada: \n\t");
                                                    TipoArquivo = teclado.nextInt();

                                                    switch (TipoArquivo) {
                                                        case 1:
                                                            System.out.println("\n\t ---  1ª VIA DO CONDOMNIO  ---  ");

                                                            System.out.println("Digite o nome do morador: ");
                                                            String setDado = teclado.nextLine();
                                                            teclado.next();

                                                            System.out.println("Digite a data de vencimento: ");
                                                            String setData = teclado.nextLine();
                                                            teclado.next();

                                                            System.out.println("Baixando arquivo. ");

                                                            break;
                                                        case 2:
                                                            System.out.println("\n\t ---  2ª VIA DO CONDOMINIO  ---  ");

                                                            System.out.println("Digite o nome do morador: ");
                                                            setDado = teclado.nextLine();
                                                            teclado.next();

                                                            System.out.println("Digite a data de vencimento: ");
                                                            setData = teclado.nextLine();
                                                            teclado.next();

                                                            System.out.println("Baixando arquivo. ");

                                                            break;
                                                        case 3:
                                                            System.out.println("\n\t ---  1ª VIA DO GÁS  ---  ");

                                                            System.out.println("Digite o nome do morador: ");
                                                            setDado = teclado.nextLine();
                                                            teclado.next();

                                                            System.out.println("Digite a data de vencimento: ");
                                                            setData = teclado.nextLine();
                                                            teclado.next();

                                                            System.out.println("Baixando arquivo. ");

                                                            break;
                                                        case 4:
                                                            System.out.println("Fim de Programa!");
                                                            break;
                                                        default:
                                                            System.out.println("A opção digitada é inválida, tente novamente!");
                                                    }

                                                } while (TipoArquivo != 4);
                                                break;
                                            case 3:
                                                System.out.println("Digite qual o evento que deseja: 1 - Salao de festa, 2 - Quadra, 3 - Academa 4 - Churrasqueira.");
                                                int Tipo = teclado.nextInt();
                                                teclado.nextLine();

                                                System.out.println("Digite a duração: ");
                                                String Duracao = teclado.nextLine();

                                                System.out.println("Digite o local que desejá: ");
                                                String Local = teclado.nextLine();

                                                System.out.println("Faça uma breve descrição sobre o seu evento: ");
                                                String Decricao = teclado.nextLine();

                                                eventos.add(new Eventos(Tipo, Duracao, Local, Decricao));
                                                break;
                                            case 4:
                                                System.out.println("Digite o local do evento para buscar: ");
                                                Local = teclado.nextLine();

                                                for (i = 0; i < eventos.size(); i++) {
                                                    if (eventos.get(i).getLocal().equals(Local)) {
                                                        System.out.println("\nEvento encontrado");
                                                        System.out.println("\nTipo: " + eventos.get(i).getTipo());
                                                        System.out.println("\nDuracao: " + eventos.get(i).getDuracao());
                                                        System.out.println("\nDescricao: " + eventos.get(i).getDecricao());
                                                        System.out.println("\n:Local " + eventos.get(i).getLocal());

                                                        System.out.println("\n\n");

                                                        System.out.println("Deseja alterar o Tipo do evendo? (1 - Sim 2 - Não)");
                                                        if (teclado.nextInt() == 1) {
                                                            System.out.println("\nDigite o novo Tipo do evento ");
                                                            eventos.get(i).setTipo(teclado.nextInt());
                                                        }

                                                        System.out.println("\n\n");

                                                        System.out.println("Deseja alterar o duracao? (1 - Sim 2 - Não)");
                                                        if (teclado.nextInt() == 1) {
                                                            System.out.println("\nDigite a nova duracao: ");
                                                            eventos.get(i).setDuracao(teclado.nextLine());
                                                        }
                                                        System.out.println("\n\n");

                                                        System.out.println("Deseja alterar a descricao? (1 - Sim 2 - Não)");
                                                        if (teclado.nextInt() == 1) {
                                                            System.out.println("\nDigite a nova data de nascimento: ");
                                                            eventos.get(i).setDecricao(teclado.nextLine());
                                                        }

                                                        System.out.println("\n\n");

                                                        System.out.println("Deseja alterar o local? (1 - Sim 2 - Não)");
                                                        if (teclado.nextInt() == 1) {
                                                            System.out.println("\nDigite o novo número da casa: ");
                                                            eventos.get(i).setLocal(teclado.nextLine());
                                                        }
                                                    }
                                                }
                                                break;
                                            case 5:

                                                System.out.println("Digite o local do evento para buscar: ");
                                                Local = teclado.nextLine();
                                                for (i = 0; i < eventos.size(); i++) {
                                                    if (eventos.get(i).getLocal().equals(Local)) {
                                                        System.out.println("Deseja realmente excluir? (1 - Sim 2 - Não)");
                                                        if (teclado.nextInt() == 1)
                                                            morador.remove(morador.get(i));
                                                    }
                                                }
                                                break;
                                            case 6:
                                                System.out.println("Fim de Programa!");
                                                break;
                                            default:
                                                System.out.println("A opção digitada é inválida, tente novamente!");
                                        }
                                    }while(op2!=6);
                                }
                            }
                    }while (entrou=true);
                        break;
                case 5:

                    System.out.println("Fim de Programa!");
                    break;

                default:
                    System.out.println("A opção digitada é inválida, tente novamente!");
            }

        }while (op != 5);
    }

    public static int menu(){
        System.out.println("\n\t --- JÁ É CADASTRADO ---  ");
        System.out.println("\t1 - CADASTRAR NOVO MORADOR");
        System.out.println("\t2 - ATUALIZAR CADASTRO");
        System.out.println("\t3 - EXCLUIR CADASTRO");
        System.out.println("\t4 - FAZER LOGIN");
        System.out.println("\t5 - Sair");

        System.out.print("\tDigite a opção desejada: \n\t");
        int op = teclado.nextInt();
        return op;
    }
}