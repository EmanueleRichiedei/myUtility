package stampa_valori;

import java.util.ArrayList;

public class StampaValori {
	static final String ACAPO="\n";
	static final String SPAZIO=" ";
	/**
	 * stampa una String andando a capo dopo la stringa
	 * @param str stringa che indica di inserire un dato
	 * @return nulla
	 */
	
	public static void stampaStringACapo(String str){
		System.out.println(str);
	}
	/**
	 *  stampa una String andando non andando la stringa
	 * @param str stringa che indica di inserire un dato
	 * @return nulla
	 */
	
	public static void stampaStringNonACapo(String str){
		System.out.print(str);
	}
	
	/***
	 * stampa a video una intestazione con cornice dato dal carattere in input e il messaggio inserito
	 *    esempio:
	 *    
	 *    
	 *    *****************************
     *    * SPEDALI CIVILI DI PEZZAZE *
     *    *****************************
	 * 
	 * @param messaggio --> String 
	 * @param lungMessaggio--> int 
	 * @param carattereCornice--> char
	 */
	public static void creaIntestazione(String messaggio,char carattereCornice){
	
		StringBuffer intestazione= new StringBuffer();
		StringBuffer cornice= new StringBuffer();
		int lungMessaggio=messaggio.length();
		for(int i=0; i<(lungMessaggio+4);i++){
			cornice.append(carattereCornice);
		}
		
		intestazione.append(cornice+ACAPO+
				carattereCornice+SPAZIO+messaggio+SPAZIO+carattereCornice+ACAPO+
				cornice);
		StampaValori.stampaStringACapo(String.valueOf(intestazione));
		
		
	}
	
	public static  <E> void stampaTabella(ArrayList<E> vettore,int numColonne){
		
		for(int i=0;i<vettore.size();i++){
			if(i%numColonne==0){
				stampaStringNonACapo("\n");
			}
			stampaStringNonACapo((String.valueOf(vettore.get(i)))+"\t");
		}
		
	}
	
}
