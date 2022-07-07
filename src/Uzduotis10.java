import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Uzduotis10 {
    public static void main(String[] args) {
        ArrayList<Integer> isristiKauliukai = new ArrayList<>();
        isristiKauliukai.add(3);
        isristiKauliukai.add(4);
        isristiKauliukai.add(1);
        isristiKauliukai.add(1);
        isristiKauliukai.add(2);
        isristiKauliukai.add(6);
        isristiKauliukai.add(1);
        isristiKauliukai.add(4);
        isristiKauliukai.add(3);

        int[] kiekIskrito = kiekIskritoKokiu(isristiKauliukai);
        System.out.println("kiekIskrito = " + Arrays.toString(kiekIskrito));


        HashMap<Integer, Integer> daznumoMapas = kiekKokiuIskritoMap(isristiKauliukai);
        System.out.println("daznumoMapas = " + daznumoMapas);
    }

    public static int[] kiekIskritoKokiu(ArrayList<Integer> isristiKauliukai) {
        int[] daznumoMasyvas = new int[6];
        for (Integer kauliukas : isristiKauliukai) {
            daznumoMasyvas[kauliukas - 1]++;
        }
        return daznumoMasyvas;
    }


    public static HashMap<Integer, Integer> kiekKokiuIskritoMap(ArrayList<Integer> isristiKauliukai) {
        HashMap<Integer, Integer> daznumoMapas = new HashMap<>();
        for (Integer kauliukas : isristiKauliukai) {
         //   Integer kauliukoDaznis = daznumoMapas.get(kauliukas);
            if (daznumoMapas.containsKey(kauliukas)) {
                daznumoMapas.put(kauliukas, daznumoMapas.get(kauliukas) + 1);
            //    daznumoMapas.put(kauliukas, kauliukoDaznis + 1);

            }
            else {
                daznumoMapas.put(kauliukas, 1);
            }
        }
        return daznumoMapas;
    }
}
