package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		// Går gjennom matrise og skriver ut hvert tall.
		System.out.println("{");
		for (int i = 0; i < matrise.length; i++) {
			System.out.print("{");
			for (int j = 0; j < matrise[0].length; j++) {
				if (j < matrise[0].length - 1) {
					System.out.print(matrise[i][j] + ", ");
				} else {
					System.out.print(matrise[i][j]);
				}
			}
			if (i < matrise.length - 1) {
				System.out.print("},");
			} else {
				System.out.print("}");
			}
			System.out.println();
		}
		System.out.println("}");
		System.out.println();

	}

	// b)
	public static String tilStreng(int[][] matrise) {
		// Returnerer matrise formatert som streng.
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
		// Lager ny matrise i samme størrelse som orginalen.
		int[][] skalertMatrise = new int[matrise.length][matrise[0].length];

		// Går gjennom matrise, ganger med tall og legger inn i den tomme matrisen.
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[0].length; j++) {
				skalertMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return skalertMatrise;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		// Skjekker om matrisene er like dimensjoner.
		if (a.length != b.length || a[0].length != b[0].length) {
			return false;
		}

		// Skjekker hvert enkelt tall i matrisene.
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
		// Lager ny matrise i samme størrelse som orginalen.
		int[][] speiletmatrise = new int[matrise.length][matrise[0].length];

		// Går gjennom matrise og gjør radene om til kolonner.
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
			// Lager ny matrise med dimmensjonene fra a og b
			int[][] produkt = new int[a.length][b[0].length];
			// Multipliserer matriser
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b[0].length; j++) {
					for (int k = 0; k < a[0].length; k++) {
						produkt[i][j] += a[i][k] * b[k][j];
					}
				}
			}
			return produkt;
		}
		// Error om matrisene ikke har kompatible dimmensjoner.
		throw new IllegalArgumentException("Matriser kan ikke multipliseres");

	}
}
