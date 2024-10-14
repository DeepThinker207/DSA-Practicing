import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExampleSimple {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> listA = new ArrayList<>(3);
        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(2);
        listB.add(3);
        listB.add(4);
        listB.add(5);

        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(2);
        listC.add(9);


;
        //initialisation

        // for(int i=0; i<3; i++){
        //     list.add(new ArrayList<>());
        // }

        // //add elements
        // for(int i=0; i<3; i++){
        //     for(int j=0; j<3; j++){
        //         list.get(i).add(sc.nextInt());
        //     }
        // }
        listA.add(listB);
        listA.add(listC);


        System.out.println(listA);


    }
    
}
