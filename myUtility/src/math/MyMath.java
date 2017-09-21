package math;

import java.util.ArrayList;

public class MyMath {
	private static final String ERROREMEDIANA = "INSIEME NUMERI VUOTO";
	public final String ERRORE_RADICE = "Inserire numero >=0";

	/**
	 * costruttore privato, rende NON istanziabile la classe.
	 */
	private void myMath() {
	}

	/***
	 * calcolo della serie di Fibonacci di un numero RICORSIVO
	 * 
	 * @param long
	 *            i , numero di cui calcolare il numero di Fibonacci
	 * 
	 */

	public static long fibonacciRicorsivo(long i) {

		if (i <= i) {
			return i;
		} else {
			return fibonacciRicorsivo(i - 1) + fibonacciRicorsivo(i - 2);
		}
	}

	/**
	 * calcolo della serie di fibonacci non ricorsivo
	 * 
	 * @return numero della serie di fibonacci
	 */
	public static long fibonacci(long n) {
		
		if (n <= 1)
			return n;
		else {
			long fib = 1;
			long fibmeno1 = 0;
			long temp;
			for (int i = 1; i <= n - 1; i++) {
				temp = fib;
				fib = fib + fibmeno1;
				fibmeno1 = temp;
			}
			return fib;
		}

	}

	/***
	 * calcolo del fattoriale de numero in ingresso, RICORSIVO
	 * 
	 * @param long
	 *            i numeroda inserire di cui calcolare il fattoriale
	 * @return
	 */
	public static long fattorialeRicorsivo(long n) {

		if (n == 0)
			return 1;
		else {
			long result = n * fattorialeRicorsivo(n - 1);
			return result;
		}
	}

	/***
	 * calcola il fattoriale del numero in ingresso, NON ricorsivo
	 * 
	 * @param i
	 * @return long--> numero fattoriale
	 */
	public static long fattoriale(long n) {

		long result;
		if (n == 0)
			return 1;
		else {
			result = 1;
			for (int i = 2; i <= n; i++) {
				result = result * i;

			}
		}

		return result;
	}

	/**
	 * calcolo del logartirmo in base generica
	 * 
	 * @param base
	 *            base del logaritmo da calcolare
	 * @param numero
	 *            numero di cui calcolare il log
	 * @return il logaritmo de numero in mase generica
	 */
	public static double logaritoBaseGenerica(int base, int argomento) throws IllegalArgumentException {
		if (argomento == 1) {
			throw new IllegalArgumentException("Argomento non valido, deve essere diverso da 1");
		} else {
			if (base <= 0) {
				throw new IllegalArgumentException("base deve essere > 0");
			}
		}
		return Math.log(argomento) / Math.log(base);
	}

	/***
	 * Calcola la radice quadrata del numero in ingresso
	 * 
	 * @param double
	 *            n--> numero in ingresso
	 * @return double
	 * @throws IllegalArgumentException
	 */
	public double radiceQuadrata(double n) throws IllegalArgumentException {
		if (n < 0)
			throw new IllegalArgumentException(ERRORE_RADICE);
		else
			return Math.sqrt(n);
	}

	/***
	 * Trova la Mediana in una Collection di numeri
	 * 
	 * @param vettore
	 *            , insime dei numeri
	 * @return l'elemento del vettore che è la mediana
	 */

	public static Double mediana(ArrayList<Double> vettore) {

		int indice = -1;

		int n = vettore.size();
		if (n == 0) {
			stampa_valori.StampaValori.stampaStringACapo(ERROREMEDIANA);
		}
		if (n % 2 == 0) {
			indice = ((n / 2) - 1);
		} else {
			indice = ((n / 2));
		}

		return vettore.get(indice);
	}

	public static <E> E medianaGenerico(ArrayList<E> vettore) {

		int indice = -1;

		int n = vettore.size();
		if (n == 0) {
			stampa_valori.StampaValori.stampaStringACapo(ERROREMEDIANA);
		}
		if (n % 2 == 0) {
			indice = ((n / 2) - 1);
		} else {
			indice = ((n / 2));
		}

		return vettore.get(indice);
	}

}
