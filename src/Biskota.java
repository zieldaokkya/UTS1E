import java.util.ArrayList;
import java.util.List;

public class Biskota {
    public static void main(String[] args) {
        List<int[]> stopGo = new ArrayList<>();
        stopGo.add(new int[] {10,0});
        stopGo.add(new int[] {3,5});
        stopGo.add(new int[] {2,5});
        System.out.println("Jumlah penumpang bis kota : " + getPassenger(stopGo));

    }
    public static int getPassenger(List<int[]> bisKota) {
        int passanger = 0;
        for (int[] list : bisKota) {
            int jml = 0;
            for (int i = 0; i < list.length; i++) {
                jml = list[0] - list[1];


            }
            passanger = passanger + jml;
        }
        return passanger;
    }
}


