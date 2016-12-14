package subjects;

import domain.Rekomendacja;
import domain.RekomendacjaDAO;
import observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public class SystemRekomendacji implements ISubject {

    private List<IObserver> inwestorzy;
    private List<Rekomendacja> rekomendacje;

    private RekomendacjaDAO rekomendacjaDAO;

    private Rekomendacja rekomendacja;
    private String powiadomienie;

    public SystemRekomendacji(){
        inwestorzy = new ArrayList<IObserver>();
        rekomendacjaDAO = new RekomendacjaDAO();
        rekomendacje = rekomendacjaDAO.generateRekomendacje();
    }


    @Override
    public void registerObserver(IObserver o) {
        inwestorzy.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        inwestorzy.remove(o);

    }

    @Override
    public void notifyObservers() {
        for(IObserver observers : inwestorzy)
            observers.update(rekomendacja, powiadomienie);
    }

    public void dodajNowaRekomendacje(Rekomendacja rek){
        rekomendacja = rek;
        powiadomienie = "Nowa rekomendacja.";
        rekomendacje.add(rek);
        notifyObservers();
    }

    public void wyswietlRekomendacje(){
        //System.out.println(rekomendacje);
        for(Rekomendacja rek : rekomendacje){
            System.out.println(rek);
        }
    }
}
