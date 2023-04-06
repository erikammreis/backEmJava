package cap5;

public class Conta {
	int numero;
	double saldo;
	int agencia;

	
	Cliente cliente = new Cliente();
	
    public  Conta() {
	
    }
	
	public double recuperarSaldo() {
		return saldo;
		
	}
	public void depositar(double valor, int agencia, String numeroConta) {
		saldo += valor;
		
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	} 
	
	public void retirar(double valor) {
		saldo -= valor;
	}
	
	
}


