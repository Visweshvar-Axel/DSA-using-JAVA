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
        System.out.println("Start: "+mainList);
        mainList.addAll(4,tempList);
        System.out.println("addAll "+mainList);
        mainList.remove(mainList.size()-1);
        System.out.println("Removed last element"+mainList);
        mainList.set(5,10);
        System.out.println("Set"+mainList);
        System.out.println("contains"+mainList.contains(10));
        System.out.println("get"+mainList.get(5));
    }
}
