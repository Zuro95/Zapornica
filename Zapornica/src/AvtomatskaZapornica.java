public class AvtomatskaZapornica extends Zapornica {
    private int številoKartic;

    public AvtomatskaZapornica(int časZapiranja) {
        super(časZapiranja);
        številoKartic = 0;
    }

    public void dodajKartico() {
        številoKartic++;
    }

    @Override
    public void tik() {
        super.tik();
        if (številoKartic > 0) {
            številoKartic--;
            odpre();
        }
    }
}
