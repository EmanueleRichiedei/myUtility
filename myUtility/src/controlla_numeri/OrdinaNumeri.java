package controlla_numeri;

import java.util.ArrayList;

public class OrdinaNumeri {
	/***
	 * classe che ha lo scopo di ordinare vettori di numeri
	 */
	/**
	 * costruttore privato, rende la classe non istanziabile
	 */
	private OrdinaNumeri() {
	}

	/***
	 * Datoun ArrayList in ingresso restituisce lo stesso ArrayList ordinato
	 * @param vettore--> ArrayList
	 * @return ArrayList ordinato
	 */
	public static ArrayList<Double> ordinaNumeri(ArrayList<Double> vettore) {
		ArrayList<Double> ordinato = new ArrayList<>();
		Double max;

		int n = vettore.size();
		while (n > 0) {

			max = getMax(vettore);

			ordinato.add(max);

			vettore.remove(max);
			max = null;
			n--;
		}
        
		return ordinato;

	}

	/**
	 * Trova il maggiore degli elementi presenti in un array
	 * 
	 * @param vettore
	 * @return Double--> elemento massimo
	 */
	public static Double getMax(ArrayList<Double> vettore) {
		Double max = vettore.get(0);
		for (int i = 0; i < vettore.size(); i++) {
			if (vettore.get(i) > max) {
				max = vettore.get(i);
			}
		}

		return max;
	}

	
	/***
	 * Trova l'elemento minimo di un vettore
	 * @param vettore
	 * @return Double--> elemento minimo 
	 */
	public static Double getMin(ArrayList<Double> vettore) {
		Double min;
		min = vettore.get(0);
		for (int i = 0; i < vettore.size(); i++) {
			if (vettore.get(i) < min) {
				min = vettore.get(i);
			}
		}
		return min;
	}

	//TODO controllare i seguenti metodi e testarli.
	
	/***
	 * ordina in ordine decrescente un vettore generico
	 * @param vettore
	 * @return
	 */
	public static <E extends Comparable > ArrayList<E> ordinaNumeriGenericoDecrescente (ArrayList<E> vettore) {
		
		ArrayList<E> ordinato = new ArrayList<>();
		E max;

		int n = vettore.size();
		while (n > 0) {

			max =  getMaxGenerico(vettore);

			ordinato.add(max);

			vettore.remove(max);
			max = null;
			n--;
		}
        
		return ordinato;

	}
	/***
	 * ordina in ordine crescente un vettore generico
	 * @param vettore
	 * @return
	 */
	public static <E extends Comparable> ArrayList<E> ordinaNumeriGenericoCrescente(ArrayList<E> vettore){
		ArrayList<E> ordinato = new ArrayList<>();
		ArrayList<E> temp= new ArrayList<>();
		
		temp= ordinaNumeriGenericoDecrescente(vettore);
		
		for(int i=temp.size()-1;i>=0;i--){
			ordinato.add(temp.get(i));
		}
		
		return ordinato;
	}

	/**
	 * trova il massimo elemento di un vettore generico
	 * @param vettore
	 * @return
	 */
	public static <E extends Comparable> E getMaxGenerico(ArrayList<E> vettore) {
		
		E max = vettore.get(0);
		for (int i = 0; i < vettore.size(); i++) {
			if ((vettore.get(i).compareTo(max)>0)) {
				max = vettore.get(i);
			}
		}

		return  max;
	}
	
	/**
	 *  trova l elemento minimo di un vettore generico
	 * @param vettore
	 * @return
	 */
   public static<E extends Comparable> E getMinGenerico(ArrayList<E> vettore) {
		
		E min = vettore.get(0);
		for (int i = 0; i < vettore.size(); i++) {
			if ((vettore.get(i).compareTo(min)<0)) {
				min = vettore.get(i);
			}
		}

		return  min;
	}
}