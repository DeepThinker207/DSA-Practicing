import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample{
    public static void main(String [] args){

        //Systex of ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(67);
        list.add(59);
        list.add(35);
        list.add(28);
        list.add(70);
        list.add(87);
        System.out.println(list);
        if(list.contains(68)){
            System.out.println(true);
        }else if(list.get(1) == 59){
            System.out.println(list.get(1));
        }else{
            System.out.println(89);
        }
    }
}