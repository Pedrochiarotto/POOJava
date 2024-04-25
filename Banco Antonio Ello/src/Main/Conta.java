package Main;


public class Conta {

	private int numero;
	private String nome;
	private float saldo;
	
	
	public void setnumero(int n) {
		numero = n;		
	}
	
	public void getnumero() {
		return numero;
	}
	
	public void setnome(String name) {
		nome = name;
	}
	
	public void getnome(){
		return nome;
	}
	
	public void setsaldo(float s) {
		saldo = s;
	}
	
	public void getsaldo() {
		return saldo;
	}
	
	//Método para depositar dinheiro na conta.
	public void depositar(Double valor) {
		saldo += valor;	
	}
	
	//Método parar sacar dinheiro da conta.
	public void sacar (Double valor) {
		if (saldo < valor) {
			System.out.println("Saldo indisponível");
		}else {
			saldo -= valor;
			System.out.println("Saque de "+ valor + " reais realizado com sucesso!");
		}		
	}
	
	//Método para imprimir o saldo da conta bancária.
	public void imprimirSaldo() {
		System.out.println("Saldo atual: "+saldo);
	}
	
	//Método para imprimir os dados da conta bancária
	public void dadosConta() {
		System.out.println("Numero: "+numero);
		System.out.println("Saldo: "+saldo);
		System.out.println("Nome do titular: "+nome);	
	}
	
	
	

}
