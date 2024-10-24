package feladatok;

public class EgySzamPozitivE2 {

    public static void main(String[] args) {
        int szam = 0;
        boolean pozitiv = szam > 0;
        String eredmeny = " ";

        if (pozitiv) {
            eredmeny = "pozitiv";

        } else if (szam == 0) {
            eredmeny = " semleges ";
        } else {
            eredmeny = " nem pozitív";

        }
        System.out.println("A vizsgált szám: " + szam + " ami" + eredmeny);

    }

}
