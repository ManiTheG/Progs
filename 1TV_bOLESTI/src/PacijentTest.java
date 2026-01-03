import java.util.ArrayList;

public class PacijentTest {

    public static void main(String[] args) {

        ArrayList<Bolest>lista= new ArrayList<>();

        Virus virus1 = new Virus("lol", 5);
        Virus virus2 = new Virus("lil", 3);

        Bakterija bakterija1 = new Bakterija("kak", 8);
        Bakterija bakterija2 = new Bakterija("klok", 101);

        Pacijent pacijent = new Pacijent("Flkiraj", 5600);

        lista.add(virus1);
        lista.add(virus2);
        lista.add(bakterija1);
        lista.add(bakterija2);

        pacijent.setListaBolesti(lista);

        System.out.println("Smanjena placa: " + pacijent.izracunajPlacu());
        System.out.println("Puna placa: " + pacijent.placa);
        pacijent.ispisiBolesti();

    }
}
