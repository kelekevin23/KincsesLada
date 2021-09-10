package kincseslada;

import java.util.Scanner;

public class KincsesLada {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        indito();
    }

    private static void indito() {
        Lada aLada = new Lada("Arany", "Én rejtem a kincset.", 1);
        Lada eLada = new Lada("Ezüst", "Nem én rejtem a kincset.", 2);
        Lada bLada = new Lada("Bronz", "Az aranyláda hazudik.", 3);

        System.out.println(aLada.toString());
        System.out.println(eLada.toString());
        System.out.println(bLada.toString());

        int hanyadikLada = 0;
        while (hanyadikLada < 1 || hanyadikLada > 3) {
            System.out.print("\nSzerinted hanyadik ládában van a kincs? ");
            hanyadikLada = sc.nextInt();
        }

        if (hanyadikLada != eLada.getLadaSzam()) {
            System.out.println("Sajnos rosszul gondolkodtál, a(z) "+eLada.getLadaNev()+"láda tartalmazza a kincset!");
        } else {
            System.out.println("Eltaláltad");
        }
    }

}
