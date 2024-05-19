package lesson3.hashtable;

public class MultiplicationHashing {
    private Double k;
    public MultiplicationHashing(Double k){ this.k = k;}
    public int hashKey(Integer key, int tableSize){return (int) (tableSize * (k * key % 1));}

    public static void main(String[] args) {
        MultiplicationHashing multiplicationHashing = new MultiplicationHashing((Math.sqrt(5)-1)/2);
        System.out.println(multiplicationHashing.hashKey(12342342,1000));
        System.out.println(multiplicationHashing.hashKey(23545646,1000));
        System.out.println(multiplicationHashing.hashKey(87934653,1000));
        System.out.println(multiplicationHashing.hashKey(25464566,1000));
    }
}
