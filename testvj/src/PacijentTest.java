import java.util.ArrayList;
import java.util.Scanner;

public class PacijentTest {

    public static void main(String[] args) {

        Pacijent pacijent = new Pacijent("Florijan", 15000);

        pacijent.addBolest(new Virus("Sven"));
        pacijent.addBolest(new Virus("Kalamarko"));

        pacijent.addBolest(new Bakterija("Miljenko"));
        pacijent.addBolest(new Bakterija("Patrik"));

        pacijent.ispisiBolesti();

        System.out.println("puna placa: " + pacijent.placa);
        System.out.println("Smanjena: " + pacijent.izracunajPlacu());

        System.out.println("Želiš li zamjeniti jedan dan bolovanja radom od doma ");
        Scanner s = new Scanner(System.in);
        String odg = s.nextLine();

        while(odg.equalsIgnoreCase("da")){

            for (Bolest b: pacijent.listaBolesti) {
                b.setBrojDanaBolovanja(b.getBrojDanaBolovanja()-1);

                if(b.getBrojDanaBolovanja()<0){
                    b.setBrojDanaBolovanja(0);
                }
            }


            System.out.println(pacijent.placa);
            System.out.println(pacijent.izracunajPlacu());

            System.out.println("Želiš li zamjeniti još jedan dan bolovanja radom od doma ");
            odg = s.nextLine();

        }

        System.out.println("doiti ceš: " + pacijent.izracunajPlacu());

    }

}
