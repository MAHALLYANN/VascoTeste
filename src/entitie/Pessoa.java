package entitie;

public class Pessoa {
     
	private String Nome;
	private Integer Idade;
	private String Cidade;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, Integer idade, String cidade) {
		Nome = nome;
		Idade = idade;
		Cidade = cidade;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Integer getIdade() {
		return Idade;
	}

	public void setIdade(Integer idade) {
		Idade = idade;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	
	public int calcIdade(){
	    return Idade * 12;
	}

	@Override
	public String toString() {
	    StringBuilder builder = new StringBuilder();
	    builder.append("Quantidade é: ");
	    builder.append(calcIdade());

	    return builder.toString();
	}
}
