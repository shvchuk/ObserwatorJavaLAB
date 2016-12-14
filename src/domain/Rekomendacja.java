package domain;

public class Rekomendacja {

    private String spolka;
    private String dataWydania;
    private double cenaZDniaWydania;
    private double cenaDocelowa;
    private String rodzajRekomendacji;
    private String instytucja;
    public int rekomendacjaID;

    private static int COUNTER;

    public Rekomendacja(String spolka, String dataWydania, double cenaZDniaWydania, double cenaDocelowa,
                        String rodzajRekomendacji, String instytucja) {
        this.spolka = spolka;
        this.dataWydania = dataWydania;
        this.cenaZDniaWydania = cenaZDniaWydania;
        this.cenaDocelowa = cenaDocelowa;
        this.rodzajRekomendacji = rodzajRekomendacji;
        this.instytucja = instytucja;

        rekomendacjaID = ++COUNTER;
    }

    public String toString(){
        return "Nr ID rekomendacji: " + rekomendacjaID + ". Rekomendacja " + rodzajRekomendacji + " dla spółki " +
                spolka  + ", wydana w dniu " + dataWydania + " " + "przez instytucję " + instytucja + " z ceną docelową -> " + cenaDocelowa + " zł";
    }

    public String getSpolka(){ return spolka;}

}
