public interface Device {
    void turnOn();
    void turnOff();
}

public class Zapornica implements Device {
    private boolean zaprta;
    private int preostaliCas;
    private int casZapiranja;

    public Zapornica(int casZapiranja) {
        this.zaprta = false;
        this.preostaliCas = 0;
        this.casZapiranja = casZapiranja;
    }

    public boolean isZaprta() {
        return this.zaprta;
    }

    public int getPreostaliCas() {
        return this.preostaliCas;
    }

    public int getCasZapiranja() {
        return this.casZapiranja;
    }

    public void odpre() {
        this.zaprta = false;
        this.preostaliCas = 0;
    }

    public void zapri() {
        this.zaprta = true;
        this.preostaliCas = this.casZapiranja;
    }

    public void prekini() {
        this.zaprta = false;
        this.preostaliCas = 0;
    }

    public void tik() {
        if (this.zaprta && this.preostaliCas > 0) {
            this.preostaliCas--;
        }
    }

    public void turnOn() {
        this.odpre();
    }

    public void turnOff() {
        this.zapri();
    }
}
