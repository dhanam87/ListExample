import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
class ListExample{
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>();
        a1.add("apple");
        a1.add("banana");
         a1.add("orange");
        a1.add("manago");
         a1.add("null");
        a1.add("null");

        a1.set(1, "graphes");
        a1.remove(3);
        a1.remove("banana");
        // a1.clear();

        List<String> a2 = new LinkedList<>();
        a2.add("dhana");
        a2.add("lakshu");
        a2.add("subha");

        for(String s :a2){
            a1.add(s);
        }
        System.out.println(a1);
        // System.out.println(a2);
       



    }
}
