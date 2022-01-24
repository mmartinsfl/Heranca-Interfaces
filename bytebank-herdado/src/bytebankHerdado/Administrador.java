package bytebankHerdado;

public class Administrador extends Funcionario implements Autenticavel {
	 

	private AutenticacaoUtil autenticador;

	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do Gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
	return  this.autenticador.autentica(senha);
	
	}
	
}
