public  class Uczen extends Osoba implements Dyzurny{
    //poniewaz uczen ma te same wlasnosci co Osoba to będzie klasą potomną klasy Osoba
    //klasa Osoba będzie klasą bazową

    private int nr_ewidencyjny;
    static  int liczbaObiektow;

    public Uczen(String imie, String nazwisko, int wiek, int nr_ewidencyjny) {
        super(imie, nazwisko, wiek);
        //wywołanie konstruktora klasy bazowej
        this.nr_ewidencyjny = nr_ewidencyjny;
        liczbaObiektow++;
    }

    public Uczen(String imie, String nazwisko) {
        super(imie, nazwisko);
        liczbaObiektow++;
        nr_ewidencyjny = liczbaObiektow;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                " imie "+getImie()+
                " nazwisko "+getNazwisko()+
                "nr_ewidencyjny=" + nr_ewidencyjny +
                '}';
    }

    @Override
    public void wykonajDyzur() {
        System.out.println("Zmazuje tablice");
    }
}