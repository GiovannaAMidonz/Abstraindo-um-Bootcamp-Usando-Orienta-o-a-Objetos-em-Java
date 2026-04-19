package org.example;

import model.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Setup inicial do Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer & QA");
        bootcamp.setDescricao("Domine POO e Automação de Testes");

        Curso cursoJava = new Curso("Java POO", "Herança e Polimorfismo", 10);
        Mentoria mentoriaQA = new Mentoria("QA com Selenium", "Testes automatizados", LocalDate.now());

        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(mentoriaQA);

        // 2. Criando o Estudante
        Estudante estudante = new Estudante(1);
        System.out.println("--- 🎓 Sistema de Gestão de Bootcamp ---");
        System.out.print("Digite seu nome para começar: ");
        estudante.setNome(scanner.nextLine());
        estudante.inscreverBootcamp(bootcamp);

        int opcao = -1;

        // 3. Menu Interativo
        while (opcao != 0) {
            System.out.println("\n-------------------------------------------");
            System.out.println("Olá "+estudante.getNome()+" Seu ID: "+estudante.getID() +"\nEscolha uma opção:");
            System.out.println("1 - Exibir conteúdos inscritos");
            System.out.println("2 - Progredir (Concluir próximo conteúdo)");
            System.out.println("3 - Ver conteúdos concluídos");
            System.out.println("4 - Consultar XP Total");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n📚 Conteúdos Pendentes:");
                    System.out.println(estudante.getConteudosInscrito());
                    break;
                case 2:
                    System.out.println("\n⌛ Progredindo...");
                    estudante.progredir();
                    System.out.println("Sucesso! Você avançou na sua trilha.");
                    break;
                case 3:
                    System.out.println("\n🏆 Conteúdos Concluídos:");
                    System.out.println(estudante.getConteudosConcluidos());
                    break;
                case 4:
                    System.out.println("\n🔥 Seu XP atual é: " + estudante.calcularTotalXP());
                    break;
                case 0:
                    System.out.println("Encerrando sistema... Bons estudos!");
                    break;
                default:
                    System.out.println("⚠️ Opção inválida!");
            }
        }
        scanner.close();
    }
}