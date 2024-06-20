public class Jogador extends Clube  {

    private String nomeJogador;
    private String posicao;

    public Jogador (String nomeJogador, String posicao, String nomeClube, String nomeLiga) {
        super(nomeClube, nomeLiga);
        this.nomeJogador = nomeJogador;
        this.posicao = posicao;
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

    @Override
    public String toString() {
        return  "\nDados jogador:" +
        "\nNome do atleta:" + nomeJogador +
        "\nPosição:" + posicao +
        "\nClube que atua:" + getNomeClube() +
        "\nLiga que disputa:" + getNomeLiga();
    }

    


    

    

    
    

    

}
