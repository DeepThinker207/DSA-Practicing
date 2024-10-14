import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        //String str = "ab";
        System.out.println(subseq("","ab"));
     }

     static ArrayList<String> subseq(String after, String before){
        if(before.isEmpty()){
            ArrayList<String> List = new ArrayList<>();
            List.add(after);
            return List;
        }
        char ch = before.charAt(0);
        ArrayList<String> first = subseq(after + ch, before.substring(1));
        ArrayList<String> second = subseq(after + (ch + 0), before.substring(1));
        ArrayList<String> third = subseq(after, before.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }

}
