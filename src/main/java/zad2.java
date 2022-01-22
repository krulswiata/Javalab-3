public class zad2
{
    public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();
    s1.setImie("Mikolaj");
    s2.setImie("Szymon");
    s3.setImie("Michal");
    s1.setNazwisko("Gajewski");
    s2.setNazwisko("Krajewski");
    s3.setNazwisko("Junka");
    s1.setIndex(60471);
    s2.setIndex(17302);
    s3.setIndex(22423);
    s1.setCzyDalejStudiuje(true);
    s2.setCzyDalejStudiuje(false);
    s3.setCzyDalejStudiuje(true);
        Student[] tab = new Student[3];
        tab[0] = s1;
        tab[1] = s2;
        tab[2] = s3;
        for (int i = 0; i <= tab.length-1; i++){
            System.out.println("Student"+(i+1)+ " Imię: " +tab[i].imie + " Nazwisko: " +tab[i].nazwisko + " index: " + tab[i].index + " CzyDalejStudiuje: " + tab[i].CzyDalejStudiuje);
        }

    }
}

