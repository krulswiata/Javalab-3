import java.util.Scanner;

public class zad1
{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean bool = true;
        while(bool){

            System.out.println("Podaj znak: ");
            int i = scanner.nextInt();
            switch (i){
                case 1:
                    System.out.println(LiczbyEnum.RAZ);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;
                case 2:
                    System.out.println(LiczbyEnum.DWA);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;
                case 3:
                    System.out.println(LiczbyEnum.TRZY);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;
                case 4:
                    System.out.println(LiczbyEnum.CZTERY);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;
                case 5:
                    System.out.println(LiczbyEnum.PIĘĆ);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;
                case 6:
                    System.out.println(LiczbyEnum.SZEŚĆ);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;
                case 0:
                    bool = false;
                    System.out.println(StatusEnum.KONIEC);

            }
        }

    }
}


enum LiczbyEnum{
    RAZ, DWA, TRZY, CZTERY, PIĘĆ, SZEŚĆ;
}

enum StatusEnum{
    KONTYNUUJEMY, KONIEC;
}

