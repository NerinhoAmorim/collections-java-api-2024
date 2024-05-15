package main.java.map.ordenacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
	Map<LocalDate, Evento> eventosMap;

	public AgendaEventos() {
		this.eventosMap = new HashMap<>();
	}

	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		Evento evento = new Evento(nome, atracao);
		eventosMap.put(data, new Evento(nome, atracao));
	}

	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		System.out.println(eventosTreeMap);
	}

	public void obterProximoEvento() {
//		Set<LocalDate> keySet = eventosMap.keySet();
//		Collection<Evento> values = eventosMap.values();
		LocalDate dataAtual = LocalDate.now();
		LocalDate proximaData = null;
		Evento proximoEvento = null;
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
			if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				proximaData = entry.getKey();
				proximoEvento = entry.getValue();
				System.out.println("O próximo evento: " + proximoEvento + "acontecerá na data " + proximaData);
				break;
			}
		}

	}

	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();
		agendaEventos.exibirAgenda();

		agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MAY, 5), "Evento 1 ", "Atracao 1 ");
		agendaEventos.adicionarEvento(LocalDate.of(2024, 8, 25), "Evento 2 ", "Atracao 2 ");
		agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 10), "Evento 3 ", "Atracao 3 ");
		agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MARCH, 13), "Evento 4 ", "Atracao 4 ");
		agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MAY, 15), "Evento 5 ", "Atracao 5 ");
		agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 11), "Evento 6 ", "Atracao 6 ");
		agendaEventos.exibirAgenda();
		
		agendaEventos.obterProximoEvento();
	}

}
