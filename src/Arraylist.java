import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args){
       //Deklarasi Arraylist
       ArrayList<Integer> AngkaSaya = new ArrayList<>();
       AngkaSaya.add(0,2); //input Value 2 ke dalam index 0
        AngkaSaya.add(1,3);//input Value 3 ke dalam index 1

        System.out.println("index 0 Valuenya adalah : " + AngkaSaya.get(0));
        System.out.println("index 1 Valuenya adalah " + AngkaSaya.get(1));
    }
}
