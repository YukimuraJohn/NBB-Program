import models.*;

public class Main {
  public static void main(String[] args) {
    // if (args.length < 2) { 
    //   System.out.println("Utilize como entrada: NBB <arquivo_de_entrada> <valor_k>");
    //   System.exit(1);
    // }

    String nomeArquivo = "EntradaAd2.txt" ;//args[0];
    int k = 1;//Integer.parseInt(args[1]);

    NBB nbb = new NBB(nomeArquivo, k);
  }
}
