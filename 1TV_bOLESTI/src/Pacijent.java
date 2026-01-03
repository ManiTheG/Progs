import java.util.ArrayList;

public class Pacijent {
    String ime;
    int placa;
    ArrayList<Bolest> listaBolesti = new ArrayList<>();

    public Pacijent(String ime, int placa){
        this.ime=ime;
        this.placa=placa;
    }

    public void ispisiBolesti(){
        System.out.println("ime: " + ime + "placa: " + placa);
        System.out.println("bolesti:");
        for (Bolest bolest:
             listaBolesti) {
            System.out.println(bolest + " " + bolest.getBrojDana());
        }
    }

    public int izracunajPlacu(){
        int pom = placa;
        for (Bolest bolest:
             listaBolesti) {
            pom = placa - bolest.getBrojDana()*50;
        }
        if(pom<2900){
            pom=2900;
        }
        return pom;
    }

    public void setListaBolesti(ArrayList<Bolest> listaBolesti) {
        this.listaBolesti = listaBolesti;
    }
}
