import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Punkt punktA = new Punkt(7);
        punktA.toString();
        new Punkt(6,2,9);
        punktA.toString();
        punktA.setX(4);
        punktA.setY(8);
        punktA.toString();

        System.out.println(punktA.getX());
        System.out.println(punktA.getY());
        System.out.println(punktA.getX()+punktA.getY());
        System.out.println(punktA.getX()-punktA.getY());
        Osoba osoba1 = new Osoba("Mikolaj", "Gajewski", 60471);
        Osoba osoba2 = new Osoba("Michal", "Homa", 60352);
        Osoba osoba3 = new Osoba("Miroslaw", "Czubat", 32535);
        Osoba osoba4 = new Osoba("Mariusz", "Wiejak", 53363);
        Osoba osoba5 = new Osoba("Zbigniew", "Dobosz", 99385);

        Student s1 = new Student(WydzialEnum.humanistyczny, osoba1);
        Student s2 = new Student(WydzialEnum.matematyczny, osoba2);
        Student s3 = new Student(WydzialEnum.matematyczny, osoba3);
        Student s4 = new Student(WydzialEnum.medyczny, osoba4);
        Student s5 = new Student(WydzialEnum.sportowy, osoba5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        for (Student student: studentList
             ) {
            System.out.println(student.toString());

        }


    }
}
