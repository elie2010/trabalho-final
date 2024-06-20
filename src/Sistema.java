public class Sistema {

    private static void exibirMenu (){
        System.out.println("\nBem vindo ao Fut fácil:" + "\n escolha uma opção:");
        System.out.println("1)Cadastrar uma liga:");
        System.out.println("2)Cadastra clube:");
        System.out.println("3)Cadastrar jogador:");
        System.out.println("4)Listar clubes cadastrados:");
        System.out.println("5)Listar jogadores cadastrados:");
        System.out.println();
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

}
