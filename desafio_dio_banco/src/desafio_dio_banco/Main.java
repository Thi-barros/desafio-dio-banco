package desafio_dio_banco;

public class Main {

	private static Banco banco = new Banco();
	
	public static void main(String[] args) {
		
		banco.setNome("INTER");
		
		Cliente thiago = new Cliente();
		thiago.setNome("Thiago");
		Cliente joao = new Cliente();
		joao.setNome("João");
		Cliente lenita = new Cliente();
		lenita.setNome("Lenita");
		
		Conta cc1 = new ContaCorrente(lenita);
		cc1.depositar(50);
		
		Conta cc = new ContaCorrente(thiago);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(joao);

		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		cc1.imprimirExtrato();
		
	}

}
