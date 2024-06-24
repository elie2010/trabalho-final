public class EnfretamentoClubes extends Clube {

    private int pontos;
        private int vitoria;
        private int empate;
        private int derrota;
    private int golsMarcados;
    private int golsSofridos;

    public EnfretamentoClubes(String nomeClube, String nomeLiga) {
        super(nomeClube, nomeLiga);
    }

    public EnfretamentoClubes (String nomeClube, String nomeClube1, String nomeLiga, int golsMarcados, int golsSofridos){
        super(nomeClube, nomeLiga);
        this.golsMarcados = golsMarcados;
        this.golsSofridos = golsSofridos;
    }
    
    public void registrarVitoria (int golsMarcados, int golsSofridos){
        this.pontos = 3;
            this.vitoria = 1;
        this.golsMarcados += golsMarcados;
        this.golsSofridos += golsSofridos;
    }

    public void registraEmpate (int golsMarcados, int golsSofridos){
        this.pontos = 1;
            this.empate = 1;
        this.golsMarcados += golsMarcados;
        this.golsSofridos += golsSofridos;
    }

    public void registrarDerota (int golsMarcados, int golsSofridos){
        this.pontos = 0;
            this.derrota = 1;
        this.golsMarcados += golsMarcados;
        this.golsSofridos += golsSofridos;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }

    public void setGolsSofridos(int golsSofridos) {
        this.golsSofridos = golsSofridos;
    }

    @Override
    public String toString() {
        return "\nConfronto entre clubes:" +
                "\nNome da liga:" + getNomeLiga() +
                "\nClube:" + getNomeClube() + getGolsMarcados() +" X " + getGolsMarcados() + getNomeClube();
    }

	

        

}
