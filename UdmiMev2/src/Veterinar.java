public class Veterinar extends Osoba{

    @Override
    public void predstaviSe() {

    }
    public Veterinar(String ime, String prezime) {
        super(ime, prezime);
    }

    public void cijepi(KucniLjubimac kucniLjubimac) {
        kucniLjubimac.setCijepljen(true);
        kucniLjubimac.glasaSe();
    }


}
