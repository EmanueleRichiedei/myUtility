package controlla_numeri;

import java.util.Scanner;
import leggi_valori.LeggiNumeri;

public class CotrollaInteri {
	final static Scanner sc = new Scanner(System.in);

	private CotrollaInteri(){}
	
	/**
	 * controlla se un numero e' maggiore di uno prestabilito
	 * 
	 * @param num
	 *            numero inserito da utente
	 * @param soglia
	 *            numero sotto il quale non si puo insewrire
	 * @param str
	 *            stringa che indica l'iserimento del numero
	 * @return
	 */
	static public int controlloInteri(int num, int soglia, String str) {
		
		boolean fine = false;
		do {
			
			if (num > soglia) {
				fine = true;
			} else {
				num = LeggiNumeri.leggiIntero(str);
			}

		} while (!fine);
		return num;
	}

	/**
	 * se un numero e'sopra una soglia il valore è portato al valore della
	 * soglia
	 * 
	 * @param num
	 *            numero da controllare
	 * @param sogliaMax
	 *            valore da non superare
	 * @return int
	 */

	public static int nonPiuGrandeDi(int num, int sogliaMax) {
		int differenza = 0;
		if (num > sogliaMax) {
			differenza = num - sogliaMax;
			num -= differenza;
		}
		return num;
	}

	/**
	 * se un numero e'sotto una soglia il valore e' portato al valore della
	 * soglia
	 * 
	 * @param num
	 *            numero da controllare
	 * @param sogliaMin
	 *            numero minimo da non superare
	 * @return int
	 */
	public static int nonPiuPiccoloDi(int num, int sogliaMin) {
		int differenza = 0;
		if (num < sogliaMin) {
			differenza = sogliaMin - num;
			num += differenza;
		}
		return num;
	}

	/**
	 * se un numero e' sotto una certa soglia o sopra una soglia porta il valore
	 * alla soglia
	 * 
	 * @param num
	 *            numero da controllare
	 * @param sogliaMin
	 *            soglia oltre cui non andare
	 * @param sogliaMax
	 *            soglia sotto cui non andare
	 * @return int
	 */
	public static int traDueValori(int num, int sogliaMin, int sogliaMax) {
		if (num < sogliaMin) {
			num = nonPiuPiccoloDi(num, sogliaMin);
		}
		if (num > sogliaMax) {
			num = nonPiuGrandeDi(num, sogliaMax);
		}

		return num;
	}

	public static int compreso(int n, int v_MIN, int v_MAX) {
		boolean finito=false;
		
		do {
		if(n<v_MIN || n>v_MAX) {
			n=LeggiNumeri.leggiIntero("Il numero deve essre compreto tra "+v_MIN +" e "+v_MAX);
			finito=true;		
		}else {
			return n;
		}
		}while(!finito);
		
		return n;
	}

}
