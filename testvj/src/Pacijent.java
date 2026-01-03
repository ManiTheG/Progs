import java.util.ArrayList;

public class Pacijent {
    String ime;
    int placa;
    ArrayList<Bolest> listaBolesti;

    public Pacijent (String ime, int placa){
        this.ime=ime;
        this.placa=placa;

        listaBolesti = new ArrayList<Bolest>();


    }

    public void ispisiBolesti(){
        System.out.println(ime + " " + placa);
        for (Bolest bolest:
             listaBolesti) {
            System.out.println(bolest.getNaziv() + " " + bolest.getBrojDanaBolovanja());
        }
    }

    public int izracunajPlacu(){
        int novaPlaca = placa;
        for (Bolest bolest:
             listaBolesti) {
            novaPlaca -= 50*bolest.getBrojDanaBolovanja();
        }

        if(novaPlaca<2900) {
            novaPlaca=2900;
        }

        return novaPlaca;
    }

    public void addBolest(Bolest bolest) {
        listaBolesti.add(bolest);
    }
}
