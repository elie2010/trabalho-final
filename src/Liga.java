public class Liga {

    private String nomeLiga;

    public Liga (String nomeLiga) {
        this.nomeLiga = nomeLiga;
    }

    public String getNomeLiga() {
        return nomeLiga;
    }

    public void setNomeLiga(String nomeLiga) {
        this.nomeLiga = nomeLiga;
    }

    @Override
    public String toString() {
        return "\nLiga criada:" + nomeLiga;
    }
    
    public void fromString (String linha){

        String[] dados = linha.split(",");
        
        nomeLiga = dados[0].split(":")[1];
        
    }


    

    




}
