
public class Main {

	public static void main(String[] args) {
		
		Cliente paula = new Cliente();
		paula.setNome("Paula Tamires Carneiro");
		
		
		Conta cc = new ContaCorrente(paula);
		cc.depositar(200);
		
		Conta poupanca = new ContaPoupanca(paula);
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
