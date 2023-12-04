package sup;

import java.util.Scanner;

public class botsuporte {
    public static void verOpcoesEntrada() {
        try {
            String[] opcoesEntrada = {
                "Opção 1: Consultar saldo",
                "Opção 2: Falar com atendente",
                "Opção 3: Revisar plano",
                "Opção 4: Suporte técnico",
                "Opção 5: Cancelamento"
            };

            for (int o = 0; o < opcoesEntrada.length; o++) {
                System.out.println(opcoesEntrada[o]);
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro " + e);
        }
    }

    public static void botEntrada(int opcaoUsuario) {
        try {
            switch (opcaoUsuario) {
                case 1:
                    botSaldo();
                    break;
                case 2:
                    botFalar();
                    break;
                case 3:
                    botPlano();
                    break;
                case 4:
                    botSuporte();
                    break;
                case 5:
                    botCancelamento();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro " + e);
        }
    }

    public static void botSaldo() {
        System.out.println("Você está no menu de Saldo");
    }

    public static void botFalar() {
        System.out.println("Você está no menu para Falar com um atendente");
    }

    public static void botPlano() {
        System.out.println("Você está no menu de Plano");
    }

    public static void botSuporte() {
        System.out.println("Você está no menu de Suporte");
    }

    public static void botCancelamento() {
        System.out.println("Você está no menu de Cancelamento");
        Scanner scOpc = new Scanner(System.in);
        System.out.println("Digite 1 caso queira falar com um atendente.  Digite 2 caso queira cancelar o plano imediatamente");
        int opcao = scOpc.nextInt();
        if (opcao == 1) {
            System.out.println("Estamos encaminhando sua mensagem para um atendente");
        } else if (opcao == 2) {
            System.out.println("Estamos processando o cancelamento do plano.... Aguarde um pouco.");
        } else {
            System.out.println("Escolha uma opção válida");
        }

    }

    public static void main(String[] args) {
        try {
            Scanner scnOpcaoUsuario = new Scanner(System.in);
            verOpcoesEntrada();
            System.out.println("Digite o código da opção desejada acima e tecle Enter");
            botEntrada(scnOpcaoUsuario.nextInt());
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro " + e);
        }
    }
}
    

