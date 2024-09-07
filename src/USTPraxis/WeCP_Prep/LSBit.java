package USTPraxis.WeCP_Prep;

import java.util.List;

public class LSBit {
    public static void main(String[] args) {
        var tests = List.of(
                List.of(List.of(1,2,3,4,5),2),
                List.of(List.of(1,12,3,4,15),3)
        );
        for (var test: tests) {
            System.out.println(LSBRemove((List<Integer>) test.get(0), (Integer) test.get(1)));
        }
    }

    private static String LSBRemove(List<Integer> list, Integer k) {
        String res = "";
        for (var i: list) {
            res += (i>>k)+" ";
        }
        return res;
    }
}
