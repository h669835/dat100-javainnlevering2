package no.hvl.dat100.lab6.matriser;

import org.omg.CORBA.BAD_POLICY;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int i = 0; i<matrise.length; i++){
			for (int j = 0; j<matrise[0].length; j++){
				System.out.println(matrise[i][j]);
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String outstr = "";
		for (int i = 0; i<matrise.length; i++){
			for (int j = 0; j<matrise[0].length; j++){
				outstr += matrise[i][j] + ", ";
			}
			outstr += "/n";
		}
		return outstr;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] skalertMatrise = new int[matrise.length][matrise[0].length];

		for (int i = 0; i<matrise.length; i++){
			for (int j = 0; j<matrise[0].length; j++){
				skalertMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return skalertMatrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a.length != b.length || a[0].length != b[0].length){
			return false;
		}

		for (int i = 0; i<a.length; i++){
			for (int j = 0; j<a[0].length; j++){
				if (a[i][j] != b[i][j]){
					return false;
				}
			}
		}

		return true;
		
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] speiletmatrise = new int[matrise.length][matrise[0].length];

		for (int i = 0; i<matrise.length; i++){
			for (int j = 0; j<matrise[0].length; j++){
				// revers[tabell.length-i]=tabell[i];
				speiletmatrise[i][matrise[0].length-j] = matrise[i][j];
			}
		}

		return speiletmatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int r1 = a.length, c1 = a[0].length;
		int r2 = b.length, c2 = a[0].length;
		//Skjekk om antall kolonner i a er lik antall rekker i b;
		if (a[0].length == b.length){
			int[][] product = new int[r1][c2];
			for(int i = 0; i < r1; i++) {
				for (int j = 0; j < c2; j++) {
					for (int k = 0; k < c1; k++) {
						product[i][j] += a[i][k] * b[k][j];
					}
				}
			}
			return product;
		}
		throw new IllegalArgumentException("Matriser kan ikke multipliseres");
	
	}
}
