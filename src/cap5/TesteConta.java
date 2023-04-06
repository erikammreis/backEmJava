package cap5;

public class TesteConta {
	public static void main(String[] args) {
		Conta contaCorrente = new Conta();
		Conta contaPoupaca = new Conta();
		Conta contaInvestimento = new Conta();	
		
		contaCorrente.numero = 11;
		contaCorrente.saldo = 20.50;
		contaCorrente.cliente.nome = "Erika";
		contaCorrente.cliente.idade = 22;
		
		contaPoupaca.numero = 22;
		contaPoupaca.saldo = 33.50;
		contaPoupaca.cliente.nome = "Breno";
		contaPoupaca.cliente.idade = 23;
		
		contaInvestimento.numero = 58;
		contaInvestimento.saldo = 500.20;
		contaInvestimento.cliente.nome = "Maria";
		contaInvestimento.cliente.idade = 21;
		
		
		System.out.println(contaCorrente.numero);
		System.out.println(contaCorrente.saldo);
		System.out.println(contaCorrente.cliente.nome);
		System.out.println(contaCorrente.cliente.idade);
		
		
		
		}

}
