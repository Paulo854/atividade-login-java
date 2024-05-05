
public class verificarEntradas {
	String nomeValido = "aluno", senhaValida = "1234";
	public void verificarEntradas(String nome, String senha) throws WrongLoginException{
		if(!nome.equals(nomeValido) || !senha.equals(senhaValida)) {
			throw new WrongLoginException("O valor do campó digitado é inválido");
		}
	}
}
