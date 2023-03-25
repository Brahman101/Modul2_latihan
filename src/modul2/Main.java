package modul2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");
        System.out.println("List hewan : ");
        System.out.println(hewan);

        ArrayList<String> delHewan = new ArrayList<>();
        delHewan.add("Kelinci");
        delHewan.add("Kambing");
        delHewan.add("Unta");

        System.out.println("Hewan yang akan dihapus : ");
        System.out.println(delHewan);

        ArrayList<String> updateHewan = new ArrayList<>();
        for (String warna : delHewan){
            hewan.removeIf(h -> h.equals(warna));
            updateHewan.add(warna);
        }


        System.out.println("Hewan terbaru : ");
        System.out.println(hewan);
    }
}
