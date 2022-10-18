package tudocerto;
import java.util.Scanner;

public class ManutencaoTudoCerto {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Atendimento lanche = new Atendimento();
        int op, numero = 0;
        String nomeCliente;
        Cliente c = null;
        do {
            exibirOpcoes();
            op = in.nextInt(); in.nextLine();
            switch(op) {
                case 1: numero++;
                        System.out.print("Informe o nome do Cliente: ");
                        nomeCliente = in.nextLine();
                        c = new Cliente (nomeCliente,numero);
                        lanche.novoCliente(c);
                        break;
                case 2: lanche.atenderCliente();
                        break;
                case 0: System.out.println("Boa noite!!!");
                        break;
                default: System.out.println("Opção inválida!!");
            }
        } while (op != 0);  
    }
    public static void exibirOpcoes() {
        System.out.println("1 - Cadastrar novo Cliente");
        System.out.println("2 - Atender Cliente");
        System.out.println("0 - Encerrar programa");
        System.out.print("Informe a opção desejada: ");
    }
}