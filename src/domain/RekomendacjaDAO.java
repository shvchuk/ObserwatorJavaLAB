package domain;

import java.util.ArrayList;
import java.util.List;

public class RekomendacjaDAO {

    Rekomendacja rek1 = new Rekomendacja("MEDICALGORITHMICS SA", "2016-12-09", 287.00, 354.00, "Kupuj", "Trigon DM");
    Rekomendacja rek2 = new Rekomendacja("BRIJU SA", "2016-12-06", 29.68, 37.80, "Kupuj", "BPS DM");

    List<Rekomendacja> rekomendacje;

    public List<Rekomendacja> generateRekomendacje(){

        rekomendacje = new ArrayList<Rekomendacja>();

        rekomendacje.add(rek1);
        rekomendacje.add(rek2);

        return rekomendacje;
    }

    public void addRekomendacja(Rekomendacja rek) {rekomendacje.add(rek);}

}
