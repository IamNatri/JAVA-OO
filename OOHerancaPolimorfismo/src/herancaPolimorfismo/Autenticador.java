package herancaPolimorfismo;


// mantem a lógica de autenticacao em um unico lugar
public class Autenticador {
	   private int senha;

	    
	    public void setSenha(int senha){
	        this.senha = senha;
	    }
	    
	    public boolean autentica(int senha){
	        if(this.senha == senha){
	           return true;
	        } else {
	            return false;
	        }
	    }
}