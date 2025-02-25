package entities;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO conhecer e importar a classe Scanner
		
		// Exibr as mensagens para o nosso usuário
		
		//Obter pela scanner os valores digitados no terminal
		
		//Exibir a mensagem conta criada
		
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US); 
		
		System.out.println("Informe Numero da Conta:");
		numero = sc.nextInt();
	    sc.nextLine();
		System.out.println("Informe Numero da Agencia:");
		agencia = sc.nextLine();
		System.out.println("Informe Nome do Cliente:");
		nomeCliente = sc.nextLine();
		System.out.println("Informe Saldo da Conta:");
		saldo =  sc.nextDouble();
		
		sc.close();
		
		System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência "
				+ "é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
		
		
		

	}

}
