import java.util.*;
public class Array{
    public static void main(String args[]){
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt(); //Phy
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); //math
        System.out.println("Physics : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);
        System.out.println("Math : " + marks[2]);
    }
}