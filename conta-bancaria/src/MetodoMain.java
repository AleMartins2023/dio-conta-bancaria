public class MetodoMain {
    public static void main(String[] args) {
	
		Cliente venilton = new Cliente();
		venilton.setNome("venilton");
		
		
		Conta cc = new ContaCorrente(venilton);
		ContaPoupanca poupanca = new ContaPoupanca(venilton);
		

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();		
		
	}

}
