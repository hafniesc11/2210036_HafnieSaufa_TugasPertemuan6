/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer B

Soal 
buat class main untuk menguji memasukkan panjang dan lebar untuk menghitung luas dan keliling persegi Panjang.
 */

package PersegiPanjang;

public class PersegiPanjang {
    int panjang;
    int lebar;

    public PersegiPanjang(int panjangBaru, int lebarBaru) {
        panjang = panjangBaru;
        lebar = lebarBaru;
    }

    public int getLuas() {
        return panjang * lebar;
    }

    public int getKeliling() {
        return 2 * (panjang + lebar);
    }

//    // Setter untuk panjang
//    public void setPanjang(int panjangBaru) {
//        panjang = panjangBaru;
//    }
//
//    // Setter untuk lebar
//    public void setLebar(int lebarBaru) {
//        lebar = lebarBaru;
//    }
}


