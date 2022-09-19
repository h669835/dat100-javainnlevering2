package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		// Går gjennom tabell og skiver ut hvert tall.
		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		// Formaterer tabell til streng.
		String outstr = "[";
		for (int i = 0; i < tabell.length; i++) {
			if (i < tabell.length - 1) {
				outstr += tabell[i] + ",";
			} else {
				outstr += tabell[i];
			}
		}
		outstr += "]";
		return outstr;

	}

	// c)
	public static int summer(int[] tabell) {
		// Summerer tabell på forskjellige måter.
		int sum = 0;
		// FOR:
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}

		// WHILE:
		/*
		 * int j = 0; while (j < tabell.length) { sum += tabell[j]; j++; }
		 */

		// UTVIDET FOR:
		// TODO Utvidet for

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		// Går gjennom tabell og skjekker om tall finnes.
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return true;
			}
		}
		return false;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		// Går gjennom tabell, skjekker om tall finnes, og returnerer index.
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		// Lager ny tabell, like lang som orginalen.
		int[] revers = new int[tabell.length];
		// Går gjennom tabell og reverserer.
		for (int i = 0; i < tabell.length; i++) {
			revers[tabell.length - 1 - i] = tabell[i];
		}
		return revers;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		// Går gjennom tabell og skjekker om tall som kommer etterhverandre er sortert.
		for (int i = 1; i < tabell.length - 1; i++) {
			if (tabell[i - 1] > tabell[i]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		// Lager ny tabell som er like lang som tabell1 og tabell2 til sammen.
		int[] sammensatt = new int[tabell1.length + tabell2.length];
		// Går gjennom tabell1 og legger til den tomme tabellen.
		for (int i = 0; i < tabell1.length; i++) {
			sammensatt[i] = tabell1[i];
		}
		// Går gjennom tabell2 og legger til den tomme tabellen.
		for (int i = 0; i < tabell2.length; i++) {
			sammensatt[tabell1.length + i] = tabell2[i];
		}
		return sammensatt;
	}
}
