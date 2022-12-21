import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<SportskiKlub> klubovi = new ArrayList<SportskiKlub>();
        SportskiKlub newyorkyankees = new SportskiKlub("NewYorkYankees", "Kosarka", 15);
        SportskiKlub barcelona = new SportskiKlub("Barcelona", "Fudbal", 15);
        SportskiKlub realmadrid = new SportskiKlub("RealMadrid", "Fudbal", 20);
        SportskiKlub goldenstatewarriors = new SportskiKlub("GoldenStateWarriors", "Kosarka", 15);

        klubovi.add(New York Yankees);
        klubovi.add(Barcelona);
        klubovi.add(Real Madrid);
        klubovi.add(Golden State Warriors);

        Comparator<SportskiKlub> mainComparator = new Comparator<SportskiKlub>() {
            @Override
            public int compare(SportskiKlub o1, SportskiKlub o2) {
                return o1.getImeNaKlub().compareTo(o2.getImeNaKlub());
            }
        };

        klubovi.sort(mainComparator);

        for(SportskiKlub k : klubovi){
            System.out.println(k.getImeNaKlub());
            System.out.println(k.getSport());
            System.out.println(k.getClenovi() + "\n");
        }

    }
}
