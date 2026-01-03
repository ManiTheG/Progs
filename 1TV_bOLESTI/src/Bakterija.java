public class Bakterija extends Bolest{
    @Override
    public void ispisiMetoduLijecenja() {
        System.out.println("antibiotik");
    }

    public Bakterija(String imeBolesti, int brojDana) {
        super(imeBolesti, brojDana);
    }
}
