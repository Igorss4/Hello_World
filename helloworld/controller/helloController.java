package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

	@GetMapping("/hello")
	public String hello() {
		return "!Hello World!";
	}
	@GetMapping("/bsm")
	public String bsm() {
		return "			!LISTA DE BSM GENERATION!\n"
				+ "\nBSM-0 - Introdução às Habilidades Comportamentais e Mentalidades"
				+ "\nBSM-GM - Mentalidade de Crescimento"
				+ "\nBSM-P - Persistência"
				+ "\nBSM-PR - Responsabilidade Pessoal"
				+ "\nBSM-FO - Orientação ao Futuro"
				+ "\nBSM-C - Comunicação"
				+ "\nBSM-OD - Orientação ao Detalhe"
				+ "\nBSM-PA - Proatividade"
				+ "\nBSM-T - Trabalho em Equipe\n"
				+ "\n			 !OUTRAS ATIVIDADES!\n"
				+ "\nC-GG - Dar e Receber"
				+ "\nSA-CS1 - Estudo de Caso 1: Força de Trabalho Distribuída"
				+ "\nSA-CS2 - Estudo de Caso 2: Entregável Urgente"
				+ "\nSA-CS3 - Estudo de Caso 3: Novas Habilidades Necessárias"
				+ "\nSA-CS4 - Estudo de Caso 4: Aprender e Compartilhar"
				+ "\nSSM-TM - Gestão do Tempo"
				+ "\nSSM-IV - Introdução à VIA e a Descoberta das Forças de Caráter VIA"
				+ "\nSSM-RLW - Maximizar a Aprendizagem Online e o Trabalho Remoto";
	}
	@GetMapping("/objetivos")
	public String objetivo() {
		return "		!LISTA DE OBJETIVOS DE APRENDIZAGEM!\n"
				+ "\n- Aprender e aperfeiçoar DER"
				+ "\n- Entender melhor Banco de dados"
				+ "\n- Aprender Spring e me aperfeiçoar";
	}
}
