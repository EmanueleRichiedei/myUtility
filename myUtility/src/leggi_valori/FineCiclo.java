package leggi_valori;
 import stampa_valori.StampaValori;
 import leggi_valori.LeggiStringhe;
public class FineCiclo {
	
	
	private FineCiclo(){}
	/***
	 *  verifica la condizione di fine ciclo, chiede all'utente se vuole ancora inserire elementi
	 * @param str --> domanda di inserimento altri elementi
	 * @return boolean 
	 * 
	 */
	public static boolean fineCiclo(String str){
		StampaValori.stampaStringACapo(str);
		String scelta=LeggiStringhe.leggiStringa();
		
		return scelta.equalsIgnoreCase("si");
	}

}
