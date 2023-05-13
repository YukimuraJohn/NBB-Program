package models;

public class Team {
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

  public String toString() {
    return (consultarNome() + " com " + pontosAtuais() + " pontos e tem " + totalVitoria() + " vitorias e " + totalDePontos() + " como total de pontos");
  }
}