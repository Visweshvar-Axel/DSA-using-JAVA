package USTPraxis.recursion;

public class PartitionProblem {
    public static int partition(int n,int m){
        if (n == 0) return 1;
        else if (m == 0 || n < 0) return 0;
        return partition(n-m,m)+partition(n,m-1);
    }
    public static void main(String[] args) {
        System.out.println(partition(1,1));
        System.out.println(partition(2,1));
        System.out.println(partition(1,2));
        System.out.println(partition(2,2));
        System.out.println(partition(2,3));
        System.out.println(partition(3,2));
        System.out.println(partition(3,3));
        System.out.println(partition(7,4));
    }
}
