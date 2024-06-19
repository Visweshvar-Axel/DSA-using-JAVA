package livesession.L14_16;

import java.util.List;
import java.util.Vector;

public class vectorExample {
    public static void main(String[] args) {
        List<Integer> mainList = new Vector<>();
        mainList.add(1);
        mainList.add(2);
        mainList.add(3);
        mainList.add(4);
        List<Integer> tempList = new Vector<>();
        tempList.add(5);
        tempList.add(6);
        tempList.add(7);
        System.out.println(mainList);
        mainList.addAll(4,tempList);
        System.out.println(mainList);

    }
}
