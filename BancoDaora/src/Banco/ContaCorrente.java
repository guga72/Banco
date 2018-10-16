package Banco;

public class ContaCorrente extends Conta{
	private float saldo;
	private String nome;
	protected void setSaldo(float valor, String correntista) {
		this.saldo = valor;
		this.nome = correntista;
	}
	
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
	
	
	public void retirar(float valor) {
		this.saldo = this.saldo - valor;
	}

	public void transferirPara(Conta outraConta, float valor) throws Exception {
		this.retirar(valor);
		outraConta.depositar(valor);
	}
}
