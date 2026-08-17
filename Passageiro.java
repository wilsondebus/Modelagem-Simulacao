public class Passageiro {

    protected String nome;
    protected String cpf;
    protected int idade;
    protected String embarque;
    protected String destino;

    public Passageiro() {
    }

    public Passageiro(String nome, String cpf, int idade, String embarque, String destino) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.embarque = embarque;
        this.destino = destino;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEmbarque() {
        return embarque;
    }
    public void setEmbarque(String embarque) {
        this.embarque = embarque;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    } 
}