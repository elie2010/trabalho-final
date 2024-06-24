import java.util.ArrayList;

public class GerenciadorJogador {

    private static ArrayList<Jogador > listaJogadores = new ArrayList<>();


    public static void salvarJogador (Jogador jogador){
        listaJogadores.add(jogador);
    }

    public static ArrayList<Jogador > getListaJogadores (){
        return listaJogadores;
    }

    public static void verificarListaVaziaJogador () throws Exception{
        if(listaJogadores.isEmpty()){
            throw new Exception ("\nATENÇÃO:Não ha jogadores na liga!");
        }
    }

    public static Jogador buscarJogador (String nomeJogador) throws Exception{
        for (Jogador tempJogador : listaJogadores){
            if (tempJogador.getNomeJogador().equals(nomeJogador));
            return tempJogador;
        }
        throw new Exception ("\nATENÇÃO:Jogador com o nome " + nomeJogador + " não encontrado:");
    }

    public static void excluirJogador (Jogador jogador){
        listaJogadores.remove(jogador);
    }

    



}
