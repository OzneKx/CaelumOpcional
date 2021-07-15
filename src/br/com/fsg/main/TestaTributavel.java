package br.com.fsg.main;

import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.Tributavel;

public class TestaTributavel {
  public static void main(String[] args) {
    ContaCorrente contaCorrente = new ContaCorrente();
    contaCorrente.deposita(100.0);
    System.out.println(contaCorrente.getValorImposto());

    Tributavel tributavel = contaCorrente;
    System.out.println(tributavel.getValorImposto());
  }
}

