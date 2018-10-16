package Banco;
public abstract class Conta {
	
	private float saldo;
	private String nome;
	protected void setSaldo(float valor, String correntista) {
		this.saldo = valor;
		this.nome = correntista;
	}
	
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public abstract void depositar(float valor);
	
	public abstract void retirar(float valor);

	public void transferirPara(Conta outraConta, float valor) throws Exception {
		this.retirar(valor);
		outraConta.depositar(valor);
	}
	
}