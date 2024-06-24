import java.util.ArrayList;

public class GerenciadorEnfretamentoClubes {

    private static ArrayList<EnfretamentoClubes > listajogos = new ArrayList<>();

    public static void registraResultado (EnfretamentoClubes clube, int golsClube,EnfretamentoClubes liga, EnfretamentoClubes clube1, int golsClube1){
        System.out.println("\nJogo pela " + liga.getNomeLiga());
        System.out.println("\nJogo" + clube.getNomeClube() + " X " + clube1.getNomeClube() );
        System.out.println("Placar:" + clube.getNomeClube() + golsClube + " x " + clube1.getNomeClube() + golsClube1);
        if (golsClube > golsClube1){
            clube.registrarVitoria(golsClube, golsClube1);
            clube1.registrarDerota(golsClube, golsClube1);
            System.out.println("\nClube:" + clube.getNomeClube() + golsClube +" venceu o " + clube1.getNomeClube() + golsClube1);
        } else if (golsClube < golsClube1){
            clube.registrarDerota(golsClube, golsClube1);
            clube1.registrarVitoria(golsClube, golsClube1);
            System.out.println("\nClube:" + clube1.getNomeClube() + golsClube1 +" venceu o " + clube.getNomeClube() + golsClube);
        } else {
            clube.registraEmpate(golsClube, golsClube1);
            clube1.registraEmpate(golsClube, golsClube1);
            System.out.println("\nClube:" + clube.getNomeClube() + golsClube +" empataram " + clube1.getNomeClube() + golsClube1);
        }
        
        EnfretamentoClubes jogo = new EnfretamentoClubes(clube.getNomeClube(), clube1.getNomeClube(), liga.getNomeLiga(), golsClube, golsClube1);
    }

    public static void salvarJogo (EnfretamentoClubes jogo){
        listajogos.add(jogo);
    }

    public static ArrayList<EnfretamentoClubes > getListaJogos (){
        return listajogos;
    }

    public static void verificarListaVaziaJogos () throws Exception {
        if(listajogos.isEmpty()){
            throw new Exception ("\nATENÇÃO:Não nenhum jogo na liga:");
        }
    }

    

}

    

    


