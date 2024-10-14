import java.util.*;
public class LoopInJava {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int SN = sc.nextInt();
        for(int num=1; num<=5; num+=1){
            int a = SN*num;
            System.out.println(a); 
        }
        //System.out.println(a);

        
    }
}
