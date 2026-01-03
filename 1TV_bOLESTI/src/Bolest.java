public abstract class Bolest {

    private String imeBolesti;
    private int brojDana;

    public abstract void ispisiMetoduLijecenja();

    public Bolest(String imeBolesti, int brojDana){
        this.imeBolesti=imeBolesti;
        this.brojDana=brojDana;


    }

    public int getBrojDana() {
        return brojDana;
    }

    public String getImeBolesti() {
        return imeBolesti;
    }

    public void setBrojDana(int brojDana) {
        this.brojDana = brojDana;
    }
}
