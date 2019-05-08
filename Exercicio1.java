package exercicioMatriz;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		int contLinha = 0;
		int contColuna = 0;
		int cont = 0;
		int m = tc.nextInt();
		int n = tc.nextInt();
		
		int [] [] matriz = new int [m] [n];
		
		for(int i = 0; i<matriz.length; i++) {
			cont = 0;
			for(int j = 0; j<matriz[i].length; j++) {
				matriz[i][j] = tc.nextInt();
				if(matriz[i][j] == 0) 
					cont++;
			}
			if (cont == n) 
				contLinha++;
		}
		
		for(int i = 0; i<matriz.length; i++) {
			cont = 0;
			for(int j = 0; j<matriz[i].length; j++) {
				if(matriz[j][i] == 0) 
					cont++;
									
			}
			if(cont == m) 
				contColuna++;
		}
		
		System.out.println(contLinha);
		System.out.println(contColuna);
		tc.close();
	}

}