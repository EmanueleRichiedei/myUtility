package file;



import leggi_valori.LeggiStringhe;

public class ControlloFile {

	final static String INSERISCI_NOME_FILE="Inserisci nome file ->";
	final static char PUNTO='.';
	/**
	 * costruttore privato, rende la classe non istanziabile
	 */
	private ControlloFile() {
	}

	

	/***
	 * metodo dice se il nome del file in ingresso ha estensione, controllado se
	 * la parte dopo il punto e'tra le estenzìsioni piu usate
	 * 
	 * @param fileName -> String 
	 */
	public static boolean hasEstensione(String fileName) {

		String estensioni[] = { "xml", "txt", "doc", "dat" };
		
		boolean haEstensione = false;
		String estensione;
		int indice;
		indice = fileName.indexOf(PUNTO);
        if (indice == -1) {
			haEstensione = false;
		} else {
		
			estensione = fileName.substring(indice+1, (fileName.length()));
			for (int i = 0; i < estensioni.length; i++) {
				if (estensione.equals(estensioni[i])) {
					haEstensione = true;
			
				}
			}

		}
		return haEstensione;
	}
	
	/****
	 * aggiunge estensione al nome del file nel caso in cui non sia stata inserita
	 * 
	 * @param estensione -> String , inserita da esterno.
	 * @return String -> file completo di estensione es: pippo.txt
	 */

	public static  String inputFileName( String estensione) {
		String fileName=LeggiStringhe.leggiStringa(INSERISCI_NOME_FILE);
		if (!hasEstensione(fileName)) { // if 1
			if (estensione.charAt(0) !=PUNTO) { //if 2
                estensione=PUNTO+estensione; 
			}// if2
			fileName=fileName+estensione;
		}// if2
		
		return fileName;
	}
}
