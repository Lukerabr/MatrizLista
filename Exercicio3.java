package exercicioMatriz;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner tc = new Scanner (System.in);
		
		int m = tc.nextInt();
		int n = m;
		int soma = 0;
		int soma2 = 0;
		boolean quadrado = true;
		int matriz [][] = new int [m][n];
		
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz.length; j++) {
				matriz [i][j] = tc.nextInt();
			}
		}
		
		for (int i = 0; i<matriz.length; i++) {
			soma += matriz[i][0];
		}
		
		for(int i = 0; i<matriz.length & quadrado; i++) {
			soma2 = 0;
			for(int j = 0; j<matriz.length; j++) {
				soma2 += matriz[j][i];
			}
			if(soma2 == soma)
				quadrado = true;
			else
				quadrado = false;
		}
		
		soma2 = 0;
		for(int i = 0; i<matriz.length && quadrado; i++) {
			for(int j = 0; j<matriz.length; j++) {
				if(j == i)
					soma2 += matriz[i][j];
			}
			if(soma2 == soma)
				quadrado = true;
			else
				quadrado = false;
		}
		
		soma2 = 0;
		/*for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz.length; j++) {
				soma2 += matriz[i][j];
			}
			if(soma2 == soma)
				quadrado = true;
			else
				quadrado = false;
		}*/
		
		for(int i = 0; i<matriz.length && quadrado; i++) {
			int j = matriz.length;
			soma2 += matriz[i][j-1];			
		}
		
		if(quadrado)
			System.out.println("A matriz é um quadado mágico.");
		else
			System.out.println("A matriz não é um quadrado mágico.");
		
		tc.close();
	}

}
