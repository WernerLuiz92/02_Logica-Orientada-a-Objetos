package br.com.treinaweb.odontoclinica.classes;

public class Paciente {
	private int codigo;
	private String nome;
	private String sobrenome;
	private int idade;
	private String sexo;
	private String telefone;
	private String endereco;
	
	public Paciente(int codigo, String nome, String sobrenome, int idade, String sexo, String telefone, String endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.sexo = sexo;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void marcaConsulta(String dentista) {
		System.out.println("Marcando uma consulta com o dentista "+ dentista);
	}
	
	public void remarcaConsulta(String dentista) {
		System.out.println("Remarcando a consulta com o dentista "+ dentista);
	}
	
	public void cancelaConsulta(String dentista) {
		System.out.println("Cancelando a consulta com o dentista "+ dentista);
	}
	
	public void consultaConsulta(String dentista) {
		System.out.println("O paciente "+ this.nome +" "+ this.sobrenome +" está em consulta com o dentista "+ dentista);
	}
}
