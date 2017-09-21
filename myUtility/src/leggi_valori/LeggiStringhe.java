package leggi_valori;
import java.util.Scanner;

public class LeggiStringhe {
	
	final static Scanner sc= new Scanner (System.in);
	
	/**
	 *  permette l'inserimento di una String andando a capo dopo la stringa
	 * @param st stringa che indica di inserire un dato
	 * @return String
	 */
	public static String  leggiStringa(String st){
		String str=null;
		System.out.println(st);
		str=sc.nextLine();
		return str;
	}
	
	/**
	 *  permette l'inserimento di una String senza stringa di introduzione
	 * @return String
	 */
	public static String leggiStringa(){
		String str=null;
		str=sc.nextLine();
		return str;
	}
	
	/**
	 *  permette l'inserimento di una String non andando a capo dopo la stringa
	 * @param st stringa che indica di inserire un dato
	 * @return String
	 */
	public static String  leggiStringaNonACapo(String st){
		String str=null;
		System.out.print(st);
		str=sc.nextLine();
		return str;
	}
	
	
}
