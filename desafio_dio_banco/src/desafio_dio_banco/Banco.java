package desafio_dio_banco;

import java.util.List;

public class Banco {
	
	private String nome;
	private List<Conta> contas;

	public void ListarClientes() {
		System.out.println("Todos os clientes do banco "+ this.nome);
		
		for(Conta conta: contas) {
			System.out.println(conta.getCliente().getNome());
		}
	}
	
	public String getNome() {
		return nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
