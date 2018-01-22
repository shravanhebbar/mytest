import java.util.ArrayList;
import java.util.*;


public class listcondition {
    public static void main(String[] args) {
        System.out.println("Demonstration of removeIf");
        List<String> l1 = createList();
        // remove all items which contains an "x"
        l1.removeIf(s-> s.contains("X"));
        l1.forEach(s->System.out.println(s));
    }

    private static List<String>  createList() {
        //List<String> anotherList = new ArrayList<>();
     
        return Arrays.asList("iPhone", "Ubuntu", "Android",
                "Mac OS X");   }
}

