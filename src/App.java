public class App {
    public static void main(String[] args) throws Exception {
        Liga liga = new Liga("Premier Leguea");
        System.out.println(liga.toString());
        
        Clube clube = new Clube(1909, "Coritiba", "Premier Leguea");
        System.out.println(clube.toString());

        Jogador jogador = new Jogador("Eliedson", "Meia", "Coritiba", "Premier Leguea");
        System.out.println(jogador.toString());
    }

    
}

