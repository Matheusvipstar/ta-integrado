package com.github.fabriciofx.ta.banco;


public interface Conta {
	double saldo();
	
	void saque(double valor);
	
	void deposito(double valor);
	
	void juros();
}
