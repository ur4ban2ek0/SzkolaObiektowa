public sealed class Nauczyciel extends Osoba implements Dyzurny{

    //sealed to znaczy ograniczenie dziedziczenia
    //permit jaka klasa moze dziedziczyc
    private String przedemiot;

    public Nauczyciel(String imie, String nazwisko, int wiek, String przedemiot) {
        super(imie, nazwisko, wiek);
        this.przedemiot = przedemiot;
    }

    @Override
    public String toString() {
        return "Nauczyciel{" +
                " imie "+ getImie()+
                "przedemiot='" + przedemiot + '\'' +
                '}' + super.toString();
    }

    @Override
    public void wykonajDyzur() {
        System.out.println("Spacer po korytarzu");
    }
}
