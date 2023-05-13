package models;
import java.io.*;
import java.util.*;

public class NBB {
  
  private static List<Match> listaPartidas = new ArrayList<>();
  //private static Map<String, Team> teamMap = new HashMap<>();
  private List<Team> teams = new ArrayList<>();

  public NBB(String fileName) {
    
    // BufferedReader inp;

    try ( BufferedReader inp = new BufferedReader(new FileReader(fileName));) {
      
      String line;
      // Map<String, Integer> listTeam = new HashMap<>();

      while ((line = inp.readLine()) != null) {
        String lineS[] = line.split("/");
        // Nome e pontos do time1 estão na [1] e [3] da lista lines[]
        String nomeT1 = lineS[1];
        int pontoT1 = Integer.parseInt(lineS[3]);
        // Nome e pontos do time2 estão na [2] e [4] da lista lines[]
        String nomeT2 = lineS[2];
        int pontoT2 = Integer.parseInt(lineS[4]);
        
        // inicio o objeto t1 e atualizo o valor de pontos para o atual
        Team team1 = Match.buscarOuCriarTeam(teams, nomeT1);
        Team team2 = Match.buscarOuCriarTeam(teams, nomeT2);

        team1.somaPontos(pontoT1);
        team2.somaPontos(pontoT2);

        Match atualMatch = new Match(team1, team2);
        atualMatch.matchVictory();
        
        listaPartidas.add(atualMatch); 
      }
      
      Collections.sort(teams);

      inp.close();
    } catch (Exception e) {
      System.out.println("Exceção na leitura do arquivo.");
    } finally {
      
    }
  }

  public List<Team> TeamOrdenadas() {
    return this.teams;
  }
}


