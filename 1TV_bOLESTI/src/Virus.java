public class Virus extends Bolest{
    @Override
    public void ispisiMetoduLijecenja() {
        System.out.println("odmor");
    }

    public Virus(String imeBolesti, int brojDana) {
        super(imeBolesti, brojDana);
    }
}
