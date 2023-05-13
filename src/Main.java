import models.*;
import java.util.*;
public class Main {
  public static void main(String[] args) {
    if (args.length < 2) { 
      System.out.println("Utilize como entrada: NBB <arquivo_de_entrada> <valor_k>");
      System.exit(1);
    }

    String nomeArquivo = args[0]+".txt";
    int k = Integer.parseInt(args[1]);

    NBB nbb = new NBB(nomeArquivo);
    
    List<Team> listaAtual = nbb.TeamOrdenadas();
    
    for (int i = 0; i < k; i++) { 
      System.out.print(listaAtual.get(i).toString());
    }
  }
}
