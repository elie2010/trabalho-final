import java.util.ArrayList;

public class GerenciadorClubes {

    private static ArrayList<Clube > listaClubes = new ArrayList<>();

    public static void adicionarClubes (Clube clube){
        listaClubes.add(clube);
    }

    //Listar Clubes 
    public static ArrayList<Clube > getListarClubes (){
        return listaClubes;
    }

    public static void verificarListaVaziaClubes () throws Exception{
        if(listaClubes.isEmpty()){
            throw new Exception ("\nATENÇÃO:Não há nenhum clube cadastrado");
        }
    }



    public static Clube buscarClube (String nomeClube) throws Exception{
        for(Clube tempClube : listaClubes){
            if(tempClube.getNomeClube().contains(nomeClube)){
                return tempClube;
            }
        }
        throw new Exception ("\nATENÇÃO:Clube com o nome " + nomeClube + " não encontrado...");
    }


}
