import java.util.ArrayList;

public class Vlasnik extends Osoba{
    ArrayList<KucniLjubimac> listaLjubimaca = new ArrayList<>();

    @Override
    public void predstaviSe() {

    }
    public Vlasnik(String ime, String prezime) {
        super(ime, prezime);
    }

    public static void udomi(KucniLjubimac kucniLjubimac){
        kucniLjubimac.idemDoma(kucniLjubimac.getVlasnik());
    }

    @Override
    public String getIme() {
        return super.getIme();
    }

    @Override
    public String getPrezime() {
        return super.getPrezime();
    }
}
