package aula04;

import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.println("Quantos fatoriais você deseja calcular?");
		int numbers = sc.nextInt();
		for (int k = 1; k <= numbers; k++){
		int fatorial = inputNumber();
		System.out.printf("Resultado do fatorial de "+fatorial+" ("+fatorial+"!): = "+resultFatorial(fatorial)+"\n");
		}
	}

	private static boolean checkLog() {
		System.out.println("Deseja acompanhar a log dos resultados? (true/false)");
		sc.nextLine();
		boolean check = sc.nextBoolean();
		if (check == true) {
			return true;
		}
		return false;
		
	}

	private static int inputNumber() {		
		System.out.println("Qual número você quer calcular o fatorial?");
		int number = sc.nextInt();
		return number;
	}

	public static long resultFatorial(int Fatorial) {
		long result = 1;
		if(checkLog() == true) {			
			for(int i = 1; i<= Fatorial; i++) {
				long previousResult = result;
				result = result * i;
				System.out.printf(previousResult+" * "+ i +" = "+result+"\n");
				previousResult = result;
				
			}
		}
		else {
			for(int j = 1; j<= Fatorial; j++) {
			result = result * j;
		}
		}
		return result;
}
}