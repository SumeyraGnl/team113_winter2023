package day41_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList {
    public static void main(String[] args) {

        /*
        List data turunde bir LinkedList olusturalim
         */

        List<String> harfler = new LinkedList<>();
        harfler.add("H");
        harfler.add("K");
        harfler.add("M");
        harfler.add("L");

        System.out.println(harfler);
        harfler.add("B");
        System.out.println(harfler);

        harfler.add(3,"T");
        System.out.println(harfler);

        harfler.set(3,"R");
        System.out.println(harfler);

        List<String> semboller = new LinkedList<>();

        semboller.add("*");
        semboller.add("B");
        semboller.add("%");
        semboller.add("&");;

        System.out.println(semboller);//[*, B, %, &]   -  [H, K, M, R, L, B]
        System.out.println(harfler.retainAll(semboller)); // true ==>ortak eleman var old.icin true doner.
        System.out.println(semboller); // [*, B, %, &]
        System.out.println(harfler);  // [B] ==>ortak elemani yazdirir geriye kalani siler
        harfler.addAll(semboller);
        System.out.println(harfler); // [B, *, B, %, &]   semboller -->[*, B, %, &]
        System.out.println(harfler.removeAll(semboller));  // true ==> harfler'de sembolleri sil.tek tek kontrol eder siler
        System.out.println(harfler); // []


    }
}
