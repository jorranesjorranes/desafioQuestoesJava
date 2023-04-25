package desafioQuestoes.respostas;

import java.util.Scanner;

public class RespostaQuestao5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("escreva uma String:");
		String nome = entrada.nextLine();
		
		String inversao = "";
		for(int i = nome.length() - 1; i >= 0; i--) {
			inversao += nome.charAt(i);
		}
		
		System.out.println("A inversão dessa String gera a seguinte String: " + inversao);
		
		entrada.close();
	}
}
