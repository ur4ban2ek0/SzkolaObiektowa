public class Main {
    public static void main(String[] args) {

        Osoba osobaJas = new Osoba("Jaś","Śliweczka",10);
//wywołuję konstruktor klasy Osoba
        System.out.println(osobaJas.getImie());
        System.out.println(osobaJas.getNazwisko());
        osobaJas.setImie("Jan");

        Osoba osobaAla = new Osoba("Ala", "Fala");
        System.out.println(osobaJas.getWiek());
        System.out.println(osobaAla.getWiek());
        Osoba osobaX = new Osoba();

        System.out.println(osobaJas);
        System.out.println("Liczba Uczniow"+Uczen.liczbaObiektow);
        Uczen uczen = new Uczen("Daniel","Nowy");
        System.out.println("Liczba Uczniow"+Uczen.liczbaObiektow);
        Uczen uczen2 = new Uczen("Daniela","Nowa");
        System.out.println("Liczba Uczniow"+Uczen.liczbaObiektow);
        Uczen uczen3 = new Uczen("Danielo","Stary");
        System.out.println(uczen3);
        System.out.println("Liczba Uczniow"+Uczen.liczbaObiektow);

        Nauczyciel nauczcielSlowik = new Nauczyciel("Marlena", "Slowik", 25, "matematyka");

    }


}