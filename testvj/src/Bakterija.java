public class Bakterija extends Bolest{

    public Bakterija(String naziv) {
        super(naziv);
    }

    @Override
    public void ispisiMetoduLijecenja() {
        System.out.println("antibiotik");
    }

}
