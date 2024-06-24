import java.util.ArrayList;

public class Sistema {

    private static ArrayList<Clube > listaClubes = new ArrayList<>(); 
    private static ArrayList<EnfretamentoClubes > listajogos = new ArrayList<>();

    private static void exibirMenu (){
        System.out.println("\nBem vindo ao Fut fácil:" + "\n escolha uma opção:");
        System.out.println("1)Cadastrar uma liga:");
        System.out.println("2)Cadastra clube:");
        System.out.println("3)Cadastrar jogador:");
        System.out.println("4)Listar clubes cadastrados:");
        System.out.println("5)Buscar jogadores cadastrados:");
        System.out.println("6)Partida entre clubes:");
        System.out.println("7)Listar partidas:");
    }

    
    private static void cadastrarLiga () throws Exception{
        System.out.println("\nCadastro de liga");
        String nomeLiga;
        while (true) {
            System.out.println("\nNome da liga");
            nomeLiga = Console.lerString();
            if (GereciadorLiga.buscarLiga(nomeLiga) != null){
                System.out.println("\nATENÇÃO:Liga ja cadastrada no sistema");
            } else {
                break;
            }
        }
        Liga liga = new Liga(nomeLiga);
        GereciadorLiga.salvarLiga(liga);
        System.out.println("\nLiga cadatrada com sucesso:");
    }

    private static void cadastrarClube () throws Exception{
        System.out.println("\nCadastro de clube:");

        String nomeClube;
        while (true) {
            System.out.println("Nome do clube:");
            nomeClube = Console.lerString();
            if (GerenciadorClubes.buscarClube(nomeClube) != null){
                System.out.println("\nATENÇÃO:Clube ja cadastrado no sistema!");
            } else {
                break;
            }
        }
        System.out.println("Liga que disputada:");
        String nomeliga = Console.lerString();
        System.out.println("Ano de fundação do clube:");
        int anoFundacao = Console.lerInt();
        Clube clube = new Clube(anoFundacao, nomeClube, nomeliga);
        GerenciadorClubes.salvarClube(clube);
        System.out.println("\nClube cadastrado com sucesso...");
    }

    private static void cadastrarJogador (){
        System.out.println("\nCadastrar jogador:");
        System.out.println("Nome do jogador:");
        String nomeJogador = Console.lerString();
        System.out.println("Posição que atua:");
        String posicao = Console.lerString();
        System.out.println("Clube que atua:");
        String clube = Console.lerString();
        System.out.println("Liga que atua:");
        String nomeLiga = Console.lerString();
        Jogador jogador = new Jogador(nomeJogador, posicao, clube, nomeLiga);
        GerenciadorJogador.salvarJogador(jogador);
        System.out.println("\nJogador cadastrado com sucesso...");
    }

    private static void listarClubes (){
        System.out.println("\nLista de clubes cadastrados:");
        try {
            GerenciadorClubes.verificarListaVaziaClubes();
            System.out.println("\nNão há clubes cadastrados:");

            for (Clube tempClube : listaClubes){
                System.out.println(tempClube.toString());
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }

    private static void buscarJogador (){
        try{
            GerenciadorJogador.verificarListaVaziaJogador();
            System.out.println("\nBusca de jogadores:");
            System.out.println("Nome do jogador:");
            String nomeJogador = Console.lerString();
            Jogador jogador = GerenciadorJogador.buscarJogador(nomeJogador);
            System.out.println("\nJogador encontrado:");
            System.out.println(jogador.toString());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void buscarClube (){
        try {
            GerenciadorClubes.verificarListaVaziaClubes();
            System.out.println("\nBuscar clube:");
            System.out.println("Nome do clube:");
            String nomeClube = Console.lerString();
            Clube clube = GerenciadorClubes.buscarClube(nomeClube);
            System.out.println("\nClube encontrado");
            System.out.println(clube.toString());
        } catch (Exception e){
            System.out.println(e.getMessage());
    }
    }

    private static void buscarLiga (){
        try {
            GereciadorLiga.verificarListaVaziaLigas();
            System.out.println("\nBuscar liga:");
            System.out.println("Nome do liga:");
            String nomeLiga = Console.lerString();
            Liga liga = GereciadorLiga.buscarLiga(nomeLiga);
            System.out.println("\nLiga encontrada");
            System.out.println(liga.toString());
        } catch (Exception e){
            System.out.println(e.getMessage());
    }
    }

    private static void timesEnfrentar (){
        try {
            GerenciadorClubes.verificarListaVaziaClubes();
            System.out.println("\nPartida:");
            System.out.println("\nNome da liga:");
            String nomeliga = Console.lerString();
            System.out.println("Nome do time mandante: ");
            String nomeClube  = Console.lerString();
            System.out.println("Nome do time visitante: ");
            String nomeClube1 = Console.lerString();
            System.out.println("Gols do time mandante: ");
            int golsClube = Console.lerInt();
            System.out.println("Gols do time visitante: ");
            int golsClube1 = Console.lerInt();
            EnfretamentoClubes clube = (EnfretamentoClubes) GerenciadorClubes.buscarClube(nomeClube);
            EnfretamentoClubes clube1 = (EnfretamentoClubes) GerenciadorClubes.buscarClube(nomeClube1);
            EnfretamentoClubes liga = (EnfretamentoClubes) GereciadorLiga.buscarLiga(nomeliga);
            EnfretamentoClubes jogo = new EnfretamentoClubes(nomeClube, nomeClube1, nomeliga, golsClube, golsClube1);
            if (clube != null && clube1 != null) {
                GerenciadorEnfretamentoClubes.registraResultado(clube, golsClube, liga, clube1, golsClube1);
                GerenciadorEnfretamentoClubes.salvarJogo(jogo);
            } else {
                throw new Exception("ATENÇÃO:Um ou ambos clubes não encontrados!");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        } 
    }

    private static void listarJogos (){
        System.out.println("\nLista de jogos realizados:");
        try {
            GerenciadorEnfretamentoClubes.verificarListaVaziaJogos();
            System.out.println("\nNão há jogos realizados:");

            for (EnfretamentoClubes tempJogos : listajogos){
                System.out.println(tempJogos.toString());
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }

    private static void verificarOpcao (int op) throws Exception {
        switch (op) {
            case 1:
                cadastrarLiga();
                break;
            case 2:
                cadastrarClube();
                break;
            case 3:
                cadastrarJogador();
                break;
            case 4:
                listarClubes();
                break;
            case 5:
                buscarJogador();    
                break;
            case 6:
                timesEnfrentar();
                break;
            case 7:
                listarJogos();
                break;
            default:
                System.out.println("ATENÇÃO:Opção invalída ! Digite novamente:");
                break;
        }
    }

    public static void executar () throws Exception{
        int op;
        do {
            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);
        } while (op != 0);
    }




}








