public class Jogador extends Clube {

    private String nomeJogador;
    private String posicao;
    private String dataNascimento;
    private String tempoContrato;
    private Clube clube;

    public Jogador (){
    }

    public Jogador(String nomeJogador, String posicao, String dataNascimento, String tempoContrato, Clube clube) {
        this.nomeJogador = nomeJogador;
        this.posicao = posicao;
        this.dataNascimento = dataNascimento;
        this.tempoContrato = tempoContrato;
        this.clube = clube;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTempoContrato() {
        return tempoContrato;
    }

    public void setTempoContrato(String tempoContrato) {
        this.tempoContrato = tempoContrato;
    }

    public Clube getClube() {
        return clube;
    }

    public void setClube(Clube clube) {
        this.clube = clube;
    }

    @Override
    public String toString() {
        return "\nDados jogador:" +
                "\nNome do atleta:" + nomeJogador +
                "\nPosição:" + posicao +
                "\nClube:" + clube +
                "\nData nascimento:" + dataNascimento +
                "\nTempo de contrato:" + tempoContrato;
    }

    @Override
    public String exibirInformaçoes() {
        return  "\nDados jogador:" +
        "\nNome do atleta:" + nomeJogador +
        "\nPosição:" + posicao +
        "\nClube:" + clube +
        "\nData nascimento:" + dataNascimento +
        "\nTempo de contrato" + tempoContrato;
    }

    @Override
    public void fromString(String linha) {
        super.fromString(linha);
        String[] dados = linha.split(",");
        nomeJogador = dados[3].split(":")[1];
        posicao = dados[4].split(":")[1];
        dataNascimento = dados[5].split(":")[1];
        tempoContrato = dados[6].split(":")[1];
    }

    

    

    
    

    

}
