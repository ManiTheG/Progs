import java.util.ArrayList;
import java.util.*;

public class Utocist {

        Random rand = new Random();

        ArrayList<KucniLjubimac> listaKucLjub = new ArrayList<>();
        ArrayList<KucniLjubimac> listaKucLjubNovo = new ArrayList<>();
        Veterinar veterinar = new Veterinar("Pero", "Peric");
        Macka macka1 = new Macka(2024 - rand.nextInt(10));
        Macka macka2 = new Macka(2024 - rand.nextInt(10));

        Pas pas1 = new Pas(2024 - rand.nextInt(10));
        Pas pas2 = new Pas(2024 - rand.nextInt(10));


        public Utocist(){
            listaKucLjub.add(macka1);
            listaKucLjub.add(macka2);
            listaKucLjub.add(pas1);
            listaKucLjub.add(pas2);
        }



    public void udomljavaj(){

            while(!listaKucLjub.isEmpty()){
                String one;
                String two;
                int three;
                Scanner t = new Scanner(System.in);
                Scanner o = new Scanner(System.in);

                System.out.println("Zelite li udomiti psa, macku ii Vam je svejedno? (Molimo odgovorite sa 'pas', " +
                        "'macka' ili 'svejedno')");
                one = o.nextLine();

                System.out.println("Zelite li mladeg(<5g) ii starijeg(5+g) ljubimca? (Molimo odgovorite sa 'madi' ili" +
                        " 'stariji')");
                two = t.nextLine();

                for (int i = 0; i < listaKucLjub.size(); i++) {

                    if(one.equalsIgnoreCase("svejedno") && two.equalsIgnoreCase("mladi") && 2024 - (listaKucLjub.get(i).getGodRodjenja()) < 5) {

                        if (listaKucLjub.get(i) instanceof Pas) {
                            listaKucLjubNovo.add(listaKucLjub.get(i));
                        }

                        else if (listaKucLjub.get(i) instanceof Macka) {
                            listaKucLjubNovo.add(listaKucLjub.get(i));
                        }


                    }

                    else if(one.equalsIgnoreCase("svejedno") && two.equalsIgnoreCase("stariji")  && 2024 - (listaKucLjub.get(i).getGodRodjenja()) >= 5){

                        if (listaKucLjub.get(i) instanceof Pas) {
                            listaKucLjubNovo.add(listaKucLjub.get(i));
                        }

                        else if (listaKucLjub.get(i) instanceof Macka) {
                            listaKucLjubNovo.add(listaKucLjub.get(i));
                        }

                    }

                    else if(one.equalsIgnoreCase("pas") && two.equalsIgnoreCase("mladi") && listaKucLjub.get(i) instanceof Pas && 2024 - listaKucLjub.get(i).getGodRodjenja()<5 ){
                        listaKucLjubNovo.add(listaKucLjub.get(i));

                    }

                    else if(one.equalsIgnoreCase("pas") && two.equalsIgnoreCase("stariji") && listaKucLjub.get(i) instanceof Pas && 2024 - listaKucLjub.get(i).getGodRodjenja()>=5){

                        listaKucLjubNovo.add(listaKucLjub.get(i));

                    }

                    else if(one.equalsIgnoreCase("macka") && two.equalsIgnoreCase("mladi") && listaKucLjub.get(i) instanceof Macka && 2024 - listaKucLjub.get(i).getGodRodjenja()<5){

                        listaKucLjubNovo.add(listaKucLjub.get(i));

                    }

                    else if(one.equalsIgnoreCase("macka") && two.equalsIgnoreCase("stariji") && listaKucLjub.get(i) instanceof Macka  && 2024 - listaKucLjub.get(i).getGodRodjenja()>=5){

                        listaKucLjubNovo.add(listaKucLjub.get(i));

                    }
                }

                if(listaKucLjubNovo.isEmpty()){

                    System.out.println("Molim Vas ponovite unos");
                    udomljavaj();

                }

                 for (int j = 0; j<listaKucLjubNovo.size();j++) {

                    if(!listaKucLjubNovo.isEmpty()) {
                        if (listaKucLjubNovo.get(j) instanceof Pas) {
                            System.out.println(j + " Pas, roden: " + listaKucLjubNovo.get(j).getGodRodjenja() + " godine");
                        }
                        else if (listaKucLjubNovo.get(j) instanceof Macka) {
                            System.out.println(j + " Macka, rodena: " + listaKucLjubNovo.get(j).getGodRodjenja() + " " +
                                    "godine");
                        }
                    }
                }

                Scanner th = new Scanner(System.in);
                System.out.println("Odaberite Ljubimca prema broju sa lijeve strane liste:");
                three = th.nextInt();

                veterinar.cijepi(listaKucLjubNovo.get(three));

                Vlasnik.udomi(listaKucLjubNovo.get(three));

                listaKucLjub.remove(listaKucLjubNovo.get(three));
                listaKucLjubNovo.clear();

            }

        System.out.println("Trenutno nema ljubimaca za udomiti!");

    }


}
