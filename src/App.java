import java.util.Scanner;


public class App {
    
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Scanner entradaString = new Scanner(System.in);

    int menu;
    Pessoa objPessoa;
    String nome, sexo;

    do{
        exibirMenu();
        menu = entrada.nextInt();

        switch(menu){
            case 1:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Informe o nome: ");
                nome = entradaString.nextLine();
                System.out.println("Informe o sexo: (F ou M) ");
                sexo = entradaString.nextLine();
                objPessoa = new Pessoa(nome, sexo);
                Dados.adicionar(objPessoa);
                break;
            case 2:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Exluir");
                System.out.println("Informe o nome");
                nome = entradaString.nextLine();
                if(! (Dados.getListaPessoas().isEmpty())){
                      if(Dados.remover(nome)){
                        System.out.println("Nome excluído");
                      } else{
                          System.out.println("Nome nao encontrado");
                      } 
                }else{
                    System.out.println("Não tem ninguem na lista");
                }    
            break;
            case 3:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                if( (Dados.getListaPessoas().isEmpty())){
                    System.out.println("==========Não há nomes para exibir!=============\n\n\n");
                    
                }else{
                    System.out.println("listagem de pessoas");
                    System.out.println(Dados.listar());
                }
                break;
            case 4:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("pesquisar por genero");
                System.out.println("Informe F ou M");
                sexo = entradaString.nextLine();
                System.out.println(Dados.pesquisar(sexo));
                break;
            default:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("opcao invalida");
        }
    }while(menu !=0);

}

static void exibirMenu(){
    System.out.println("==============Cadastro de Pessoas================");
    System.out.println("1 - Incluir");
    System.out.println("2 - Excluir");
    System.out.println("3 - Listar todos");
    System.out.println("4 - Listar por genero");
    System.out.println("0 - Sair");
}

}