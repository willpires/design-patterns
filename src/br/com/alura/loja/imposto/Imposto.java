package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {
	private Imposto outro;
	protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

	public Imposto(Imposto outro) {
		this.outro = outro;
	}

	public  BigDecimal efetuarCalcular(Orcamento orcamento){
	 BigDecimal valorImposto = realizarCalculo(orcamento);
	 BigDecimal valorOutroImposto = BigDecimal.ZERO;
		if (valorOutroImposto != null) {
			valorOutroImposto = outro.realizarCalculo(orcamento);
		}
		return  valorImposto.add(valorImposto);
	}

}
