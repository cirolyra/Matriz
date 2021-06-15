package application;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Linhas: ");
		int M = sc.nextInt();
		System.out.print("Colunas: ");
		sc.nextLine();
		int N = sc.nextInt();

		int[][] mat = new int[M][N];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Digite: ");
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Digite um múmero da matriz: ");
		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (x == mat[i][j]) {
					System.out.print("A posição do número digitado é " + i + ", " + j);
					System.out.println();
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("UP: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}

		sc.close();

	}

}
