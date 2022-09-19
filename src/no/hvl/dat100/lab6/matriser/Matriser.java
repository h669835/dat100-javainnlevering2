package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[0].length; j++) {
				System.out.println(matrise[i][j]);
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String outstr = "";
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[0].length; j++) {
				outstr += matrise[i][j] + " ";
			}
			outstr += "\n";
		}
		return outstr;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] skalertMatrise = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[0].length; j++) {
				skalertMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return skalertMatrise;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a.length != b.length || a[0].length != b[0].length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}

		return true;

	}

	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] speiletmatrise = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[0].length; j++) {
				speiletmatrise[i][j] = matrise[j][i];
			}
		}
		return speiletmatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		// Skjekk om antall kolonner i a er lik antall rekker i b;
		if (a[0].length == b.length) {
			int[][] product = new int[a.length][b[0].length];
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b[0].length; j++) {
					for (int k = 0; k < a[0].length; k++) {
						product[i][j] += a[i][k] * b[k][j];
					}
				}
			}
			return product;
		}
		throw new IllegalArgumentException("Matriser kan ikke multipliseres");

	}
}
