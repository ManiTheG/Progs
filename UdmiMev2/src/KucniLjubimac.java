import java.util.Scanner;

public abstract class KucniLjubimac {
    private String ime;
    private Vlasnik vlasnik = new Vlasnik("Figaro", "Milek");
    private int godRodjenja;
    private boolean cijepljen=false;

    public abstract void glasaSe();

    public KucniLjubimac(int godRodjenja){
        this.godRodjenja=godRodjenja;
    }

    public void idemDoma(Vlasnik vlasnik){
        this.vlasnik=vlasnik;

        Scanner scan = new Scanner(System.in);
        System.out.println("Unesi ime ljubimca:");
        ime = scan.nextLine();

        vlasnik.listaLjubimaca.add(this);


        System.out.println("Ljubimca: " + ime + ", je usvojio: " + vlasnik.getIme() + " " + vlasnik.getPrezime());
    }

    public boolean getCijepljen() {
        return cijepljen;
    }

    public void setCijepljen(Boolean novoCijepljen) {
        cijepljen = novoCijepljen;
    }

    public int getGodRodjenja() {
        return godRodjenja;
    }

    public Vlasnik getVlasnik() {
        return vlasnik;
    }
}


