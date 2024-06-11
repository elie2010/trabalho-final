public class Jogador {

    private String nome;
    private String clube;
    private String dataNacimento;
    private String salario;
    private String tempoContrato;
    private int numeroInscricao;

    public Jogador (){
    }

    public Jogador (String nome, String clube, String dataNacimento, String salario, String tempoContrato, int numeroInscricao) {
        this.nome = nome;
        this.clube = clube;
        this.dataNacimento = dataNacimento;
        this.salario = salario;
        this.tempoContrato = tempoContrato;
        this.numeroInscricao = numeroInscricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public String getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(String dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public String getTempoContrato() {
        return tempoContrato;
    }

    public void setTempoContrato(String tempoContrato) {
        this.tempoContrato = tempoContrato;
    }

    public int getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(int numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }
    
    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Dados do atleta:" +
                "\nNome:" + nome + 
                "\nData de nascimento:" + dataNacimento +
                "\nClube:" + clube +
                "\nSalário:R$" + salario +
                "\nTempo de contrato:" + tempoContrato + " anos" + 
                "\nIscrição:" + numeroInscricao;
    }

    public String exibirDados (){
        return "Dados do atleta:" +
                "\nNome:" + nome + 
                "\nData de nascimento:" + dataNacimento +
                "\nClube:" + clube +
                "\nSalário:R$" + salario +
                "\nTempo de contrato:" + tempoContrato + " anos" +
                "\nIscrição:" + numeroInscricao;
    }

    public void fromString (String linha){
        String[] dados = linha.split(",");

        nome = dados[0].split(":")[1];
        clube = dados[1].split(":")[1];
        dataNacimento = dados[2].split(":")[1];
        salario = dados[3].split(":")[1];
        numeroInscricao = Integer.parseInt(dados[4].split(":")[1]);
    }

    
    
}
