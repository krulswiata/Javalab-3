public class Student {
    public String imie;
    public String nazwisko;
    public int index;
    private WydzialEnum wydzial;
    private Osoba osoba;
    boolean CzyDalejStudiuje;

    public Student(WydzialEnum wydzial, Osoba osoba) {
        this.wydzial = wydzial;
        this.osoba = osoba;
    }

    public boolean isCzyDalejStudiuje() {
        return CzyDalejStudiuje;
    }

    public void setCzyDalejStudiuje(boolean czyDalejStudiuje) {
        CzyDalejStudiuje = czyDalejStudiuje;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", index=" + index +
                ", wydzial=" + wydzial +
                ", osoba=" + osoba +
                ", CzyDalejStudiuje=" + CzyDalejStudiuje +
                '}';
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

    public WydzialEnum getWydzial() {
        return wydzial;
    }

    public void setWydzial(WydzialEnum wydzial) {
        this.wydzial = wydzial;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public Student(String imie, String nazwisko, int index, WydzialEnum wydzial, Osoba osoba) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.index = index;
        this.wydzial = wydzial;
        this.osoba = osoba;
    }

    public Student() {
    }
}