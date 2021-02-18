package br.com.treinaweb.odontoclinica.app;

import br.com.treinaweb.odontoclinica.classes.*;

public class Programa {
	
	public static void main(String[] args) {
		
		Dentista dentista = new Dentista(
				"Pedro", 
				"Pedroso", 
				"Cirurgião Dentista", 
				"RS15236",
				true
		);
		
		Paciente paciente = new Paciente(
				1, 
				"Werner Luiz", 
				"Gottschalt", 
				29, 
				"Masculino", 
				"(55) 9-9180-8121", 
				"Rua Osvaldo Rieck, 79 - Ap 403"
		);
		
		dentista.atendePaciente(paciente.getNome());
		dentista.agendaConsulta(paciente.getNome());
		dentista.remarcaConsulta(paciente.getNome());
		dentista.cancelaConsulta(paciente.getNome());
		dentista.emViagem();
		
		paciente.marcaConsulta(dentista.getNome());
		paciente.remarcaConsulta(dentista.getNome());
		paciente.cancelaConsulta(dentista.getNome());
		paciente.consultaConsulta(dentista.getNome());
		
	}
	
}
