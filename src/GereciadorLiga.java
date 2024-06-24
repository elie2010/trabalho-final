import java.util.ArrayList;

public class GereciadorLiga {

    private static ArrayList<Liga > listaLiga = new ArrayList<>();

    public static void salvarLiga (Liga liga){
        listaLiga.add(liga);
    }

    public static ArrayList<Liga> getListaLiga (){
        return listaLiga;
    }

    public static void verificarListaVaziaLigas () throws Exception{
        if (listaLiga.isEmpty()){
            throw new Exception ("\nATENÇÃO:Nenhuma liga cadastrada");
        }
    }

    public static Liga buscarLiga (String liga) throws Exception{
        for (Liga tempLiga : listaLiga){
            if (tempLiga.getNomeLiga().equals(liga)){
                return tempLiga;
            }
        }
        throw new Exception ("\nATENÇÃO:Liga com o nome" + liga + " não encontrda:");
    }
    
    public static void excluirLiga (Liga liga){
        listaLiga.remove(liga);
    }


}
