package exercicioMatriz;
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		int n = tc.nextInt();
		
		int triangulo [][] = new int [n+1][n+1];
		
		for(int i = 0; i<=n; i++) {
			for(int j = 0; j<=i; j++) {
				if(j == 0 || i == j)
					triangulo[i][j] = 1;
				else
					triangulo[i][j] = triangulo[i-1][j-1] + triangulo[i-1][j];
			}
		}
		
		for(int i = 0; i<=n; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print(triangulo[i][j] + " " );
			}
			System.out.println();
		}
		
		tc.close();
	}

}
