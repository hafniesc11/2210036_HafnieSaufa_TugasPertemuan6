/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer 4B
*/

package PersegiPanjang;

public class ObjekPersegiPanjang {
    public static void main(String[] args) {
        PersegiPanjang persegi1 = new PersegiPanjang(1, 1);
        PersegiPanjang persegi2 = new PersegiPanjang(30, 40);
        PersegiPanjang persegi3 = new PersegiPanjang(25, 35);

        System.out.println("Persegi Panjang 1:");
        System.out.println("Luas: " + persegi1.getLuas());
        System.out.println("Keliling: " + persegi1.getKeliling());
        System.out.println();

        System.out.println("Persegi Panjang 2:");
        System.out.println("Luas: " + persegi2.getLuas());
        System.out.println("Keliling: " + persegi2.getKeliling());
        System.out.println();

        System.out.println("Persegi Panjang 3:");
        System.out.println("Luas: " + persegi3.getLuas());
        System.out.println("Keliling: " + persegi3.getKeliling());
        System.out.println();
    }
}

    

