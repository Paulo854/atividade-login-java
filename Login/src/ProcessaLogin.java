import javax.swing.*;
public class ProcessaLogin {

	private static final String nome = "aluno";
	private static final String senha = "1234";
	private String senhaVerifca;
	private String nomeVerifca;
	private boolean validador = false;
	
	public void setSenha(String senha) {
		this.senhaVerifca = senha;
	}
	public String getSenha() {
		return this.senhaVerifca;
	}
	public void setNome(String nome) {
		this.nomeVerifca = nome;
	}
	public String getNome() {
		return this.nomeVerifca;
	}
		
	public void verifica() {
		if(this.nomeVerifca.equals(nome)) {
			if(this.senhaVerifca.equals(senha)) {
			JOptionPane.showMessageDialog(null, "Bem vindo Aluno");
			return;
			}else {
				JOptionPane.showMessageDialog(null, "Nome ou senha invalida");
				return;
			}
		}else {
			JOptionPane.showMessageDialog(null, "Nome ou senha invalida");
			return;
		}
	}
}
