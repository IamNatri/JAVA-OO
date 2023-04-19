package herancaPolimorfismo;

public class Cliente implements Autenticavel {
	
	private Autenticador Autenticador;
	
	public Cliente() {
		this.Autenticador = new Autenticador();
	}
    @Override
    public void setSenha(int senha){
        this.Autenticador.setSenha(senha);
     
    }
    @Override
    public boolean autentica(int senha){
    	return this.Autenticador.autentica(senha);
    	
    }
}
