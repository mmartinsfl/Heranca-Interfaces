package bytebankHerdado;

public class TesteFuncionario {
public static void main(String[] args) {
	
	Gerente jorge = new Gerente ();
	jorge.setNome("Jorge Papagaio");
	jorge.setCpf("142698985-90");
	jorge.setSalario(3000.85);
	
	
	System.out.println(jorge.getNome());
	System.out.println(jorge.getBonificacao());
	
	
	
}
}
