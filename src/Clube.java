public class Clube extends Liga {

    private String nomeClube;
    private int anoFundacao;

    public Clube (int anoFundacao, String nomeClube, String nomeLiga) {
        super(nomeLiga);
        this.anoFundacao = anoFundacao;
        this.nomeClube = nomeClube;
    }

    public Clube (String nomeClube, String nomeLiga) {
        super(nomeLiga);
        this.nomeClube = nomeClube;
    }
    
    public String getNomeClube() {
        return nomeClube;
    }
    
    public void setNomeClube(String nomeClube) {
        this.nomeClube = nomeClube;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFunadacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }
    
    @Override
    public String toString() {
        return  "\nNome do clube" + nomeClube +
                "\nAno de fundação:" + anoFundacao + 
                "\nLiga que joga:" + getNomeLiga();
    }

    
    public void fromString (String linha){
        super.fromString(linha);
        String[] dados = linha.split(",");
        
        nomeClube = dados[1].split(":")[1];
        anoFundacao = Integer.parseInt(dados[2].split(":")[1]);
    }


	




}
