package USTPraxis.recursion;

public class AllUniquePaths {
    public static int uniquePath(int n,int m){
        if(n == 1 || m == 1) return 1;
        return uniquePath(n-1,m) + uniquePath(n,m-1);
    }
    public static void main(String[] args) {
        System.out.println(uniquePath(1,1));
        System.out.println(uniquePath(2,1));
        System.out.println(uniquePath(1,2));
        System.out.println(uniquePath(2,2));
        System.out.println(uniquePath(2,3));
        System.out.println(uniquePath(3,2));
        System.out.println(uniquePath(3,3));
    }
}
