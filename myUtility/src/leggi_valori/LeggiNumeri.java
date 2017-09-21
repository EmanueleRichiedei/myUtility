package leggi_valori;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeggiNumeri {
	final static String ERRORE_FORMATO = "Errore acquisizione";
	final static Scanner sc = new Scanner(System.in);

	/**
	 * permette l'inserimento di un numero intero andando a capo dopo la stringa
	 * 
	 * @param st
	 *            stringa che indica di inserire un dato
	 * @return int
	 */
	public static int leggiIntero(String str) {
		int n = 0;
		String dabuttare;
		boolean finito = false;
		do {
			System.out.println(str);
			try {
				n = sc.nextInt();
				finito = true;
			} catch (InputMismatchException e) {

				System.out.println(ERRORE_FORMATO);
				String daButtare = sc.next();
				dabuttare = null;
			}
		} while (!finito);
		return n;

	}

	/**
	 * permette l'inserimento di un numero intero non andando a capo dopo la
	 * stringa
	 * 
	 * @param st
	 *            stringa che indica di inserire un dato
	 * @return int
	 */

	public static int leggiInteroNonACapo(String str) {//
		// valore acquisito
		int n = 0;
		String dabuttare;
		boolean finito = false;
		do {
			System.out.print(str);
			try {
				n = sc.nextInt();
				finito = true;
			} catch (InputMismatchException e) {

				System.out.println(ERRORE_FORMATO);
				String daButtare = sc.next();
				dabuttare = null;
			}
		} while (!finito);
		return n;

	}

	/**
	 * permette l'inserimento di un numero con virgola mobile andando a capo
	 * dopo la stringa
	 * 
	 * @param st
	 *            stringa che indica di inserire un dato
	 * @return double
	 */
	public static double leggiDouble(String str) {
		double n = 0;
		String dabuttare;
		boolean finito = false;
		do {
			System.out.println(str);
			try {
				n = sc.nextDouble();
				finito = true;
			} catch (InputMismatchException e) {
				System.out.println(ERRORE_FORMATO);
				String daButtare = sc.next();
				dabuttare = null;
			}
		} while (!finito);
		return n;

	}

	/**
	 * permette l'inserimento di un numero con virgola mobile andando a capo
	 * dopo la stringa
	 * 
	 * @param st
	 *            stringa che indica di inserire un dato
	 * @return float
	 */
	public static float leggiFloat(String str) { 
		float n = 0;
		String dabuttare;
		boolean finito = false;
		do {
			System.out.println(str);
			try {
				n = sc.nextFloat();
				finito = true;
			} catch (InputMismatchException e) {

				System.out.println(ERRORE_FORMATO);
				String daButtare = sc.next();
				dabuttare = null;
			}
		} while (!finito);
		return n;

	}

	/**
	 * permette l'inserimento di un numero intero andando a capo dopo la stringa
	 * 
	 * @param st
	 *            stringa che indica di inserire un dato
	 * @return long
	 */
	public static long leggiLong(String str) {
		long n = 0;
		String dabuttare;
		boolean finito = false;
		do {
			System.out.println(str);
			try {
				n = sc.nextLong();
				finito = true;
			} catch (InputMismatchException e) {

				System.out.println(ERRORE_FORMATO);
				String daButtare = sc.next();
				dabuttare = null;
			}
		} while (!finito);
		return n;

	}

}
