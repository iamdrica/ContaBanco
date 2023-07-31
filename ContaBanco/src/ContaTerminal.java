import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String []args) throws Exception {
		
		Locale.setDefault(Locale.US);
		Scanner insere = new Scanner (System.in);
		
		
		System.out.println("Por favor, digite o numero da Agência!");
		int numero = insere.nextInt();
		
		System.out.println("Digite a sua agencia!");
		String agencia = insere.next();
		
		System.out.println("Digite o seu nome!");
		String nomeCliente = insere.next();
		
		System.out.println("Digite o valor do seu saldo!");
		double saldo = insere.nextDouble();
		
		System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso "
				+ "banco, sua agencia é " + agencia + "," + "conta " + numero + " e o seu saldo R$" 
				+ saldo + " já está disponível para saque.");
		
	}

}
