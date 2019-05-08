package exercicioMatriz;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		int m = tc.nextInt();
		int n = m;
		int cont = 0;
		int zeros = 0;
		int contUm = 0;
		
		int [][] matriz = new int [m][n];
		
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz.length; j++) {
				matriz[i][j] = tc.nextInt();
			}
		}
		
		for(int i = 0; i<matriz.length; i++) {
			cont = 0;
			for(int j = 0; j<matriz.length; j++) {
				if(matriz[i][j] == 0) 
					cont++;
			}
			if(cont == m-1)
				zeros++;
		}
		
		for(int i = 0; i<matriz.length; i++) {
			cont = 0;
			for(int j = 0; j<matriz.length; j++) {
				if(matriz[i][j] == 1)
					cont++;
			}
			if(cont == 1)
				contUm++;
		}
		
		System.out.printf("%d %d \n", zeros, contUm);
		if(zeros == m && contUm == m) 
			System.out.println("A matriz é de permutação.");
		else 
			System.out.println("A matriz não é de permutação.");
		
		tc.close();
	}

}
