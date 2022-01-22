public class Osoba {
    private String imie;
    private String nazwisko;
    private int index;

    public Osoba(String imie, String nazwisko, int index) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.index = index;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Osoba() {

    }
    public static String osobaInfo(Osoba osoba){
        return osoba.getImie() + osoba.getNazwisko() + osoba.getIndex();
    }

}