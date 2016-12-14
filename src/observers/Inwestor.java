package observers;

import domain.Rekomendacja;

public class Inwestor implements IObserver{

    @Override
    public void update(Rekomendacja rek, String powiadomienie) {
        System.out.println("Inwestor otrzymuje nowe powiadomienie.");
        System.out.println(powiadomienie + " " + rek.toString());

    }
}
