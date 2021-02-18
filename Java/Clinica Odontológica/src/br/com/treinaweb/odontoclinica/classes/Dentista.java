package br.com.treinaweb.odontoclinica.classes;

public class Dentista {
	private String inscricaoCRO;
	private String nome;
	private String sobrenome;
	private String especialidade;
	private boolean estado;
	
	public Dentista(String nome, String sobrenome, String especialidade, String inscricaoCRO,
			boolean estado) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.especialidade = especialidade;
		this.inscricaoCRO = inscricaoCRO;
		this.estado = estado;
	}
	
	public String getInscricaoCRO() {
		return inscricaoCRO;
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
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public boolean getEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public void atendePaciente(String nomePaciente) {
		System.out.println("O dentista "+ nome +" "+ sobrenome + " está atendendo o paciente "+ nomePaciente);
	}
	
	public void agendaConsulta(String paciente) {
		System.out.println("Agendando consulta com o paciente " + paciente);
	}
	
	public void remarcaConsulta(String paciente) {
		System.out.println("Reagendando a consulta com o paciente " + paciente);
	}
	
	public void cancelaConsulta(String paciente) {
		System.out.println("Cancelando a consulta com o paciente " + paciente);
	}
	
	public void emViagem() {
		System.out.println("Viajou para Congresso.");
		this.estado = false;
	}
}
