package br.com.caelum.contas.modelo;

/**
 * Classe conta do curso FJ-11
 *
 * @author Kenzo De Albuquerque
 * @version 1.0
 *
 * */
public interface Conta {
  void saca(double valor);
  void deposita(double valor);
  void atualiza(double taxaSelic);
  double getSaldo();
}