import java.util.*;
public class JustPracticing{
    public static void main(String[] args){
        char ch = {'a', 'b', 'd', 'k', 'p', 's'};
        char target = 'm';
        char ans = ceiling(ch, target);
        System.out.println(ans);
    }
    static char ceiling(char ch, char target){
        int start = 0;
        int end = ch.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target  ch[mid]){
                return 
            }
        }
    }
}