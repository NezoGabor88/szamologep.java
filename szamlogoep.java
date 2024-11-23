import java.util.Scanner;

public class szamologep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg az első számot: ");
        double elsoSzam = scanner.nextDouble();

        System.out.println("Add meg a második számot: ");
        double masodikSzam = scanner.nextDouble();



        System.out.println("Egyszerű Számológép");
        System.out.println("Válassz egy műveletet:");
        System.out.println("1. Összeadás (+)");
        System.out.println("2. Kivonás (-)");
        System.out.println("3. Szorzás (*)");
        System.out.println("4. Osztás (/)");

        int valasztas = scanner.nextInt();

        

        double eredmeny = 0;
        boolean ervenyes = true;

        switch (valasztas) {
            case 1:
                eredmeny = elsoSzam + masodikSzam;
                break;
            case 2:
                eredmeny = elsoSzam - masodikSzam;
                break;
            case 3:
                eredmeny = elsoSzam * masodikSzam;
                break;
            case 4:
                if (masodikSzam != 0) {
                    eredmeny = elsoSzam / masodikSzam;
                } else {
                    System.out.println("Hiba: Nullával nem lehet osztani!");
                    ervenyes = false;
                }
                break;
            default:
                System.out.println("Hibás választás!");
                ervenyes = false;
        }

        if (ervenyes) {
            System.out.println("Az eredmény: " + eredmeny);
        }

        scanner.close();
    }
}
