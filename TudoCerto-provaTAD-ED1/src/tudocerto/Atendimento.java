package tudocerto;

import br.unicap.ed1.arqowl.Queue;

public class Atendimento {
    private Queue<Cliente> fila;

    public Atendimento() {
        fila = new Queue<>(2);
    }

    public void novoCliente(Cliente c){
        if(!fila.isFull()){
            fila.enQueue(c);
            System.out.println("Novo cliente colocado na fila do TudoCerto");
        } else{
            System.out.println("Ops!!!");
            System.out.println("O espaço está lotado :(");
            System.out.println("Você deve retornar em outro momento");
        }

    }

    public void atenderCliente(){
        Cliente c;
        if(fila.isEmpty()==true){
            System.out.println("Não há clientes para serem atendidos");
        }else{
            c = fila.deQueue();
            System.out.println(c);
        }
    }
    
}