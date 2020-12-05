package object;

public class TigaA {
    String nama;
    int nim;
    int kelas;

    // Ini merupakan konstruktor dari kelas hewan.konstruktor adalah method yang pertama kali dijalankan ketika object diciptakan.
    public TigaA(String namaTigaA) {
        nama = namaTigaA;
    }
    public void nimTigaA(int nimTigaA) {
        nim = nimTigaA;
    }
    public void kelasTigaA(int kelasTigaA) {
        kelas = kelasTigaA;
    }
 
    public void cetakTigaA() {
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nim Mahasiswa : " + nim);
        System.out.println("Kelas Mahasiswa: " + kelas);
    }
}
