package math;

public class Numero {

	 private int base;
	 private int esponente;
	 
	 public Numero(int _base, int _esponente){
		 base=_base;
		 esponente=_esponente;
	 }

	 
	public int getBase() {
		return base;
	}

	public int getEsponente() {
		return esponente;
		
	}
	
	@Override
	public String toString() {
		
		return base+"^"+esponente;
	}
}
