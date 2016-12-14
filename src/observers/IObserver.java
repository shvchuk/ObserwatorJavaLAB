package observers;

import domain.Rekomendacja;

public interface IObserver {

    public void update(Rekomendacja rek, String powiadomienie);
}
