package day37_throw;

public class C02_ThrowKeyword {
    public static void main(String[] args) {

        String a = null;
        String b = "";

        try {
            try {

                int c = a.length() + b.length();

                // BU ARADA KOD OLSAYDI HICBIRI CALISMAZDI.

                // a.length(), NullPointerException firlatir.
                // catch (NullPointerException e) bulana kadar aradaki hicbir kod calismaz.


            } catch (NullPointerException e) {
                if (b.length() == 0)
                    throw new RuntimeException(e);
            }
            System.out.println("Null Point vardir. Islem yapilamaz");

        } catch (RuntimeException e) {

            System.out.println("Throw Keyword calisti");
        }
    }
}
