import java.util.Random;

public abstract class Bolest {

    Random rand = new Random();

    private String naziv;

    private int brojDanaBolovanja;


    public Bolest(String naziv){
        this.naziv=naziv;
        brojDanaBolovanja = rand.nextInt(7)+1;

    }

    public abstract void ispisiMetoduLijecenja();

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojDanaBolovanja() {
        return brojDanaBolovanja;
    }

    public void setBrojDanaBolovanja(int brojDanaBolovanja) {
        this.brojDanaBolovanja = brojDanaBolovanja;
    }


}
