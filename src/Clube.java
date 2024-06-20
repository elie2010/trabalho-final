public class Clube {

    private String nomeClube;
    private String ligaAtual;
    private String anoFundacao;

    public Clube (){
    }

    public Clube(String nomeClube, String ligaAtual, String anoFundacao) {
        this.nomeClube = nomeClube;
        this.ligaAtual = ligaAtual;
        this.anoFundacao = anoFundacao;
    }

    public String getNomeClube() {
        return nomeClube;
    }

    public void setNomeClube(String nomeClube) {
        this.nomeClube = nomeClube;
    }

    public String getLigaAtual() {
        return ligaAtual;
    }

    public void setLigaAtual(String ligaAtual) {
        this.ligaAtual = ligaAtual;
    }

    public String getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(String anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    @Override
    public String toString(){
        return "\nNome do clube:" + nomeClube + 
                "\nLiga atual:" + ligaAtual + 
                "\nAno fundação:" + anoFundacao;
    }

    public String exibirInformaçoes(){
        return "\nNome do clube:" + nomeClube + 
                "\nLiga atual:" + ligaAtual + 
                "\nAno fundação:" + anoFundacao;
    }
    
    public void fromString (String linha){

        String[] dados = linha.split(",");
        
        nomeClube = dados[0].split(":")[1];
        ligaAtual = dados[1].split(":")[1];
        anoFundacao = dados[2].split(":")[1];
    }




}
