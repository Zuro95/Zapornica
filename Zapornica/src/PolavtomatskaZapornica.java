public class PolavtomatskaZapornica extends Zapornica {
    private boolean ročnoOdvzemanje;

    public PolavtomatskaZapornica(int časZapiranja) {
        super(časZapiranja);
        ročnoOdvzemanje = false;
    }

    public void ročnoOdvzemiKartico() {
        ročnoOdvzemanje = true;
    }

    @Override
    public void tik() {
        super.tik();
        if (ročnoOdvzemanje) {
            ročnoOdvzemanje = false;
            odpre();
        }
    }
}
