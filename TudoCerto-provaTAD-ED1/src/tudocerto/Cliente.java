package tudocerto;

public class Cliente {
    private String nomeCliente;
    private int senha;

    public Cliente(String nomeCliente, int senha) {
        this.nomeCliente = nomeCliente;
        this.senha = senha;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    @Override
    public String toString() {
        return "Cliente " + nomeCliente + " de senha " + senha + " foi atendido.";
    }
    
}


