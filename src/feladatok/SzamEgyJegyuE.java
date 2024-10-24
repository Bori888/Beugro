package feladatok;

public class SzamEgyJegyuE {

    public static void main(String[] args) {

        int szam = 10;
        boolean tobbJegyu = szam > 9;
        String eredmeny = " ";
        if (tobbJegyu) {
            eredmeny = " több jegyű";

        } else {
            eredmeny = " egy jegyű";

        }
        System.out.println("A vizsgált szám: " + szam + eredmeny);
        //ternalis operatorral
        eredmeny = tobbJegyu ? " több jegyű" : " egy jegyű";

        System.out.println("A vizsgált szám: " + szam + eredmeny);

    }

}
