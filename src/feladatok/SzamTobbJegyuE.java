package feladatok;

public class SzamTobbJegyuE {

    public static void main(String[] args) {

        int szam = 10441;

        String eredmeny = " ";
        if (szam < 10) {
            eredmeny = " egy jegyű";

        } else if (szam < 100) {
            eredmeny = " két jegyű";
        } else if (szam < 1000) {
            eredmeny = " 3 jegyű";
        } else {
            eredmeny = " több jegyű";
        }

        System.out.println("A vizsgált szám: " + szam + eredmeny);

    }

}
