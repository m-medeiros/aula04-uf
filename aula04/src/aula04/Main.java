package aula04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fatorial = inputNumber(sc);
		System.out.printf("Resultado do fatorial de "+fatorial+" ("+fatorial+"!): = "+resultFatorial(fatorial, sc));
	}

	private static boolean checkLog(Scanner sc) {
		System.out.println("Deseja acompanhar a log dos resultados? (true/false)");
		sc.nextLine();
		boolean check = sc.nextBoolean();
		if (check == true) {
			return true;
		}
		return false;
		
	}

	private static int inputNumber(Scanner sc) {		
		System.out.println("Qual número você quer calcular o fatorial?");
		int number = sc.nextInt();
		return number;
	}

	public static long resultFatorial(int Fatorial, Scanner sc) {
		long result = 1;
		if(checkLog(sc) == true) {			
			for(int i = 1; i<= Fatorial; i++) {
				result = result * i;
				System.out.printf(Fatorial+" * "+ i +" = "+result+"\n");
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