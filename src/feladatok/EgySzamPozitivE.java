package feladatok;

public class EgySzamPozitivE {

    public static void main(String[] args) {
        int szam = -68446556;
        boolean pozitiv = szam > 0;
        String eredmeny = " ";

        if (pozitiv) {
            eredmeny = "pozitiv";

        } else {
            eredmeny = " nem pozitív";

        }
        System.out.println("A vizsgált szám: " + szam + eredmeny);

        // vagy ternális operátorral ugyanez :ternális operátor
        //nem lehet kihagyni az else áget és nem bővithető
        eredmeny = pozitiv ? " pozitív" : " nem pozitív";

        System.out.println("A vizsgált szám: " + szam + eredmeny);

    }

}
