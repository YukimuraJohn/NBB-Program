package models;

public class Team implements Comparable<Team> {
  private String nome;
  private int pontos = 0, qnt_vit = 0;
  private int qnt_total_pt = 0;
  
  public Team(String nome) {
    this.nome = nome;
  }

  public String consultarNome() {
    return this.nome;
  }

  public void somaPontos(int pontos) { 
    this.pontos = pontos;
    this.qnt_total_pt += pontos;
  }

  public int pontosAtuais() {
    return this.pontos;
  }
  
  public int totalDePontos() {
    return this.qnt_total_pt;
  }

  public void incrementaVitoria() {
    this.qnt_vit++;
  }

  public int totalVitoria() { 
    return this.qnt_vit;
  }

  @Override
  public int compareTo(Team otherTeam) {
    if (this.qnt_vit > otherTeam.totalVitoria()) {
      return -1;
    } else if (this.qnt_vit < otherTeam.totalVitoria()) {
      return 1;
    } else {
      if (this.qnt_total_pt > otherTeam.totalDePontos()) {
        return -1;
      } else {
        return 1;
      }
    }
  }

  @Override
  public String toString() {
    return (consultarNome() + " com " + totalVitoria() + " de vitorias e " + totalDePontos() + " como total de pontos" + System.lineSeparator());
  }
}
