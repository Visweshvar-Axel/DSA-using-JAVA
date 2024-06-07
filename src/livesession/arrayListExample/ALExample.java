package livesession.arrayListExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ALExample {
    public static void main(String[] args) {
        List<String> al= new ArrayList<>();
        al.add("Viswa");
        al.add("Sarankumar");
        al.add("Axel");
        al.add("janani");
        al.add("jeswin");
        for (Iterator<String> it = al.iterator(); it.hasNext(); ) {
            System.out.print(it.next()+", ");
        }
    }
}
