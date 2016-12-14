package client;

import domain.Rekomendacja;
import observers.IObserver;
import observers.Inwestor;
import subjects.SystemRekomendacji;

public class MojaAplikacja {

    public static void main(String[] args) {

        IObserver inwestor = new Inwestor();

        SystemRekomendacji sys = new SystemRekomendacji();

        sys.registerObserver(inwestor);

        Rekomendacja orange = new Rekomendacja("ORANGE POLSKA SA", "2016-12-05", 5.17, 5.00, "Trzymaj", "HSBC " +
                "Securities");

        sys.dodajNowaRekomendacje(orange);

        System.out.println("Nowa rekomendacja dodana do bazy.");
        System.out.println("Wszystkie rekomendacje w systemie:");

        sys.wyswietlRekomendacje();


    }
}
