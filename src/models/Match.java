package models;

import java.util.*;

public class Match {
  
  private Team team1;
  private Team team2;

  
  public Match(Team team1, Team team2) {
    this.team1 = team1;
    this.team2 = team2;
  }

  public static Team buscarOuCriarTeam(List<Team> teams, String nome) {
    for (Team team : teams) { 
      if (team.consultarNome().equals(nome)) {
        return team;
      }
    }
    Team team = new Team(nome);
    teams.add(team);
    return team;
  }


  public Team buscarTime(List<Team> teams, String nome) {
    for (Team team : teams) { 
      if (team.consultarNome().equals(nome)) {
        return team;
      }
    }
    return null;
  }

  public Team buscarTime1() {
    return team1;
  }
  
  public Team buscarTime2() {
    return team2;
  }

  public void matchVictory( ) {
    if ( team1.pontosAtuais() < team2.pontosAtuais()) {
      team2.incrementaVitoria();
    } else {
      team1.incrementaVitoria();
    }
  }

  public String toString() {
    return (team1.consultarNome() + " " + team1.pontosAtuais() + " x " + team2.pontosAtuais() + " " + team2.consultarNome());
  }
}
