package br.com.caelum.contas.modelo;

public class SeguroDeVida implements ContaTributavel {
  private double valor;
  private String titular;
  private int numeroApolice;

  @Override
  public void saca(double valor) {

  }

  @Override
  public void deposita(double valor) {

  }

  @Override
  public void atualiza(double taxaSelic) {

  }

  @Override
  public double getSaldo() {
    return 0;
  }

  protected String getTipo() {
    return "Seguro de Vida";
  }

  @Override
  public double getValorImposto() {
    return ((this.valor + 42) * 0.02);
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public int getNumeroApolice() {
    return numeroApolice;
  }

  public void setNumeroApolice(int numeroApolice) {
    this.numeroApolice = numeroApolice;
  }
}
