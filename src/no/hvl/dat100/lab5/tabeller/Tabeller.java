package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i=0; i<tabell.length; i++){
			System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String outstr ="[";
		for (int i=0; i<tabell.length; i++){
			outstr += tabell[i] + ", ";
		}
		outstr += "]";
		return outstr;

		
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		// for 
		for (int i=0; i<tabell.length; i++){
			sum += tabell.length;
		}

		// while
		/*
		int j = 0;
		while (j<tabell.length){
			sum+=tabell[j];
			j++;
		}
		*/
		// utvidet for
		//TODO Utvidet for

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i=0; i<tabell.length; i++){
			if (tabell[i] == tall){
				return true;
			}
		}
		return false;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i=0; i<tabell.length; i++){
			if (tabell[i] == tall){
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] revers = new int[tabell.length];
		for (int i=0; i<tabell.length; i++){
			revers[tabell.length-i]=tabell[i];
		}
		return revers;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i=1; i<tabell.length-1; i++){
			if (tabell[i-1] > tabell[i]){
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] sammensatt = new int[tabell1.length+tabell2.length];
		for (int i=0; i<tabell1.length; i++){
			sammensatt[i] = tabell1[i];
		}
		for (int i=0; i<tabell2.length; i++){
			sammensatt[tabell1.length+i] = tabell2[i];
		}
		return sammensatt;
	}
}
