package entidades;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;
	
	public Conta() {
		
	}

	
	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
		
			
	}
	
	public Conta(int valor1, String valor2, double valor3) {
		this.numero = valor1;
		this.titular = valor2;
		this.saldo = valor3;
		
	}
	
	public int getNumero() {
		return numero;
	}


	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void Deposito(double valorDeposito) {
		saldo += valorDeposito;
	}
	public void saque(double valorSaque) {
		saldo -= valorSaque+5;
	}
	
	public String toString() {
		return "Conta "
				+ numero
				+ ", Titular: "
				+ titular
				+ ", Saldo: $ "
				+ String.format("%.2f", saldo);
	}

}
