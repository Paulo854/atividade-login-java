import javax.swing.JOptionPane;

public class Login {

	public static void main(String[] args) {
		verificarCampo verifica = new verificarCampo();	
		ProcessaLogin loginVerifica = new ProcessaLogin();
		verificarEntradas verificadoEntrada = new verificarEntradas();
		String nomeUsuario, senhaUser;
		boolean continuar = true;
		do {
		try {
			nomeUsuario = JOptionPane.showInputDialog("Infome seu nome de usuario");
			senhaUser = JOptionPane.showInputDialog("Infome sua senha de acesso");
			
			verifica.verificarCampo(nomeUsuario);
			verifica.verificarCampo(senhaUser);
			loginVerifica.setNome(nomeUsuario);
			loginVerifica.setSenha(senhaUser);
			verificadoEntrada.verificarEntradas(nomeUsuario, senhaUser);
			loginVerifica.verifica();
			continuar = false;
		}catch(EmptyFieldException e) {
			 System.out.println("Erro: " + e.getMessage());	
		}catch(WrongLoginException e) {
			System.out.println("Erro: " + e.getMessage());	
		}
	}while(continuar);
	}
}
