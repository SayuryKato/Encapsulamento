package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class Aplicacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Conta conta = new Conta();
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o numero da conta: ");
		int numero = sc.nextInt();
	
		System.out.println("Digite o nome do titular: ");
		String nome = sc.next();
		conta.setTitular(nome);
		
		System.out.println("Deseja depositar um valor? (s/n)");
		String resposta = sc.next();
		if(resposta.equals("s")) {
			System.out.println("Digite o valor que deseja depositar: ");
			double valor = sc.nextDouble();
			conta = new Conta(numero, nome, valor);
			//System.out.println(conta);
			
		}
		else {
			conta = new Conta(numero, nome);
			//System.out.println(conta);
		}
		System.out.println(conta);
		
		System.out.println("Digite um valor de deposito: ");
		conta.Deposito(sc.nextDouble());
		System.out.println("Dados atualizados da conta:\n"+conta);
		System.out.println("Digite o valor de saque:");
		conta.saque(sc.nextDouble());
		System.out.println("Dados atualizados da conta:\n"+conta);
		
		sc.close();			

	}

}
