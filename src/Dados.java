import  java.util.ArrayList;

/**
 * @author Itamar Gouveia
 */


public class Dados {
   private static ArrayList<Pessoa> listaPessoas = new ArrayList<>(); 

   //metodo GET
   public static ArrayList<Pessoa> getListaPessoas(){
       return listaPessoas;
   }


   //Adiciona um obeto na lista
   static public void adicionar(Pessoa p){
        listaPessoas.add(p);
   }


   //lista os dados de todos os objetos da lista
   static public String listar(){
       String saida ="";
       for(Pessoa p : listaPessoas) {
           saida +=  p.imprimir(); 
       }
       return saida;
   }

   //pesquisar por genero
   static public  String pesquisar(String genero){
       String saida ="";
       for(Pessoa p: listaPessoas){
           if(p.getSexo().equalsIgnoreCase(genero)){
               saida += p.imprimir();
           }
       }
       return saida;
   }

   static public boolean remover(String nome){
       for(Pessoa p: listaPessoas){
           if(p.getNome().equalsIgnoreCase(nome)){
               listaPessoas.remove(p);
               return true;
           }
       }
       return false;
   }

}
