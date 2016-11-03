package com.github.fabriciofx.ta.banco;


public interface Conta {
	double saldo();
	
	void saque(double valor);
	
	void deposito(float valor);

	void deposito(int valor);
}
