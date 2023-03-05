/*
			Ime dototeke:    Zapornica.java
			Avtor:           Žiga Zurc			
*/


public class Zapornica {
	
	// Definicija atributov
    private boolean zaprta;
    private int preostaliCas;
    private int casZapiranja;
// Konstruktor razreda
    public Zapornica(int casZapiranja) {
		// Inicializacija atributov
        this.zaprta = false;				
        this.preostaliCas = 0;
        this.casZapiranja = casZapiranja;
    }

// Get metoda za preverjanje stanja zapornice
    public boolean isZaprta() {
        return this.zaprta;
    }
// Get metoda za preverjanje preostalega časa do zapiranja
    public int getPreostaliCas() {
        return this.preostaliCas;
    }
// Get metoda za preverjanje časa zapiranja
    public int getCasZapiranja() {
        return this.casZapiranja;
    }
// Metoda za odpiranje zapornice
   public void odpre() throws GateStateException {
        if (this.zaprta == false) {
            throw new IllegalStateException("Zapornice so že dvignjene.");
        }
        this.zaprta = false;
        this.preostaliCas = 0;
    }
	
// Metoda za zapiranje zapornice
    public void zapri() throws GateStateException {
        if (this.zaprta == true) {
            throw new IllegalStateException("Zapornice so že zaprte.");
        }
        this.zaprta = true;
        this.preostaliCas = this.casZapiranja;
    }
// Metoda za prekinitev zapiranja zapornice
      public void prekini() throws GateStateException {
        if (this.zaprta == false || this.preostaliCas == 0) {
            throw new IllegalStateException("Zapornica se ne zapira");
        }
        this.zaprta = false;
        this.preostaliCas = 0;
    }
// Metoda za zmanjševanje preostalega časa zapiranja (kliče se vsako sekundo)
    public void tik() {
        if (this.zaprta && this.preostaliCas > 0) {   // Če je zapornica zaprta in ni pretekel preostali čas
            this.preostaliCas--;						// Zmanjšaj preostali čas za 1 sekundo
        }
    }
	
	
	class GateStateException extends Exception {
    public GateStateException(String errorMessage) {
        super(errorMessage);
    }
}

class GateTimeoutException extends Exception {
    public GateTimeoutException(String errorMessage) {
        super(errorMessage);
    }
}
}
	
	
	
	
	



    


