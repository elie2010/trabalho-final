public class App {
    public static void main(String[] args) throws Exception {
        Clube clube = new Clube("Coritiba", "Brasileiro", "1980");

        Jogador jogador = new Jogador("Eliedson", "Meia", "23/06/2003" , "3 anos", clube);

        System.out.println(jogador.toString());
    }

    
}

